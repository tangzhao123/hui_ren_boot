package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.hospital.Additional;
import cn.gson.hui_ren_boot.model.service.medical.AdditionalService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionalController {
    @Autowired
    AdditionalService service;


    @RequestMapping("/add-itional")
    public String additional(@RequestBody Additional additional){
        try {
            System.out.println("项目："+additional.toString());
            Additional a = additional;
            System.out.println(a);
            if (additional.getAdditionalId() == null){
                service.additional(a); //新增手术项目
            }else{
                service.updateitional(a);
            }
            return "yes";
        }catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }

    //查询
    @GetMapping("/select-itional")
    public Object selectitonal(int pageNo,int size,String yuan){
        Additional a = JSONObject.parseObject(yuan,Additional.class);

        return service.selectitonalByPage(pageNo,size,a);
    }
}
