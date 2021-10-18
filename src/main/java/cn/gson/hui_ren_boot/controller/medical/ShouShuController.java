package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.hospital.Surgery;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.service.medical.ShouSHuService;
import cn.gson.hui_ren_boot.model.service.medical.SurgeryforService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class ShouShuController {
    @Autowired
    ShouSHuService service;

    @Autowired
    SurgeryforService surgeryfor;

    //执行手术
    @RequestMapping("/zhi-shoushu")
    public String xiushoushu(@RequestBody Map<String,Object> map){
        System.out.println("=============================");
       try{
           String surgeryFinish = map.get("surgeryFinish").toString();
           String surgeryResult = map.get("surgeryResult").toString();
           String registerId = map.get("registerId").toString();

           service.xiushoushu(Timestamp.valueOf(surgeryFinish),surgeryResult,registerId);
           return "ok";
       }catch (Exception e){
           e.printStackTrace();
           return "fail";
       }
    }

    //安排了手术室的
    @GetMapping("/sel-shoushu")
    public List<Surgery> selshoushu(){
        return service.selshoushu();
    }

    //新增手术结果
    @PostMapping("/add-shoushu")
    public String addshoushu(@RequestBody Surgery apxinxi){
        try{
            Surgery s = apxinxi;
            System.out.println("手术结果："+apxinxi);
            service.addshoushu(s);//新增手术结果
            //修改手术室状态，更具手术室号
            surgeryfor.updateOperation(s.getSurgeryOper());
            //把病人人的状态修改,根据住院号
            surgeryfor.updateFor(s.getRegisterId());
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    @GetMapping("/zhudao-dorctor")
    public List<Staff> zhudao(){
        return service.zhudao();
    }

    @GetMapping("/mazui-dorctor")
    public List<Staff> mazui(){
        return service.mazui();
    }
}
