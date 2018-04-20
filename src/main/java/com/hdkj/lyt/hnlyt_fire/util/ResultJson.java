package com.hdkj.lyt.hnlyt_fire.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class ResultJson {
    private Map<String,Object> resultMap;

    public ResultJson(Map<String,Object> map){
        this.resultMap=map;
    }
    public void setCodeAndMsg(String code,String msg){
        this.resultMap.put("code",code);
        this.resultMap.put("msg",msg);
    }

    public static void sendCodeAndMsg(String code,String msg,Map<String,Object> map){
        map.put("code",code);
        map.put("msg",msg);
    }
    public static void sendCodeAndTotalAndData(String code, List  data, Long total,Map<String,Object> map){
        map.put("code",code);
        map.put("data",data);
        map.put("total",total);
    }
    public static void sendCodeAndData(String code,Object data,Map<String,Object> map){
        map.put("code",code);
        map.put("data",data);
    }
}
