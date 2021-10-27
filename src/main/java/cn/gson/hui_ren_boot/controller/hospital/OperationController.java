package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.mapper.medical.ApplyrecordMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Additional;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgery;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgeryfor;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.service.hospital.OperationService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Opera")
public class OperationController {
    @Autowired
    OperationService operationService;
    @Autowired
    ApplyrecordMapper applyrecordMapper;
    @RequestMapping("/attOpera")//查询手术项目表
    private Object attOperation(Integer pageNo, Integer size,String shu){
        Additional inputboxs = JSONObject.toJavaObject(JSON.parseObject(shu), Additional.class);

        return operationService.allOperationByPage(pageNo,size,inputboxs);
    }
    @RequestMapping("skkStaff")
    private List<Staff> allsStaff(@RequestBody Medical staffu){
        System.out.println(staffu);
        Medical kk=  operationService.allMedicals(staffu);
        Staff j=new Staff();
        j.setMedicalId(kk.getMedicalId());
        return operationService.allStaff(j);
    }
    @RequestMapping("skkStaff2")
    private List<Staff>allStaff2(){
        return operationService.allStaff2();
    }
    @RequestMapping("skkStaff3")//添加手术申请表
    private String  allStaff3(@RequestBody Surgeryfor surgeryfor){
        try {
           operationService.addSurgeryfor(surgeryfor);
           return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return"fail";//异常判断新增失败
        }
    }
    @RequestMapping("skkStaff4")//查询手术申请表
    private List<Surgeryfor>  allStaff4(@RequestBody Surgeryfor surgeryfor){

      return  operationService.allSurgeryfor(surgeryfor);

    }
    @RequestMapping("skkStaff5")//删除手术申请表
    private String deleteSurgeryfors(@RequestBody Surgeryfor surgeryfor){
        try {
             operationService.deleteSurgeryfor(surgeryfor);
             return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return"fail";//异常判断新增失败
        }
    }
    @RequestMapping("allSurgery")
    public List<Surgery> allSurgery(@RequestBody  Register register){//手术结果查询
        return    applyrecordMapper.allSurgery(register);
    }
    @RequestMapping("allSurgeryfor2")
    public List<Surgery>allSurgeryfor2(@RequestBody Surgery surgery){
        return operationService.allSurgeryfor2(surgery);
    }

}
