package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.service.hospital.RegisterService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/PatientRegistration")
public class RegisterConvertor {
    @Autowired
    RegisterService registerService;

    //多条件分页查询患者信息
    @RequestMapping("/registers")
    public Object allregis(Integer pageNo, Integer size, String shu) {
        // Register inputboxs = JSONObject.toJavaObject(JSON.parseObject(inputbox),Register.class);
        Register inputboxs = JSONObject.toJavaObject(JSON.parseObject(shu), Register.class);
        System.out.println("数据" + inputboxs);
        return registerService.allRegisByPage(pageNo, size, inputboxs);
    }//新增住院病人信息
    @RequestMapping("/saveRegis")
    public String saveRegis(@RequestBody Register j) {
        try {
            j.setRegisterDate(new Date());
            registerService.saveRegis(j);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}