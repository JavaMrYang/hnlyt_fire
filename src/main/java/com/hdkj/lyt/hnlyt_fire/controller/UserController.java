package com.hdkj.lyt.hnlyt_fire.controller;


import com.hdkj.lyt.hnlyt_fire.model.User;
import com.hdkj.lyt.hnlyt_fire.service.impl.UserServiceImpl;
import com.hdkj.lyt.hnlyt_fire.util.Contants;
import com.hdkj.lyt.hnlyt_fire.util.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value="/getUList",method= RequestMethod.POST)
    @ResponseBody
    public  List<User> getUList(@RequestParam Map<String,String> map){
        List<User> list= userService.findListByCondition(map);
        return list;
    }

    @RequestMapping(value="/addUser",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> addUser(User user,HttpSession session){
        Map<String,Object> resultMap=new HashMap<>();
        User u=userService.save(user);
        ResultJson.sendCodeAndMsg(Contants.OK_STATUS,"添加成功",resultMap);
        return resultMap;
    }

    @RequestMapping(value="/getListUserByCondition",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> getListUserByCondition(User user, String pageNo, HttpSession session){
        User u= (User) session.getAttribute(Contants.USER_LOGINNAME);
        Map<String,Object> resultMap=new HashMap<>();
        Page<User> pageList=null;
        String userType=user.getAppType();//获取用户类型
        String type=u.getCharacter(); //获取角色类型
        int num=Integer.parseInt(pageNo);
        if(userType!=null&&userType.length()!=5){
            ResultJson.sendCodeAndMsg(Contants.ERROR_STATUS,"您传入的用户类型必须是五位数",resultMap);
            return resultMap;
        }
        if("0".equals(type)){
             pageList=userService.findPageByCondition(userType,user,num);
        }else{
            int userLevel=u.getUserLevel();
            switch (userLevel){
                case 0:pageList=userService.findPageByCondition(userType,user,num);
                break;
                case 1:user.setCity(u.getCity());
                pageList=userService.findPageByCondition(userType,user,num);
                break;
                case 2:user.setCity(u.getCity());user.setTown(u.getTown());
                    pageList=userService.findPageByCondition(userType,user,num);
                    break;
                case 3:user.setCity(u.getCity());user.setTown(u.getTown());user.setStreet(u.getStreet());
                    pageList=userService.findPageByCondition(userType,user,num);
                    break;
                 default:
                     ResultJson.sendCodeAndMsg(Contants.ERROR_STATUS,"您登陆的用户级别有误！请于管理员联系",resultMap);break;
            }
        }
        ResultJson.sendCodeAndTotalAndData(Contants.OK_STATUS,pageList.getContent(),pageList.getTotalElements(),resultMap);
        return resultMap;
    }

    @RequestMapping(value="/getUserByName",method=RequestMethod.POST)
    @ResponseBody
    public Map getUserByName(String name){
        Map<String,Object> resultMap=new HashMap<>();
        User user=userService.findByName(name);
        ResultJson.sendCodeAndData(Contants.OK_STATUS, user,resultMap);
        return resultMap;
    }

    @RequestMapping(value="/editUser",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> editUser(User user){
        Map<String,Object> resultMap=new HashMap<>();
        User u=userService.update(user);
        ResultJson.sendCodeAndMsg(Contants.OK_STATUS,"修改成功",resultMap);
        return resultMap;
    }

    @RequestMapping(value="/removeUser",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> removeUser(User user){
        Map<String,Object> resultMap=new HashMap<>();
        userService.updateStatusByName(user.getName());
        ResultJson.sendCodeAndMsg(Contants.OK_STATUS,"禁用成功",resultMap);
        return resultMap;
    }

    @RequestMapping(value="/editUserType",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> editUserType(String name,String userType){
        Map<String,Object> resultMap=new HashMap<>();
        userService.updateAppTypeByName(userType,name);
        ResultJson.sendCodeAndMsg(Contants.OK_STATUS,"禁用成功",resultMap);
        return resultMap;
    }

    @RequestMapping(value="/findUserByValidate",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findUserByValidate(User user,Integer pageNo){
        Map<String,Object> resultMap=new HashMap<>();
        String appType=user.getAppType();
        if(appType!=null&&appType.length()!=5){
            ResultJson.sendCodeAndMsg(Contants.ERROR_STATUS,"传入用户类型必须是五位数",resultMap);
            return resultMap;
        }
        Page<User> pageList=userService.findListValidateByCondition(user,pageNo);
        ResultJson.sendCodeAndTotalAndData(Contants.OK_STATUS,pageList.getContent(),pageList.getTotalElements(),resultMap);
        return resultMap;
    }

    @RequestMapping(value = "/validateUser",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> validateUser(HttpSession session,String names,String appType){
        Map<String,Object> resultMap=new HashMap<>();
        User u= (User) session.getAttribute(Contants.USER_LOGINNAME);
        String type=u.getCharacter();
        if(type==null&&"".equals(type)){
           ResultJson.sendCodeAndMsg("","您登录的用户还没设置角色，请设置之后再审核!",resultMap);
        }else {
            if (type.equals("1")) {
                ResultJson.sendCodeAndMsg("over_power", "您登录的用户还没设置角色，请设置之后再审核!", resultMap);
            } else userService.updateValidateByName(appType, names);
        }
        return resultMap;
    }


}
