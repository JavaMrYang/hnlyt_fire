package com.hdkj.lyt.hnlyt_fire.service.impl;


import com.hdkj.lyt.hnlyt_fire.model.FireUploadTable;
import com.hdkj.lyt.hnlyt_fire.repository.FireUpLoadTableRepository;
import com.hdkj.lyt.hnlyt_fire.service.FireUploadTableService;
import com.hdkj.lyt.hnlyt_fire.util.Contants;
import com.hdkj.lyt.hnlyt_fire.util.StringUtil;
import com.hdkj.lyt.hnlyt_fire.util.ly.ObjectUtil;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class FireUploadTableServiceImpl implements FireUploadTableService {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private FireUpLoadTableRepository tbFireUpLoadTableRepository;

    @Override
    public FireUploadTable save(FireUploadTable tbFireUploadTable) {
        return tbFireUpLoadTableRepository.save(tbFireUploadTable);
    }

    @Override
    public void updateStatusById(String status, Integer id) {
        tbFireUpLoadTableRepository.updateStatusById(status,id);
    }

    @Override
    public List<Map> getFireUploagLine1(Integer type) {
        List<Map> list=null;
        if(type==0){
            String startTime = StringUtil.getCurrentMothMinDay();
            String endTime = StringUtil.getCurrentMothMaxDay();
            list=tbFireUpLoadTableRepository.getFireUploagLine(startTime,endTime);
        }else{
            String startTime = StringUtil.getCurrentYear()+"-01-01";
            String endTime = StringUtil.getCurrentYear()+"-12-31";
            list=tbFireUpLoadTableRepository.getFireUploagLine(startTime,endTime);
        }

        return list;
    }

    @Override
    public FireUploadTable findByHotId(String hotId) {
        return tbFireUpLoadTableRepository.findByHotId(hotId);
    }

    @Override
    public void deleteById(Integer id) {
        tbFireUpLoadTableRepository.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Page<Map> findPageByCondition(String fireLevel, String fireKind, String fireArea,String fireAreaTown,String startTime,String endTime,String village,Integer pageNo) {
        Pageable pageable=new PageRequest(pageNo,Contants.PAGE_SIZE);
        StringBuilder hql=new StringBuilder();
        hql.append("select a.id,a.fireArea,a.fireStatus,a.creactTime,a.fireLeve,a.fireKind,a.fireMj,b.phone,latlngs,b.name from tb_FireUploadTable a join tb_User b on a.userName=b.name where 1=1 ");
        StringBuilder condition=new StringBuilder();
        if(!StringUtils.isBlank(endTime)){
            condition.append("and createDate<='").append(endTime).append("' ");
        }
        if(!StringUtils.isBlank(startTime)){
            condition.append("and createDate>='").append(startTime).append("' ");
        }
        if (!StringUtils.isBlank(fireLevel)){
            condition.append("and fireLeve=").append(fireLevel).append(" ");
        }
        if (!StringUtils.isBlank(fireKind)){
            condition.append("and fireKind=").append(fireKind).append(" ");
        }
        if (!StringUtils.isBlank(fireArea)){
            condition.append("and fireArea='").append(fireArea).append("' ");
        }
        if (!StringUtils.isBlank(fireAreaTown)){
            condition.append("and fireAreaTown='").append(fireAreaTown).append("' ");
        }
        if (!StringUtils.isBlank(village)) {
            condition.append("and village='").append(village).append("' ");
        }
        hql.append(condition);
        Session session = (Session) em.getDelegate();
        org.hibernate.Query q = session.createSQLQuery(hql.toString());
        List<Map> totalCount = q.list();
        q.setFirstResult(pageable.getPageSize() * (pageable.getPageNumber() - 1));
        q.setMaxResults(pageable.getPageSize());
        String[] args={"id","fireArea","fireStatus","creactTime","fireLeve","fireKind","fireMj","phone","latlngs","name"};
        List<Map> pageList = ObjectUtil.listToListMap(q.getResultList(),args);

        return new PageImpl<Map>(pageList,pageable,totalCount.size());
    }

    @Override
    public Page<Map> findAssessPageByCondition(int pageNo, FireUploadTable fireUploadTable, String beginTime, String endTime, String fireId) {
        Pageable pageable=new PageRequest(pageNo,Contants.PAGE_SIZE, Sort.Direction.DESC,"createDate");
        Page pageList=tbFireUpLoadTableRepository.findAll(new Specification<FireUploadTable>() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder cb) {
                List<Predicate> predicates=new ArrayList<>();
                if(fireUploadTable.getFireArea()!=null&&!"".equals(fireUploadTable.getFireArea())){
                    predicates.add(cb.like(root.get("fireArea"),fireUploadTable.getFireArea()));
                }
                if(fireUploadTable.getFireAreaTown()!=null&&!"".equals(fireUploadTable.getFireAreaTown())){
                    predicates.add(cb.like(root.get("fireAreaTown"),fireUploadTable.getFireAreaTown()));
                }
                if(fireUploadTable.getVillage()!=null&&!"".equals(fireUploadTable.getVillage())){
                    predicates.add(cb.like(root.get("village"),fireUploadTable.getVillage()));
                }
                if(!StringUtils.isBlank(beginTime)){
                    predicates.add(cb.greaterThanOrEqualTo(root.get("creactTime"),beginTime));
                }
                if(!StringUtils.isBlank(endTime)){
                    predicates.add(cb.lessThanOrEqualTo(root.get("creactTime"),endTime));
                }
                if(!StringUtils.isBlank(fireUploadTable.getFireStatus())){
                    predicates.add(cb.equal(root.get("fireStatus"),fireUploadTable.getFireStatus()));
                }
                if(!StringUtils.isBlank(fireUploadTable.getIsAssess())){
                    predicates.add(cb.equal(root.get("isAssess"),fireUploadTable.getIsAssess()));
                }
                if(!StringUtils.isBlank(fireId)){
                    predicates.add(cb.like(root.get("id"),fireId));
                }
                query.where(predicates.toArray(new Predicate[predicates.size()]));
                return null;
            }
        },pageable);
        return pageList;
    }

    private List<Map> mergeData(List<Map> list){
        List<Map> resultList=new ArrayList<>();
       List<Map> sMap=list;
       Map map=sMap.get(0);
       String createDate=map.get("createDate").toString();
       for(int i=0,length=list.size();i<length;i++){
           int sum=0;
           Map cMap=list.get(i);
           if(createDate.equals(cMap.get("createDate"))){
               sum+=Integer.parseInt(cMap.get("num").toString());

           }
     }
        return resultList;
    }
}
