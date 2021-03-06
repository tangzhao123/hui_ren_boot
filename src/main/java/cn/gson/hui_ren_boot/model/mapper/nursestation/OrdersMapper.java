package cn.gson.hui_ren_boot.model.mapper.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrdersMapper {


    //查询医嘱详情（连表）
    public List<Advice> selAll(@Param("adviceCost") Long adviceCost,@Param("registerId") String registerId);

    //新增执行记录
    public void insertOrders(Orders orders);

    //修改临时医嘱的状态
    public void updateAdvice(String registerId);

    //医嘱详情
    public List<Details> selectDetails(String adviceId);

    //查询病人
    public List<Register> allBing(Register record);

    //查询医嘱
    public List<Advice> selectAdvice(String registerId);
}
