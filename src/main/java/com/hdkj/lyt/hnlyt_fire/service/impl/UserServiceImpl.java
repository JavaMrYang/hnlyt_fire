package com.hdkj.lyt.hnlyt_fire.service.impl;

import com.hdkj.lyt.hnlyt_fire.model.User;
import com.hdkj.lyt.hnlyt_fire.repository.UserRepository;
import com.hdkj.lyt.hnlyt_fire.service.UserService;
import com.hdkj.lyt.hnlyt_fire.util.Contants;
import com.hdkj.lyt.hnlyt_fire.util.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public boolean login(String name, String pwd,String type) {
        boolean flag=false;
        User user=userRepository.findByNameAndStatus(name,"-1");
        if(user!=null){
           if(pwd.equals(user.getPwd())){
               if(user.getAppType().length() == 5){
                   if(StringUtil.appTypeCheck(type,user.getAppType())!=null) return true;
               }else{
                   if(type.equals(user.getAppType())) return true;
               }
           }
        }
        return flag;
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public int countUserByAppType(int appType) {
        return userRepository.countUserByAppType(appType);
    }

    @Override
    public List<User> findListByCondition(Map<String, String> params) {
        List<User> list=userRepository.findAll(new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates=new ArrayList<>();
                if(!StringUtils.isBlank(params.get("city"))){
                    predicates.add(cb.equal(root.get("city").as(String.class),params.get("city")));
                }
                if(!StringUtils.isBlank(params.get("town"))){
                    predicates.add(cb.equal(root.get("town").as(String.class),params.get("town")));
                }
                if(!StringUtils.isBlank(params.get("street"))){
                    predicates.add(cb.equal(root.get("street").as(String.class),params.get("street")));
                }
                if(!StringUtils.isBlank(params.get("phone"))){
                    predicates.add(cb.like(root.get("phone").as(String.class),params.get("phone")));
                }
                if(!StringUtils.isBlank(params.get("appType"))){
                    predicates.add(cb.equal(cb.substring(root.get("appType").as(String.class),(5-Integer.parseInt(params.get("appType"))),1),"1"));
                }
                query.where(predicates.toArray(new Predicate[predicates.size()]));
                return null;
            }
        });
        return list;
    }

    @Override
    public Page<User> findPageByAppType(String appType, Integer pageNo){
        Pageable page=new PageRequest(pageNo, Contants.PAGE_SIZE, Sort.Direction.ASC,"userLevel");
        Page<User> pageList=userRepository.findAll(new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates=new ArrayList<>();
                if(!StringUtils.isBlank(appType)){
                    Predicate p=cb.equal(root.get("appType").as(String.class),appType);
                    predicates.add(cb.or(p,cb.equal(cb.substring(root.get("appType").as(String.class),Integer.parseInt(appType)+1,1),"1")));
                }

                query.where(predicates.toArray(new Predicate[predicates.size()]));
                return null;
            }
        },page);
        return pageList;
    }

    @Override
    public String findByPhone(String phone) {
        return userRepository.findByPhone(phone);
    }

    @Override
    public User save(User user) {
        Integer userLevel=null;
        if(!StringUtils.isBlank(user.getProvince())){
            userLevel=0;
        }
        if(!StringUtils.isBlank(user.getCity())){
            userLevel=1;
        }
        if(!StringUtils.isBlank(user.getTown())){
            userLevel=2;
        }
        if(!StringUtils.isBlank(user.getStreet())){
            userLevel=3;
        }
        user.setUserLevel(userLevel);
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        if(user==null){
            return null;
        }
        if(user.getName()!=null){
            return  userRepository.save(user);
        }
        return null;
    }

    @Override
    public Page<User> findPageByCondition(String appType,User user, int pageNo) {
        Pageable page=new PageRequest(pageNo, Contants.PAGE_SIZE,Sort.Direction.DESC,"registDate");
        Page<User> pageList=userRepository.findListByCondition(appType, new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates=new ArrayList<>();
                if(!StringUtils.isBlank(user.getCity())){
                    predicates.add(cb.equal(root.get("city").as(String.class),user.getCity()));
                }
                if(!StringUtils.isBlank(user.getTown())){
                    predicates.add(cb.equal(root.get("town").as(String.class),user.getCity()));
                }
                if(!StringUtils.isBlank(user.getStreet())){
                    predicates.add(cb.equal(root.get("street").as(String.class),user.getCity()));
                }
                query.where(predicates.toArray(new Predicate[predicates.size()]));
                return null;
            }
        },page);
        return pageList;
    }

    @Override
    public void updateStatusByName(String name) {
        userRepository.updateStatusByName(name);
    }

    @Override
    public void updateAppTypeByName(String appType, String name) {
            userRepository.updateAppTypeByName(appType,name);
    }

    @Override
    public void updateValidateByName(String appType, String names) {
        StringBuilder validate = null;
        String[] name = names.split(",");
        for (int i = 0, len = name.length; i < len; i++) {
            User user = userRepository.findByName(name[i]); //先按用户名查询所在的用户
            Object obj = user.getValidate(); //获取他的用户级别
            if (obj != null) {
                validate = new StringBuilder(obj.toString());
                if (!"".equals(obj.toString())) {
                    if (obj.toString().length() < 5) {  //如果长度小于5，就代表是一位身份类型
                        validate = new StringBuilder(user.getAppType().toString());
                    } else {
                        if (appType.contains("1")) { //否则代表的多位组合类型
                            int index = appType.indexOf("1");
                            validate.replace(index, index + 1, "1"); //把他所在的身份类型替换成1
                        }
                    }
                }
            }
            userRepository.updateValidateByName(appType, name[i]);
        }
    }
    @Override
    public Page<User> findListValidateByCondition(User user,int PageNo) {
        Pageable page=new PageRequest(PageNo,Contants.PAGE_SIZE,Sort.Direction.DESC,"registDate");
        Page<User> pageList=userRepository.findListValidateByCondition(new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return null;
            }
        },page);
        return pageList;
    }

    @Override
    public List<String> getUserByGroupIdAndAppType(String groupId, int appType, String city) {
        List<String> list=userRepository.findListByGroupIdAndCodition(appType, new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates=new ArrayList<>();
                if(!StringUtils.isBlank(groupId)){
                    predicates.add(cb.like(root.get("groupId").as(String.class),"%"+groupId+"%"));
                }
                if(!StringUtils.isBlank(city)){
                    Predicate p=cb.equal(root.get("city").as(String.class),city);
                    predicates.add(cb.or(p,cb.equal(root.get("city"),"省")));
                }
                query.where(predicates.toArray(new Predicate[predicates.size()]));
                return null;
            }
        });
        return null;
    }

    @Override
    public List<String> findNameByCity(String city) {
        return userRepository.findNameByCity(city);
    }


}
