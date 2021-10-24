package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.service.hospital.InspectDebitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Inspectk")
public class InspectDebitController {
    @Autowired
    InspectDebitService inspectDebitService;
    @RequestMapping("deTexts")
    public String deInspectDebit(@RequestBody Test test){
        try {
            inspectDebitService.deTextw(test);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }

    }

}
