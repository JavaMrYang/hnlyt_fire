package com.hdkj.lyt.hnlyt_fire.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hdkj.lyt.hnlyt_fire.model.FireEnd;
import com.hdkj.lyt.hnlyt_fire.model.FireTrack;
import com.hdkj.lyt.hnlyt_fire.model.FireUploadTable;
import com.hdkj.lyt.hnlyt_fire.model.User;
import com.hdkj.lyt.hnlyt_fire.service.impl.FireTrackServiceImpl;
import com.hdkj.lyt.hnlyt_fire.service.impl.FireEndServiceImpl;
import com.hdkj.lyt.hnlyt_fire.service.impl.FireUploadTableServiceImpl;
import com.hdkj.lyt.hnlyt_fire.service.impl.UserServiceImpl;
import com.hdkj.lyt.hnlyt_fire.socket.TestSocket;
import com.hdkj.lyt.hnlyt_fire.util.AppMessageUtil;
import com.hdkj.lyt.hnlyt_fire.util.Contants;
import com.hdkj.lyt.hnlyt_fire.util.JpushClientUtil;
import com.hdkj.lyt.hnlyt_fire.util.ResultJson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/fire")
public class FireUploadTableContorller {
    private Logger logger= LoggerFactory.getLogger(FireUploadTableContorller.class);
    @Autowired
    private FireUploadTableServiceImpl uploadTableService;
    @Autowired
    private FireTrackServiceImpl fireTrackService;
    @Autowired
    private FireEndServiceImpl fireEndService;
    @Autowired
    private UserServiceImpl userService;


    @RequestMapping(value="/recverFireTable",method= RequestMethod.POST)
    @ResponseBody
    public Map recverFireTable(FireUploadTable uploadTable, HttpSession session) {
        Map resultMap=new HashMap();
        User u= (User) session.getAttribute(Contants.USER_LOGINNAME);
        uploadTable.setInputTime(Contants.SDF_TIME_YMDHMS.format(new Date()));
        try {
            uploadTable.setCreateDate(uploadTable.getCreactTime().split(" ")[0]);
        } catch (Exception e) {
            e.printStackTrace();
            uploadTable.setCreateDate(Contants.SDF_TIME_YMD.format(new Date()));
        }
        uploadTable.setFireStatus("0");
        uploadTable.setUserName(u.getName());
        User user=userService.findByName(u.getName());
        uploadTable.setCity(user.getCity());
        uploadTable.setTown(user.getTown());
        FireUploadTable table=uploadTableService.save(uploadTable);
        if(table!=null){
            String message=AppMessageUtil.getMessageByUploadTalbe(table);
            Map<String, String> map=new HashMap<String, String>();
            map.put("id", table.getId()+"");
            map.put("index", table.getFireStatus());
            map.put("msg", message);
            List<String> names=userService.findNameByCity(table.getFireArea());
            JpushClientUtil jc=new JpushClientUtil(Contants.FH_KEY,Contants.FH_MASTERSECRET);
            jc.sendToRegistrationId(names, "火灾通知", message, message, JSONObject.toJSONString(map));
           Object json=JSON.toJSON(table);
            for(TestSocket item: TestSocket.webSocketSet){
                try {
                    if(json!=null&&json.toString().length()>0){
                        item.sendMessage(json.toString());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    continue;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return resultMap;
    }

    @RequestMapping(value="/recverFireTable2",method=RequestMethod.POST)
    @ResponseBody
    public Map recverFireTable2(FireTrack tbFireTrack, HttpSession session){
        Map resultMap=new HashMap();
        User u= (User) session.getAttribute(Contants.USER_LOGINNAME);
        tbFireTrack.setInputTime(Contants.SDF_TIME_YMDHMS.format(new java.util.Date()));
        tbFireTrack.setStatus("1");
        tbFireTrack.setUserName(u.getName());
        boolean flag=fireTrackService.save(tbFireTrack);
        if(flag){
            FireUploadTable fireUploadTable=new FireUploadTable();
            fireUploadTable.setId(tbFireTrack.getId());
            fireUploadTable.setFireStatus("1");
            uploadTableService.save(fireUploadTable);
            ResultJson.sendCodeAndMsg(Contants.OK_STATUS,"添加成功",resultMap);
        }else{
            ResultJson.sendCodeAndMsg(Contants.ERROR_STATUS,"添加失败",resultMap);
        }
        return resultMap;
    }

    @RequestMapping(value="/recverFireTable3",method=RequestMethod.POST)
    @ResponseBody
    public Map recverFireTable3(HttpSession session, FireEnd fireEnd){
        Map resultMap=new HashMap();
       fireEnd.setInputTime(Contants.SDF_TIME_YMDHMS.format(new Date()));
        boolean flag=fireEndService.save(fireEnd);
        if (flag){
            uploadTableService.updateStatusById("2",Integer.parseInt(fireEnd.getId()));
            fireTrackService.updateStatusById("2",Integer.parseInt(fireEnd.getId()));
            ResultJson.sendCodeAndMsg(Contants.OK_STATUS,"添加成功",resultMap);
        }else{
            ResultJson.sendCodeAndMsg(Contants.ERROR_STATUS,"添加失败",resultMap);
        }
        return resultMap;
    }

    @RequestMapping(value="/getFireUploadByHotId",method=RequestMethod.POST)
    @ResponseBody
    public Map getFireUploadByHotId(String hotId){
        Map resultMap=new HashMap();
        FireUploadTable fireUploadTable=uploadTableService.findByHotId(hotId);
        ResultJson.sendCodeAndData(Contants.OK_STATUS,fireUploadTable,resultMap);
        return resultMap;
    }

    @RequestMapping(value="/deleteFire",method = RequestMethod.POST)
    @ResponseBody
    public Map deleteFire(String id){
        Map resultMap=new HashMap();
        try {
            uploadTableService.deleteById(Integer.parseInt(id));
            fireTrackService.deleteById(Integer.parseInt(id));
            fireEndService.deleteById(id);
            logger.info("id:"+id);
            ResultJson.sendCodeAndMsg(Contants.OK_STATUS,"删除成功!",resultMap);
        }catch (Exception e){
           e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
           ResultJson.sendCodeAndMsg(Contants.ERROR_STATUS,"删除失败!",resultMap);
        }
        return resultMap;
    }

    /**
     * 按条件查询评估和未评估列表
     * @param fireUploadTable
     * @param pageNo
     * @param beginTime
     * @param endTime
     * @param fireId
     * @param type
     * @return String
     * @date 2018-3-31
     */
    @RequestMapping(value="/getFireUploadTableListByCondition",method=RequestMethod.POST)
    @ResponseBody
    public Map getFireUploadTableListByCondition(FireUploadTable fireUploadTable,String pageNo,
String beginTime,String endTime,String fireId,String type){
     Map resultMap=new HashMap();
     Page<Map> pageList=uploadTableService.findAssessPageByCondition(Integer.parseInt(pageNo),fireUploadTable,beginTime,endTime,fireId);
     ResultJson.sendCodeAndTotalAndData(Contants.OK_STATUS,pageList.getContent(),pageList.getTotalElements(),resultMap);
     return resultMap;
    }
}
