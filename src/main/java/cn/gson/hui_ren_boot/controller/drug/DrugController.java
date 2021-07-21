package cn.gson.hui_ren_boot.controller.drug;


import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import cn.gson.hui_ren_boot.model.service.drug.DrugInfoService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Drug")
public class DrugController {

    @Autowired
    DrugInfoService drugInfoService;

    //根据供货商，药品名称，药品类别查询药品
    @RequestMapping("drug-info-list")
    public Object allDrugInfo(Integer pageNo,Integer size, String drugInfo){
        System.out.println(drugInfo);
        DrugInfo drugInfos = JSONObject.toJavaObject(JSON.parseObject(drugInfo), DrugInfo.class);
        return drugInfoService.allDrugInfoByPage(pageNo, size, drugInfos);
    }
}
