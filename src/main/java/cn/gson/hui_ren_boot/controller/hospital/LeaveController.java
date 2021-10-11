package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Leave;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.service.hospital.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/LeaveColler")
public class LeaveController {
    @Autowired
    LeaveService leaveService;
    @RequestMapping("/allRegisterk")
    public List<Register> allRegisters(@RequestBody Register register){//结算页面的查询
        return leaveService.allRegisters(register);
    }
    @RequestMapping("/addLeaves")
    public String addLeave(@RequestBody Leave leave){
        leaveService.addLeave(leave);
        return "ok";
    }
}
