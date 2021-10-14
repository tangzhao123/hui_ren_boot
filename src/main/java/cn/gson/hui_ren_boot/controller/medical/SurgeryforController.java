package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.hospital.Operation;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgeryfor;
import cn.gson.hui_ren_boot.model.pojos.medical.Applyrecord;
import cn.gson.hui_ren_boot.model.service.medical.SurgeryforService;
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
public class SurgeryforController {
    @Autowired
    SurgeryforService surgeryforService;

    //查询手术室
    @GetMapping("/sel-operation")
    public Object selOperation(int pageNo, int size, String oper){
        Operation operation = JSONObject.parseObject(oper,Operation.class);
        return surgeryforService.selOperationByPage(pageNo,size,operation);
    }

    //新增手术室
    @RequestMapping("/insert-operation")
    public String insertOpeart(@RequestBody Operation addoperation){
       try {
           if (addoperation.getOperationId() == ""){
               Operation oo = addoperation;
               String operationId = MyUtil.genrateNo("SS");
               oo.setOperationId(operationId);
               surgeryforService.insertOpeart(oo);
           }else {
               String name = addoperation.getMedicalName();
               String id = addoperation.getOperationId();
               String dizhi = addoperation.getOperationAddress();
               surgeryforService.xiugaiOperation(dizhi,name,id);
           }
           return "ok";
       }catch (Exception e) {
           e.printStackTrace();
           return "fail";
       }
    }

    //查询已安排的手术室
    @GetMapping("/select-record")
    public List<Applyrecord> selectAll(){
        System.out.println("安排记录："+surgeryforService.selectRecord());
        return surgeryforService.selectRecord();
    }

    //安排手术室
    @RequestMapping("/insert-all")
    public String insertAll(@RequestBody Map<String,Object> map){
//        System.out.println("==========open==================");
        ObjectMapper mapper = new ObjectMapper();
        Surgeryfor surgeryfor = mapper.convertValue(map.get("surgery"),Surgeryfor.class);
        System.out.println("病人手术项目安排手术室诊疗卡："+surgeryfor.getRegisterClinic());

        Operation operation = mapper.convertValue(map.get("ation"),Operation.class);
//        System.out.println("手术室的使用状态手术室的名称："+operation.getMedicalName());

        Applyrecord applyrecord = new Applyrecord();//手术室安排
//        applyrecord.setOperationId(operation.getOperationId());//手术室id
        applyrecord.setAdditionalName(surgeryfor.getAdditionalName());//手术项目名称
        applyrecord.setRegisterName(surgeryfor.getRegisterName());//患者姓名
        applyrecord.setRegisterId(surgeryfor.getRegisterId());//住院号
        applyrecord.setAdditionalMoney(surgeryfor.getAdditionalMoney());//手术费用
//        applyrecord.setRegisiterClinic(surgeryfor.getRegisterClinic());//诊疗卡
        surgeryforService.addApply(applyrecord);//新增手术室使用记录

        surgeryforService.updateFor(surgeryfor.getRegisterId());//修改病人手术项目，改为已安排手术室

        surgeryforService.updateOperation(operation.getOperationId());//修改手术室的状态，（安排了手术后，手术室的状态改为1，已安排）

        return "ok";
    }

    //    查询状态为0的手术项目，为没有安排手术室的
    @GetMapping("/select-for")
    public List<Surgeryfor> selectFor(){
//        System.out.println(surgeryforService.selectFor());
        return surgeryforService.selectFor();
    }

    //    查询手术室，0为未使用的，根据科室名称选择
    @GetMapping("/select-operation")
    public List<Operation> selectOperation(String medicalName){
//        System.out.println("科室名称："+medicalName);
//        System.out.println("手术室："+surgeryforService.selectOperation(medicalName));
        return surgeryforService.selectOperation(medicalName);
    }
}
