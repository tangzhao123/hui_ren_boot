package cn.gson.hui_ren_boot.controller.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.nursestation.SickbedEntity;
import cn.gson.hui_ren_boot.model.service.nursestation.SickbedService;
import cn.gson.hui_ren_boot.utils.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SickbedController {
    @Autowired
    SickbedService sickbedService;

    //调换病床
    @RequestMapping("/diaohuan")
    public String ChangingBed(@RequestBody Record xgjl,String sickbedMarks){
        Record r = new Record();
        r.setRecordSerial(xgjl.getRecordSerial());
        r.setSickbedMark(sickbedMarks);
        sickbedService.updateRecord(r);//修改病床记录，调换病床
        sickbedService.updateTwo(xgjl.getSickbedMark());//修改病床状态为未使用
        sickbedService.updateSickbed(sickbedMarks);//修改病床状态为已使用
        System.out.println("病床记录："+xgjl.toString());
        return "ok";
    }

    //查询病床
    @GetMapping("/record-select")
    public List<Record> selectRecord(){
//        System.out.println("病床使用记录："+sickbedService.selectRecord());
        return sickbedService.selectRecord();
    }

    //病床使用记录表，修改病床状态，修改病人资料添加病床号
    @RequestMapping("/record-insert")
    public String addRecord(@RequestBody Record jl){
//        System.out.println(jl.toString());
        String danhao=  MyUtil.genrateNo("BCJL");//订单编号
        Register register=new Register();
        register.setRegisterId(jl.getRegisterId());
        register.setSickbedMark(jl.getSickbedMark());
        jl.setRecordSerial(danhao);
//        System.out.println(jl+"数据1");
        sickbedService.addRecord(jl);//新增
        sickbedService.updateRegister(register);//修改病人信息
        sickbedService.updateSickbed(jl.getSickbedMark());//修改病床状态
        return "ok";
    }

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
