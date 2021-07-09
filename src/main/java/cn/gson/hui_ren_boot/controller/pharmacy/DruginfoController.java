package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import cn.gson.hui_ren_boot.model.service.outpatient.OutRegisterService;
import cn.gson.hui_ren_boot.model.service.pharmacy.DrugService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/druginfo")
public class DruginfoController {
    @Autowired
    DrugService drugService;

    @RequestMapping("/drugmanger")
    public Object allDrug(Integer pageNo,Integer size,String drugInfo){
        System.out.println(drugInfo);
        DrugInfo drugInfos = JSONObject.toJavaObject(JSON.parseObject(drugInfo), DrugInfo.class);
        System.out.println(drugInfos);
        return drugService.allDrugByPage(pageNo,size,drugInfos);
    }
}
