package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecord;
import cn.gson.hui_ren_boot.model.pojos.outpatient.OutpatientRegister;
import cn.gson.hui_ren_boot.model.service.outpatient.OutRegisterService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 门诊患者库
 */
@RestController
@RequestMapping("/outpatient")
public class OutRegisterController {
    @Autowired
    OutRegisterService outRegisterService;

    //多条件分页查询患者
    @RequestMapping("/register")
    public Object allRegister(Integer pageNo,Integer size,String outpatientRegister){
        System.out.println(outpatientRegister);
        OutpatientRegister outpatientRegisters = JSONObject.toJavaObject(JSON.parseObject(outpatientRegister),OutpatientRegister.class);
        System.out.println(outpatientRegisters);
        return outRegisterService.allRegisterByPage(pageNo, size,outpatientRegisters);
    }

    //根据患者编号查询病历
    @RequestMapping("/sel-record")
    public List<MedicalRecord> selRecord(int outpatientId){
        return outRegisterService.selRecord(outpatientId);
    }
}
