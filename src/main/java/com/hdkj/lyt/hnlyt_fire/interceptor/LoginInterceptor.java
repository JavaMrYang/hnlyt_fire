package com.hdkj.lyt.hnlyt_fire.interceptor;

import com.alibaba.fastjson.JSON;
import com.hdkj.lyt.hnlyt_fire.model.User;
import com.hdkj.lyt.hnlyt_fire.util.Contants;
import com.hdkj.lyt.hnlyt_fire.util.ResultJson;
import com.hdkj.lyt.hnlyt_fire.util.UserPowerUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


public class LoginInterceptor implements HandlerInterceptor{
    Logger logger= LoggerFactory.getLogger(LoginInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        HttpSession session=request.getSession();
        response.setCharacterEncoding("utf-8");
        Map map=new HashMap();
        String url=request.getRequestURI();
        User user=(User)session.getAttribute(Contants.USER_LOGINNAME);
        if(user==null){  //如果没有登陆,拦截
            ResultJson.sendCodeAndMsg("no login","请重新登陆!",map);
            this.returnJson(response,map);
            return false;
        }
        String type=user.getCharacter();//获取他登陆的角色
        if(url.contains("/user")){//如果是用户模块进行拦截
            if(url.contains("get")||url.contains("select")){ //如果是查询

            }else {  //否则进行增删改操作
                if(!UserPowerUtils.isHasUserOpera(user,request,map)){
                    this.returnJson(response,map);
                }
            }
        }
        logger.info("-----preHandle------");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        logger.info("-----postHandle------");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        logger.info("-----afterCompletion------");
    }
    private void returnJson(HttpServletResponse response, Map map) {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(JSON.toJSON(map).toString());

        } catch (IOException e) {
            logger.error("response error",e);
        } finally {
            if (writer != null)
                writer.close();
        }
    }
}
