package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.PurchaseOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseOrderMapper {

    //新增采购订单
    public void addPurchaseOrder(PurchaseOrder purchaseOrder);

    //查询所有的采购订单
    public List<PurchaseOrder> findAllPurchaseOrder();

    //修改入库日期
    public void updatePurchaseOrder(String orderId);
}
