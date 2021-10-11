package cn.gson.hui_ren_boot.controller.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.OrderDetails;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.PurchaseOrder;
import cn.gson.hui_ren_boot.model.service.drug.PurchaseOrderService;
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
public class PurchaseOrderController {

    @Autowired
    PurchaseOrderService purchaseOrderService;

    @Autowired
    PurchaseService purchaseService;

    //生成随机单号
    public static String getOrderIdByTime() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        String newDate=sdf.format(new Date());
        String result="";
        String str = "CGDDXQ";
        Random random=new Random();
        for(int i=0;i<3;i++){
            result+=random.nextInt(10);
        }
        return str+newDate+result;
    }

    //新增采购订单跟订单详情
    @RequestMapping("add-purchaseOrder")
    public String addPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder){
        try {
            System.out.println(purchaseOrder);
            List<OrderDetails> o = purchaseOrder.getOrderDetails();
            for (OrderDetails orderDetails : o) {
                orderDetails.setOrdersId(getOrderIdByTime());
            }
           purchaseOrderService.addPurchaseOrder(purchaseOrder,purchaseOrder.getOrderDetails());
           purchaseService.trials(purchaseOrder.getPurchaseDetails());
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //查询所有的采购订单
    @RequestMapping("purchaseOrder-list")
    public Object findAllPurchaseOrder(Integer pageNo,Integer size){
        return purchaseOrderService.findAllPurchaseOrderByPage(pageNo, size);
    }

    //根据采购订单号查询采购详单
    @RequestMapping("orderDetails-list")
    public List<OrderDetails> findAllOrderDetails(String orderNum){
        return purchaseOrderService.findAllOrderDetails(orderNum);
    }
}
