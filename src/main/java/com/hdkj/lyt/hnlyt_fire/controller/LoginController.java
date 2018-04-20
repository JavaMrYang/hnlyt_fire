package com.hdkj.lyt.hnlyt_fire.controller;

import com.hdkj.lyt.hnlyt_fire.model.User;
import com.hdkj.lyt.hnlyt_fire.service.impl.UserServiceImpl;
import com.hdkj.lyt.hnlyt_fire.util.Contants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(HttpSession session,String type,String name,String pwd){
        Map<String,Object> map=new HashMap<>();
        if(userService.login(name, pwd, type)){
            User user=userService.findByName(name);
            session.setAttribute("user",user);
            map.put("code", Contants.OK_STATUS);
            map.put("data",user);
        }else{
            map.put("code",Contants.ERROR_STATUS);
            map.put("msg","用户名或密码错误!");
        }
        return map;
    }

    @RequestMapping(value = "/loginOut",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> loginOut(HttpSession session){
        Map<String,Object> map=new HashMap<>();
        session.removeAttribute("user");
        map.put("code", Contants.OK_STATUS);
        return map;
    }
    

}
