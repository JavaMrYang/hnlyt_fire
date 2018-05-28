package com.hdkj.lyt.hnlyt_fire.controller;

import com.hdkj.lyt.hnlyt_fire.util.Contants;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FileUploadController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> upload(@RequestParam("file") MultipartFile file, BindingResult result){
        Map<String,Object> map=new HashMap<>();
        if (!file.isEmpty()) {
            try {
                // 这里只是简单例子，文件直接输出到项目路径下。
                // 实际项目中，文件需要输出到指定位置，需要在增加代码处理。
                // 还有关于文件格式限制、文件大小限制，详见：中配置。
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File(file.getOriginalFilename())));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                map.put("code", Contants.ERROR_STATUS);
            } catch (IOException e) {
                e.printStackTrace();
               map.put("code",Contants.ERROR_STATUS);
            }
               map.put("code",Contants.OK_STATUS);
        } else {
            map.put("code",Contants.ERROR_STATUS);
        }
        return map;
    }
}
