package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.PlanDetailsMapper;
import cn.gson.hui_ren_boot.model.mapper.drug.PurchaseMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.PlanDetails;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.PurchasePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PurchaseService {

    @Autowired
    PurchaseMapper purchaseMapper;

    @Autowired
    PlanDetailsMapper planDetailsMapper;

    //新增采购计划单跟计划详单
    public void addPlanDetails(PurchasePlan purchasePlan, List<PlanDetails> planDetails){
        System.out.println(purchasePlan);
        System.out.println(planDetails);
        purchaseMapper.addPurchase(purchasePlan);
        planDetailsMapper.addDetails(planDetails,purchasePlan.getPurchaseId());
    }

    //查询所有未审核的采购计划单
    public Object allPurchaseByPage(Integer pageNo,Integer size){
        return purchaseMapper.allPurchase();
    }

    //根据采购单号查询详单号
    public List<PlanDetails> allDetails(String purchaseId){
        return planDetailsMapper.allDetails(purchaseId);
    }

    //通过采购计划单审核
    public void trial(String purchaseId){
        purchaseMapper.trial(purchaseId);
    }

    //更改采购计划单状态（根据采购计划生成采购订单）
    public void trials(String purchaseId){
        purchaseMapper.trials(purchaseId);
    }

    //查询所有的采购计划单
    public Object findAllPurchaseByPage(Integer pageNo,Integer size){
        return purchaseMapper.findAllPurchase();
    }
}
