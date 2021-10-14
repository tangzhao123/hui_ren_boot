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

    //驳回采购计划
    public void trial1(String purchaseId);

    //更改采购计划单状态（根据采购计划生成采购订单）
    public void trials(String purchaseId);

    //查询所有的采购计划单
    public List<PurchasePlan> findAllPurchase();
}
