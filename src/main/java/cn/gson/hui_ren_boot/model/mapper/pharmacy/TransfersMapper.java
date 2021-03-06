package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Transfers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TransfersMapper {
    //查询调拨申请表
    public List<Transfers> allTransfers(@Param("transfersId")Long transfersId,@Param("drugName")String drugName);
    //新增调拨申请
    public void addTransfers(Transfers drugTransfers);

}
