package com.hdkj.lyt.hnlyt_fire.util.ly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectUtil {
    /**
     *  数组list转数组Map字段的方法，顺序必须一致
     * @param list
     * @param params
     * @return
     */
    public static List<Map> listToListMap(List list, Object... params){
        List<Map> listMap=new ArrayList<>();
        for (int i=0,len=list.size();i<len;i++){
            Map map=new HashMap();
            Object[] paramValues= (Object[]) list.get(i);
            for(int j=0;j<params.length;j++){
                map.put(params[j],paramValues[j]);
            }
            listMap.add(map);
        }
        return listMap;
    }
}
