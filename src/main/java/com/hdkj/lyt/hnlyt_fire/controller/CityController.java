package com.hdkj.lyt.hnlyt_fire.controller;

import com.hdkj.lyt.hnlyt_fire.model.City;
import com.hdkj.lyt.hnlyt_fire.service.impl.CityServiceImpl;
import com.hdkj.lyt.hnlyt_fire.util.Contants;
import com.hdkj.lyt.hnlyt_fire.util.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CityController {
    @Autowired
    private CityServiceImpl cityService;

    @RequestMapping(value = "/getCitys",method = RequestMethod.POST)
    public Map getCityByPid(String pid, HttpSession session){
        Map resultMap=new HashMap();
        List<City> list=cityService.findByPid(pid);
        ResultJson.sendCodeAndData(Contants.OK_STATUS,list,resultMap);
        return resultMap;
    }


}
