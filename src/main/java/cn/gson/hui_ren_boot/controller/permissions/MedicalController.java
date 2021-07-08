package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.service.permissions.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicalController {

    @Autowired
    MedicalService medicalService;

    //查询所有的科室列表
    @GetMapping("medical-list")
    public List<Medical> allMedical(){
        return medicalService.allMedical();
    }
}
