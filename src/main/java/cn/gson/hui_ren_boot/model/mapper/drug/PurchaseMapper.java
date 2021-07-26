package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.PurchasePlan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseMapper {

    //新增采购计划单
    public void addPurchase(PurchasePlan purchasePlan);

    //查询所有未审核的采购计划单
    public List<PurchasePlan> allPurchase();

    //采购计划单审批通过
    public void trial(String purchaseId);

    //查询所有的采购计划单
    public List<PurchasePlan> findAllPurchase();
}
