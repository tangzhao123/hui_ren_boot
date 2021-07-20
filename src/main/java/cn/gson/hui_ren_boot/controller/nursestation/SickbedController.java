package cn.gson.hui_ren_boot.controller.nursestation;

import cn.gson.hui_ren_boot.model.service.nursestation.SickbedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SickbedController {
    @Autowired
    SickbedService sickbedService;

    @GetMapping("/sick-select")
    public void selSickbed(){
        sickbedService.selSickbed();
    }
}
