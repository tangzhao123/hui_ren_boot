package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.service.hospital.MedicalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Medical")
public class MedicalsController {
    @Autowired
    MedicalsService medicalService;
    @RequestMapping("/departs")
    public List<Medical> allmedical(){
        return  medicalService.allMedical();
    }
}
