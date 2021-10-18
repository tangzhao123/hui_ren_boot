package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Breakdown;
import cn.gson.hui_ren_boot.model.pojos.hospital.Hospitalcare;
import cn.gson.hui_ren_boot.model.pojos.hospital.InspectDebit;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.medical.Applyrecord;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Prndebit;
import cn.gson.hui_ren_boot.model.service.hospital.BreakdownService;
import cn.gson.hui_ren_boot.model.service.hospital.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Breaks")
public class BreakdownController {
    @Autowired
    BreakdownService breakdownService;
    @Autowired
    RegisterService registerService;
    @RequestMapping("/allBreaks")
    public List<Breakdown> allBreakt(@RequestBody Register register){
      List<Breakdown>kk=  breakdownService.selectBreak(register);
        System.out.println(kk);
        return kk;
    }
    ///患者信息
    @RequestMapping("/allPars")
    public List<Register> allPar(@RequestBody Register register){
        return  registerService.allR(register);
    }
    //护理床位记录查询
   @RequestMapping("/allHospitalcares")
    public List<Hospitalcare>allHospitalcare(@RequestBody Register register){
        return breakdownService.allHospitalcare(register);
    }
    //查询医嘱扣费记录表
    @RequestMapping("/allPrndebitRegisters")
    public List<Prndebit>allPrndebitRegister(@RequestBody Register register){
        return  breakdownService.allPrndebit(register);
    }
    //检验扣费查询
    @RequestMapping("/allInsectDebits")
    public List<InspectDebit> allInsectDebit(@RequestBody Register register){
        return breakdownService.allInsectDebit(register);
    }
    //手术扣费记录表查询
    @RequestMapping("/allApplyrecord")
    public List<Applyrecord>allApplyrecord(@RequestBody Register register){
        return breakdownService.allApplyrecord(register);
    }
}

