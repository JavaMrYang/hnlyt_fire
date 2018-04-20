package com.hdkj.lyt.hnlyt_fire.service.impl;

import com.github.pagehelper.PageHelper;
import com.hdkj.lyt.hnlyt_fire.model.FireUploadTable;
import com.hdkj.lyt.hnlyt_fire.repository.FireUpLoadTableRepository;
import com.hdkj.lyt.hnlyt_fire.service.FireUploadTableService;
import com.hdkj.lyt.hnlyt_fire.util.Contants;
import com.hdkj.lyt.hnlyt_fire.util.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.HashMap;
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
    public Page<Map> findPageByCondition(String fireLevel, String fireKind, String fireArea,String fireAreaTown,String startTime,String endTime,Integer pageNo) {
        /*Pageable page=new PageRequest(pageNo, Contants.PAGE_SIZE);
        Page<Map> pageList=tbFireUpLoadTableRepository.findAll(new Specification<FireUploadTable>() {
            @Override
            public Predicate toPredicate(Root<FireUploadTable> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates=new ArrayList<>();
                if(!StringUtils.isBlank(endTime)){
                    predicates.add(cb.lessThanOrEqualTo(root.get("createDate"),endTime));
                }
                if(!StringUtils.isBlank(startTime)){
                    predicates.add(cb.greaterThanOrEqualTo(root.get("createDate"),startTime));
                }
                if (!StringUtils.isBlank(fireLevel)){
                    predicates.add(cb.equal(root.get("fireLeve"),fireLevel));
                }
                if (!StringUtils.isBlank(fireKind)){
                    predicates.add(cb.equal(root.get("fireKind"),fireKind));
                }
                if (!StringUtils.isBlank(fireArea)){
                    predicates.add(cb.equal(root.get("fireArea"),fireArea));
                }
                if (!StringUtils.isBlank(fireAreaTown)){
                    predicates.add(cb.equal(root.get("fireAreaTown"),fireAreaTown));
                }
                query.where(predicates.toArray(new Predicate[predicates.size()]));
                return null;
            }
        },page);*/
        com.github.pagehelper.Page<Object> page=PageHelper.startPage(1, Contants.PAGE_SIZE);
        Map paramMap=new HashMap();
        if(!StringUtils.isBlank(endTime)){
            paramMap.put("endTime",endTime);
        }
        if(!StringUtils.isBlank(startTime)){
            paramMap.put("startTime",startTime);
        }
        if (!StringUtils.isBlank(fireLevel)){
           paramMap.put("fireLevel",fireLevel);
        }
        if (!StringUtils.isBlank(fireKind)){
           paramMap.put("fireKind",fireKind);
        }
        if (!StringUtils.isBlank(fireArea)){
            paramMap.put("fireArea",fireArea);
        }
        if (!StringUtils.isBlank(fireAreaTown)){
            paramMap.put("fireAreaTown",fireAreaTown);
        }
        tbFireUpLoadTableRepository.findAll(paramMap);

        return null;
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
