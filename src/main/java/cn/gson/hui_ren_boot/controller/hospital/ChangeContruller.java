package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Change;
import cn.gson.hui_ren_boot.model.service.hospital.ChangeService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Changes")

public class ChangeContruller {
    @Autowired
    ChangeService changeService;
    @RequestMapping("addChan")//新增转科通知
    public String addChanges(@RequestBody Change change){
//        try{
            changeService.addChange(change);
            return "ok";
//          }catch(Exception e){
//            return "fail";
//          }

    }
    @RequestMapping("allchan")//查询转科通知
    public List<Change> allChange(){//查询
         return  changeService.allChange();
    }
    @RequestMapping("dechan")
    public String deChange(@RequestBody Change change){

        changeService.deChange(change);
        return "ok";
    }
    @RequestMapping("assChan")
    public Object assChaneg( Integer pageNo, Integer size, String shu){
        Change inputboxs = JSONObject.toJavaObject(JSON.parseObject(shu), Change.class);
        return changeService.asChangeByPage(pageNo,size,inputboxs);
    }
}

