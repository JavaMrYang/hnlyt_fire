package com.hdkj.lyt.hnlyt_fire.service.impl;

import com.alibaba.fastjson.JSON;
import com.hdkj.lyt.hnlyt_fire.model.FireUploadTable;
import com.hdkj.lyt.hnlyt_fire.repository.FireUpLoadTableRepository;
import com.hdkj.lyt.hnlyt_fire.util.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FireUploadTableServiceImplTest {

    @Autowired
    private FireUpLoadTableRepository fireUpLoadTableRepository;
    @Autowired
    private FireUploadTableServiceImpl fireUploadTableService;
    @Test
    public void getFireUploagLine1(){
        String startTime = StringUtil.getCurrentMothMinDay();
        String endTime = StringUtil.getCurrentMothMaxDay();
        List<Map> listMap=fireUpLoadTableRepository.getFireUploagLine(startTime,endTime);
        System.out.println(JSON.toJSON(listMap).toString());
        System.out.println(listMap.get(0).get("createDate"));
    }
    @Test
    public void updateStatusById(){
        fireUpLoadTableRepository.updateStatusById("2",879);
    }
    @Test
    public void findByHotId(){
        FireUploadTable fireUploadTable=fireUpLoadTableRepository.findByHotId("232");
        System.out.println(JSON.toJSON(fireUploadTable).toString());
    }

    @Test
    public void findPageByCondition(){
        String fireLevel="";
        String fireKind="";
        String fireArea="长沙市";
        String fireAreaTown="";
        String villag="";
        String startTime="";
        String endTime="";
        Page<Map> pageList=fireUploadTableService.findPageByCondition(fireLevel, fireKind, fireArea, fireAreaTown, startTime, endTime,villag, 2);
        System.out.println(JSON.toJSON(pageList).toString());
        System.out.println(pageList.getTotalPages());
    }
}