package com.hdkj.lyt.hnlyt_fire.service.impl;

import com.alibaba.fastjson.JSON;
import com.hdkj.lyt.hnlyt_fire.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userService;
    @Test
    public void login() {
    }

    @Test
    public void findByName() {
        System.out.println(userService.findByName("13974867030").getName());
    }

    @Test
    public void countUserByAppType() {
        System.out.println(userService.countUserByAppType(4));
    }
    @Test
    public void findListByCondition(){
        Map<String,String> params=new HashMap<>();
        params.put("city","长沙市");
        params.put("appType","4");
        List<User> list=userService.findListByCondition(params);
        System.out.println(JSON.toJSON(list).toString());
    }
    @Test
    public void findPageByAppType(){
        Page<User> page=userService.findPageByAppType("4",1);
        System.out.println(JSON.toJSON(page.getContent()).toString());
    }

    @Test
    public void save(){
        User u=new User();
        u.setName("15705789978");
        u.setPhone("管理员hh");
        u.setAppType("11111");
        u.setCity("长沙市");
        User user=userService.save(u);
        System.out.println(user.getName());
    }

    @Test
    public void  findPageByCondition(){
        User u=new User();
        u.setCity("长沙市");
        Page<User> page=userService.findPageByCondition("4",u,1);
        System.out.println(JSON.toJSON(page).toString());
    }
    @Test
    public void updateStatusByName(){
        userService.updateStatusByName("15705789978");
    }

    @Test
    public void findByPhone(){
        System.out.println(userService.findByPhone("13374867032"));
    }
}