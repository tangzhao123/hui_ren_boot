package cn.gson.hui_ren_boot.controller.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.nursestation.SickbedEntity;
import cn.gson.hui_ren_boot.model.service.nursestation.SickbedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SickbedController {
    @Autowired
    SickbedService sickbedService;

    //病人资料查询
    @GetMapping("/register-select")
    public List<Register> registerSelect(){
        return sickbedService.registerSelect();
    }


    //病床的查询
    @GetMapping("/sick-select")
    public List<SickbedEntity> selSickbed(Long medicalId){
//        System.out.println("病床"+sickbedService.bingchuang(medicalId));
        return sickbedService.bingchuang(medicalId);
    }
}
