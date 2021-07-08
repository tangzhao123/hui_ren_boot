package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.service.outpatient.TreatmentCardService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 诊疗卡
 */
@RestController
@RequestMapping("/outpatient")
public class TreatmentCardController {
    @Autowired
    TreatmentCardService treatmentCardService;

    //多条件分页查询诊疗卡
    @RequestMapping("/all-card")
    public Object allCard(Integer pageNo,Integer size,String treatmentCard){
        TreatmentCard treatmentCards = JSONObject.toJavaObject(JSON.parseObject(treatmentCard),TreatmentCard.class);
        return treatmentCardService.allCardByPage(pageNo, size,treatmentCards);
    }

    //新增诊疗卡
    @RequestMapping("/add-card")
    public void addCard(@RequestBody TreatmentCard treatmentCard){
        System.out.println(1234);
        System.out.println(treatmentCard);
        treatmentCardService.addCard(treatmentCard);
    }
}