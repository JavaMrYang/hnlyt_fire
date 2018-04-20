package com.hdkj.lyt.hnlyt_fire.util;

import com.hdkj.lyt.hnlyt_fire.model.User;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class UserPowerUtils {
    /**
     * 判断登陆用户是否有权限
     * @param loginUser
     * @param request
     * @param resultMap
     * @return
     */
    public static boolean isHasUserOpera(User loginUser, HttpServletRequest request, Map resultMap){
        String roleType=loginUser.getCharacter();
        if(StringUtils.isBlank(roleType)){
            ResultJson.sendCodeAndMsg("no_setRole", "您登录的用户还没设置角色，请设置之后再添加!", resultMap);
            return false;
        }
        if("1".equals(roleType)){//如果登录的是普通用户
            ResultJson.sendCodeAndMsg("no_power", "您是普通用户无操作权限!", resultMap);
        }else { //如果登录的是管理员
            String addType = request.getParameter("character"); //获取操作的用户角色
            int userLevel = loginUser.getUserLevel();  //获取他的登录用户级别
            int addUserLevel = Integer.parseInt(request.getParameter("userLevel"));//获取他操作用户的级别
            if (addType.equals("0")) { //如果操作的是超级管理员
                ResultJson.sendCodeAndMsg("over_power", "管理员不能操作超级管理员!", resultMap);
            } else if (addType.equals("1")) { //如果操作普通用户
                if (addUserLevel < userLevel) {//如果操作的级别小于他的级别则允许操作,这里0代表上级,1是下级
                    ResultJson.sendCodeAndMsg("over_power", "您的权限不足!", resultMap);
                    return false;
                }
            } else { //如果操作管理员
                if (addUserLevel <= userLevel) {//如果操作的级别小于等于他的级别则允许操作,这里0代表上级,1是下级
                    ResultJson.sendCodeAndMsg("over_power", "您的权限不足!", resultMap);
                    return false;
                }
            }
        }
            return true;

    }
}
