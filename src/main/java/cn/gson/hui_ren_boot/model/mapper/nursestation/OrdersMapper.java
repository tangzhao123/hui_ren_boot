package cn.gson.hui_ren_boot.model.mapper.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersMapper {

    //查询医嘱详情（连表）
    public List<Advice> selAll(String registerId);

    //新增执行记录
    public void insertOrders(Orders orders);

    //修改医嘱详单状态
    public void updateOrder(String daralisMark);

    //医嘱详情
    public List<Details> selectDetails(String adviceId);

    //查询病人
    public List<Record> allBing(Record record);

    //查询医嘱
    public List<Advice> selectAdvice(String registerId);
}
