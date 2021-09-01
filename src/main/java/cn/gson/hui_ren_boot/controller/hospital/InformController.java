package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Inform;
import cn.gson.hui_ren_boot.model.service.hospital.InformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/InformPer")
public class InformController {
    @Autowired
    InformService informService;
    @RequestMapping("/addInformPer")//新增出院通知
    public String addiInform(@RequestBody Inform inform){
        try{
            informService.addInform(inform);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
    @RequestMapping("/selectInformPer")//查出院通知
    public List<Inform> selectInform(@RequestBody Inform inform){
       return informService.selectInform(inform);

    }
    @RequestMapping("/deletInformPer")//删出院通知
    public String deletInform(@RequestBody Inform inform){
        try{
            informService.deleteInform(inform);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }


    }
}
