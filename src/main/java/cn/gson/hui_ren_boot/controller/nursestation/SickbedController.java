package cn.gson.hui_ren_boot.controller.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.*;
import cn.gson.hui_ren_boot.model.pojos.nursestation.SickbedEntity;
import cn.gson.hui_ren_boot.model.pojos.nursestation.WardEntity;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.service.nursestation.SickbedService;
import cn.gson.hui_ren_boot.utils.MyUtil;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SickbedController {
    @Autowired
    SickbedService sickbedService;

    //c查询病床
    @GetMapping("/select-bed")
    public List<Sickbed> selectbed(String warkMark){
        return sickbedService.selectbed(warkMark);
    }

    //查询病房（根据科室，护士，病房号）
    @GetMapping("/select-ward")
    public Object selectWard(int pageNo, int size,String wardName){
        WardEntity wardEntity = JSONObject.parseObject(wardName,WardEntity.class);
        return sickbedService.selectWardByPage(pageNo,size,wardEntity);
    }

    //新增病房
    @RequestMapping("/insert-ward")
    public String addWard(@RequestBody Ward ward){
       System.out.println("====opennnnn==========");
        Ward w = ward;
        System.out.println("病房"+ward.toString());
//        System.out.println(w.toString());
        Long o = Long.valueOf(0);
       if (ward.getWardId() == 0){
           sickbedService.addWard(w);//新增病房
           for (int i = 1; i <= w.getWardSite(); i++) {
               o = o+1;
               String sickbedMark = w.getWardMark() + "-" + o;//病床号
               System.out.println("病房号："+w.getWardMark());
               System.out.println("病床号："+sickbedMark);
               Sickbed sickbed = new Sickbed();
               sickbed.setWardMark(w.getWardMark());
               sickbed.setSickbedMark(sickbedMark);
               sickbedService.insertbed(sickbed);//新增病床
           }
       }else {
           sickbedService.updateWard(w);//修改病房
       }

        return "ok";
    }

    //查询不同科室的护士
    @GetMapping("/record-hushi")
    public List<Staff> hushi(Long medicalId){
        return sickbedService.staffHu(medicalId);
    }

    //调换病床
    @RequestMapping("/record-diaohuan")
    public String ChangingBed(@RequestBody Map<String,Object> map){
        try {
            ObjectMapper mapper = new ObjectMapper();
            Record xgjl = mapper.convertValue(map.get("xgjl"), Record.class);
            String sickbedMarks = map.get("sickbedMarks").toString();
            sickbedService.updateRecord(xgjl);//修改床位记录
            sickbedService.updateSickbed(xgjl.getSickbedMark());//把病床状态改成已使用
            sickbedService.updateTwo(sickbedMarks);//把病床状态改成未使用
            return "ok";
        }catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }

    //查询病床
    @GetMapping("/record-select")
    public Object selectRecord(int pageNo, int size,String marks){
        Record r = JSONObject.parseObject(marks,Record.class);
        return sickbedService.selectRecordByPage(pageNo,size,r);
    }

    //病床使用记录表，修改病床状态，修改病人资料添加病床号
    @RequestMapping("/record-insert")
    public String addRecord(@RequestBody Record jl){
        try {
            String danhao=  MyUtil.genrateNo("BCJL");//订单编号
            Register register=new Register();
            register.setRegisterId(jl.getRegisterId());
            register.setSickbedMark(jl.getSickbedMark());
            jl.setRecordSerial(danhao);
            sickbedService.addRecord(jl);//新增
            sickbedService.updateRegister(register);//修改病人信息
            sickbedService.updateSickbed(jl.getSickbedMark());//修改病床状态
            return "ok";
        }catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }


    }

    //病人资料查询
    @GetMapping("/register-select")
    public List<Register> registerSelect(){
        return sickbedService.registerSelect();
    }


    //病床的查询
    @GetMapping("/sick-select")
    public List<SickbedEntity> selSickbed(Long medicalId){
        return sickbedService.bingchuang(medicalId);
    }
}
