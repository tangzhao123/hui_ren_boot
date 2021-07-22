package cn.gson.hui_ren_boot.controller.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.PlanDetails;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.PurchasePlan;
import cn.gson.hui_ren_boot.model.service.drug.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/Drug")
public class PlanDetailsController {

    @Autowired
    PurchaseService purchaseService;

    //生成随机单号
    public static String getOrderIdByTime() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate=sdf.format(new Date());
        String result="";
        Random random=new Random();
        for(int i=0;i<3;i++){
            result+=random.nextInt(10);
        }
        return newDate+result;
    }


    //新增采购计划单跟采购计划详单
    @RequestMapping("add-purchase")
    public String addPlanDetails(@RequestBody PurchasePlan purchasePlan){
       try{
           String dh = getOrderIdByTime();
           List<PlanDetails> p = purchasePlan.getPlanDetails();
           for (PlanDetails planDetails : p) {
               planDetails.setPlanSerial(dh);
           }
           purchaseService.addPlanDetails(purchasePlan, purchasePlan.getPlanDetails());
           return "ok";
       } catch (Exception e){
           e.printStackTrace();
           return "fail";
       }
    }

    //查询采购计划单
    @RequestMapping("all-purchase")
    public Object allPurchase(Integer pageNo,Integer size){
        return purchaseService.allPurchaseByPage(pageNo, size);
    }
}
