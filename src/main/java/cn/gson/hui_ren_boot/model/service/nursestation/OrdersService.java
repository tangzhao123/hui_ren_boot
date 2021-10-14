package cn.gson.hui_ren_boot.model.service.nursestation;

import cn.gson.hui_ren_boot.model.mapper.nursestation.OrdersMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    @Autowired
    OrdersMapper ordersMapper;

    //查询医嘱详情（连表）
    public List<Advice> selAll(String registerId){
        return ordersMapper.selAll(registerId);
    }

    //新增执行记录
    public void insertOrders(Orders orders){
        ordersMapper.insertOrders(orders);
    }

    //修改医嘱详单状态
    public void updateOrder(String daralisMark){
        ordersMapper.updateOrder(daralisMark);
    }

    //医嘱详情
    public List<Details> selectDetails(String adviceId){
        return ordersMapper.selectDetails(adviceId);
    }

    //查询病人
    public List<Record> allBing(Record record){
        return ordersMapper.allBing(record);
    }

    //查询医嘱
    public List<Advice> selectAdvice(String registerId){
        return ordersMapper.selectAdvice(registerId);
    }
}
