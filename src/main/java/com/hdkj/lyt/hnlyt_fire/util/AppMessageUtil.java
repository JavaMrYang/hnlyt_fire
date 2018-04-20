package com.hdkj.lyt.hnlyt_fire.util;

import com.hdkj.lyt.hnlyt_fire.model.FireUploadTable;
import com.hdkj.lyt.hnlyt_fire.service.UserService;
import com.hdkj.lyt.hnlyt_fire.service.impl.UserServiceImpl;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AppMessageUtil {

    /**
     * 通过火情上报获取发送消息
     * @param map
     * @return String
     * @date 2018-3-31
     */
    public static String getMessageByUploadTalbe(FireUploadTable fireUploadTable){
        String createTime=fireUploadTable.getCreactTime()==null?"":Contants.SDF_TIME_YMDHMS.format(fireUploadTable.getCreactTime());
        String fireArea=fireUploadTable.getFireArea()==null?"":fireUploadTable.getFireArea();
        String fireAreaTown=fireUploadTable.getFireAreaTown()==null?"":fireUploadTable.getFireAreaTown();
        String village=fireUploadTable.getVillage()==null?"":fireUploadTable.getVillage();
        String message=createTime+" "+fireArea+fireAreaTown+village+"发生火灾，请立即派人前往灭火!";
        return message;
    }
    /**
     * 通过护林员上报获取发送消息
     * @param map
     * @return String
     * @date 2018-3-31
     */
    public static String getMessageByRecverRangerTable(Map<String,String> map){
        String createTime=map.get("creactTime")==null?"":map.get("creactTime");
        String city=map.get("city")==null?"":map.get("city");
        String town=map.get("town")==null?"":map.get("town");
        String village=map.get("village");
        if(StringUtils.isBlank(village)){
            village="";
        }
        String message=createTime+" "+city+town+village+"发生火灾，请立即派人前往灭火!";

        return message;
    }
    /**
     * 通过发布任务获取推送消息
     * @param map
     * @return String
     * @date 2018-3-31
     */
    public static String getMessageByTask(Map<String,String> map){
        String taskAddTime=map.get("taskAddTime");
        String city=map.get("city");
        String town=map.get("town")==null?"":map.get("town");
        String village=map.get("village")==null?"":map.get("village");
        String message=taskAddTime+" "+city+town+village+"发生火灾，请立即派人前往灭火!";
        return message;
    }
    /**
     * 通过任务获取需要发送的别名
     * @param map
     * @throws NumberFormatException
     * @throws Exception
     * @return List<String>
     * @date 2018-4-2
     */
    public static List<String> getAliasByTask(Map<String,String> map) {
        List<String> alias=new ArrayList<String>();
        String toName=map.get("toName");
        if(toName.contains("_")){
            String[] type=toName.split("_");
            UserService userService=new UserServiceImpl();
            if(type.length>1){ //查询区域消防员和护林员
                if(type[1].matches("[\u4e00-\u9fa5]+")){//如果接受人后面的区域是中文,就查询城市
                    alias=userService.getUserByGroupIdAndAppType(null, Integer.parseInt(type[0]), type[1]);
                }else  //否则查询区域
                    alias=userService.getUserByGroupIdAndAppType(type[1], Integer.parseInt(type[0]),null);

            }else{ //代表查询全部的消防员和护林员
                alias=userService.getUserByGroupIdAndAppType(null, Integer.parseInt(type[0]),null);
            }
        }else{
            String[] alia=toName.split(",");
            for(String name:alia){
                alias.add(name);
            }
        }
        return alias;
    }
}
