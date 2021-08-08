package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Transfers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface Transfers1Mapper {

    //查询所有的调拨申请
    public List<Transfers> findAllTransfers();

    //新增调拨申请的出库时间出库单号出库仓库
    public void updateTransfers(@Param("transfersDate")Date transfersDate,@Param("transfersDeport") Long transfersDeport,@Param("transfersGo") String transfersGo);
}
