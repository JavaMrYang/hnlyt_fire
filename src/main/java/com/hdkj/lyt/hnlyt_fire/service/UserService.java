package com.hdkj.lyt.hnlyt_fire.service;

import com.hdkj.lyt.hnlyt_fire.model.User;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface UserService {
    boolean login(String name, String pwd,String type);
    User findByName(String name);
    int countUserByAppType(int appType);
    List<User> findListByCondition(final Map<String,String> params);
    Page<User> findPageByAppType(String appType, Integer pageNo);
    String findByPhone(String phone);
    @Transactional
    User save(User user);
    @Transactional
    User update(User user);
    Page<User> findPageByCondition(String appType,User user,int pageNo);
    @Transactional
    void updateStatusByName(String name);

    @Transactional
    void updateAppTypeByName(String appType,String name);

    @Transactional
    void updateValidateByName(String appType,String names);

    Page<User> findListValidateByCondition(User user,int pageNo);

    List<String> getUserByGroupIdAndAppType(String groupId,int appType,String city);

    List<String> findNameByCity(String city);
}
