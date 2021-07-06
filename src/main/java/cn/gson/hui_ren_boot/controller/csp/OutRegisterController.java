package cn.gson.hui_ren_boot.controller.csp;

import cn.gson.hui_ren_boot.model.service.csp.OutRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/outpatient")
public class OutRegisterController {
    @Autowired
    OutRegisterService outRegisterService;
    //分页查询患者
    @RequestMapping("/register")
    public Object allRegister(Integer pageNo,Integer size){
        return outRegisterService.allRegisterByPage(pageNo, size);
    }
}
