package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Hospital;
import cn.gson.hui_ren_boot.model.service.hospital.HospialService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/Hosptoals")
public class HosptoalController {
    @Autowired
    HospialService hospialService;
    @RequestMapping("/saveg")
    public String saveHospoal(@RequestBody Hospital p){//新增住院申请表
        try {
            Hospital   spat=  hospialService.allspital(p.getHospitalCard());//查询身份证重复
            System.out.println(spat);
            if(spat!=null){
                System.out.println(1);
                return"fail2";
            }else{
                System.out.println(p.getHospitalName());
                p.setHospitalDate(new Date());
                hospialService.saveHospoal(p);
                return"ok";
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println(1);
            return"fail";
        }


    }
    @RequestMapping("/allHospt")
    public Object allHopsts(Integer pageNo, Integer size,String shuk){
        Hospital hop= JSONObject.toJavaObject(JSON.parseObject(shuk),Hospital.class);
        return hospialService.allhosptialByPage(pageNo,size,hop);
    }
}
