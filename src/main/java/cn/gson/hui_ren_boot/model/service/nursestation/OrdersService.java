package cn.gson.hui_ren_boot.model.service.nursestation;

import cn.gson.hui_ren_boot.model.mapper.nursestation.OrdersMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Orders;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    @Autowired
    OrdersMapper ordersMapper;


    //查询医嘱详情（连表）
    public List<Advice> selAll(Long adviceCost,String registerId){
        return ordersMapper.selAll(Long.valueOf(adviceCost),registerId);
    }

    //新增执行记录
    public void insertOrders(Orders orders){
        ordersMapper.insertOrders(orders);
    }

    //修改临时医嘱的状态
    public void updateAdvice(String registerId){
        ordersMapper.updateAdvice(registerId);
    }

    //医嘱详情
    public List<Details> selectDetails(String adviceId){
        return ordersMapper.selectDetails(adviceId);
    }

    //查询病人
    public List<Register> allBing(Register record){
        return ordersMapper.allBing(record);
    }

    //查询医嘱
    public List<Advice> selectAdvice(String registerId){
        return ordersMapper.selectAdvice(registerId);
    }
}
