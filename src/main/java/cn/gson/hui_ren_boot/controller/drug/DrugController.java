package cn.gson.hui_ren_boot.controller.drug;


import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import cn.gson.hui_ren_boot.model.service.drug.DrugInfoService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


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

    //查询处方跟医嘱的药品
    @RequestMapping("drugInfo-list")
    public Object findAllDrugInfo(Integer pageNo,Integer size,DrugInfo drugInfo){
        drugInfo.setDrugState(1L);
        //drugInfo.setDrugName("999感冒药");
        System.out.println(pageNo);
        System.out.println(size);
        System.out.println(drugInfo);
        return drugInfoService.findAllDrugInfoByPage(pageNo, size, drugInfo);
    }
}
