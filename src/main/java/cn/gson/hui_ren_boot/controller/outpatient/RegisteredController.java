package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.service.outpatient.RegisteredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 挂号
 */
@RestController
@RequestMapping("/outpatient")
public class RegisteredController {
    @Autowired
    RegisteredService registeredService;

    @RequestMapping("/sel-lock")
    public Object selLock(String treatmentCard){
        System.out.println(treatmentCard);
        return registeredService.selLock(treatmentCard);
    }
}
