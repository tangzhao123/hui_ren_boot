package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.Refund;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RefundMapper {
    //新增退费记录
    public void addRefund(Refund refund);

    //查询退费记录
    public List<Refund> selRefund(@Param("start") String start,@Param("end")String end,@Param("staffName")String staffName);
}
