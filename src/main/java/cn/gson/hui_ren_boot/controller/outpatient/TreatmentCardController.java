package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentRecharge;
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

    //充值，根据卡号修改余额
    @RequestMapping("/edit-balance")
    public void editBalance(@RequestBody TreatmentCard treatmentCard){
        treatmentCardService.editBalance(treatmentCard);
    }

    //挂失，根据卡号修改卡的状态
    @RequestMapping("/del-card")
    public void delCard(@RequestBody String treatmentNo){
        treatmentCardService.delCard(treatmentNo.substring(0,treatmentNo.length()-1));
    }

    //挂失，根据卡号修改卡的状态
    @RequestMapping("/unlock-card")
    public void unlock(@RequestBody String treatmentNo){
        treatmentCardService.unlock(treatmentNo.substring(0,treatmentNo.length()-1));
    }

    //查询账单
    @RequestMapping("/sel-recharge")
    public List<TreatmentRecharge> selRecharge(String treatmentNo){
        return treatmentCardService.selRecharge(treatmentNo);
    }
}
