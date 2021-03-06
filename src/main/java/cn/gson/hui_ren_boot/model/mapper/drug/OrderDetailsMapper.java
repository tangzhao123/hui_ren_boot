package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.OrderDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailsMapper {

    //批量新增采购订单详表
    public void addOrderDetails(List<OrderDetails> orderDetails);

    //根据采购订单号查询采购订单详情
    public List<OrderDetails> findAllOrderDetails(String orderNum);
}
