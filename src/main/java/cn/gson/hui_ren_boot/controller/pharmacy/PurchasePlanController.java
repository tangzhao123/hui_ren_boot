package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.PurchasePlan;
import cn.gson.hui_ren_boot.model.service.pharmacy.PurchasePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("PurchasePlan")
public class PurchasePlanController {
    @Autowired
    PurchasePlanService purchasePlanService;

    @RequestMapping("allPlan")
    public Object allPlanByPage(@RequestBody PurchasePlan purchasePlan){
        System.err.println(purchasePlan);
        return purchasePlanService.allPlanByPage(purchasePlan.getPageNo(),purchasePlan.getSize(),purchasePlan.getPurchaseId(), purchasePlan.getDrugName());
    }
}
