package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.PurchasePlanMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.PurchasePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PurchasePlanService {
    @Autowired
    PurchasePlanMapper purchasePlanMapper;
    public Object allPlanByPage(Integer pageNo, Integer size,String purchaseId,String drugName){
        return purchasePlanMapper.allPlan(purchaseId, drugName);
    }
}
