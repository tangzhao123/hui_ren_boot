package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.service.medical.ShouSHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShouShuController {
    @Autowired
    ShouSHuService service;

    @GetMapping("/zhudao-dorctor")
    public List<Staff> zhudao(){
        return service.zhudao();
    }

    @GetMapping("/mazui-dorctor")
    public List<Staff> mazui(){
        return service.mazui();
    }
}
