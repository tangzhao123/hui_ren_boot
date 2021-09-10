package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Allocating;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AllocatingMapper {

    //根据调拨单号查询详单
    List<Allocating> findAllAllocating(String transfersId);
}
