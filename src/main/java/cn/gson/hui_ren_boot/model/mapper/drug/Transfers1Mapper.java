package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Transfers;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Transfers1Mapper {

    //查询所有的调拨申请
    public List<Transfers> findAllTransfers();
}
