package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.service.hospital.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DrugDispensing")
public class AdviceController {
    @Autowired
    AdviceService adviceService;
    @RequestMapping("/dispensing")
    public List<Advice> allDispensing(){
        return  adviceService.allDispensing();
    }
}
