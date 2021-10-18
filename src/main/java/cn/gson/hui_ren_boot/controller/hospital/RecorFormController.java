package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.RecordForm;
import cn.gson.hui_ren_boot.model.pojos.hospital.Sickbed;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.service.hospital.RecorFormService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("RecorForm")
public class RecorFormController {
    @Autowired
    RecorFormService recorFormService;
    @RequestMapping("allWards")
    public List<Sickbed> allWard(@RequestBody Medical medical){//查询科室下病
        System.out.println("---");
        System.out.println(medical.getMedicalName());
        return recorFormService.allWard(medical);
    }

    @RequestMapping("addRecor")
    public String addRecorForm(@RequestBody RecordForm recordForm){
        System.out.println(recordForm.toString());
         recorFormService.addRecorForm(recordForm);
         return "ok";
    }
    //转科记录分页查询
    @RequestMapping("allRecordForm")
    public Object allRecordFormk(Integer pageNo, Integer size,String shu){
        RecordForm inputboxs = JSONObject.toJavaObject(JSON.parseObject(shu), RecordForm.class);
        return recorFormService.allRecordFormByPage(pageNo,size,inputboxs);
    }
}
