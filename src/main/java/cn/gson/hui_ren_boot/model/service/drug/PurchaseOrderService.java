package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.OrderDetailsMapper;
import cn.gson.hui_ren_boot.model.mapper.drug.PurchaseMapper;
import cn.gson.hui_ren_boot.model.mapper.drug.PurchaseOrderMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.OrderDetails;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PurchaseOrderService {

    @Autowired
    OrderDetailsMapper orderDetailsMapper;

    @Autowired
    PurchaseOrderMapper purchaseOrderMapper;

    //新增采购订单表跟批量新增采购订单详表
    public void addPurchaseOrder(PurchaseOrder purchaseOrder, List<OrderDetails> orderDetails){
        purchaseOrderMapper.addPurchaseOrder(purchaseOrder);
        orderDetailsMapper.addOrderDetails(orderDetails);
    }
}
