package cn.gson.hui_ren_boot.controller.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.hospital.Sickbed;
import cn.gson.hui_ren_boot.model.service.nursestation.PlanService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlanController {
    @Autowired
    PlanService service;

    //修改病床使用记录
    @RequestMapping("/xin-recordupdate")
    public String chaRecords(String registerId,String bed,String sickbedMark1){
        try{
            service.chaRecords(registerId,bed,sickbedMark1);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }

    }

    //新增病床使用记录
    @PostMapping("/xin-record")
    public String  xinRecord(@RequestBody Record record){
       try{
           service.xinRecord(record);
           return "ok";
       }catch (Exception e){
           e.printStackTrace();
           return "fail";
       }
    }

    //    根据病人所在的科室查询病床
    @GetMapping("/cha-beds")
    public List<Sickbed> chabeds(Long medicalId){
        return service.chabedss(medicalId);
    }

    @RequestMapping("/cha-bings")
    public Object chabing(Integer pageNo,Integer size,String en){
        System.err.println(en);
        Register register = JSONObject.toJavaObject(JSON.parseObject(en),Register.class);
        return service.chabingByPage(pageNo,size,register);
    }
}
