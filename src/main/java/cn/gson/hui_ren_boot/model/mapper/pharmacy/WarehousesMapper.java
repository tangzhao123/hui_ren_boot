package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.WarehouseEntry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WarehousesMapper {
    public List<WarehouseEntry> house(@Param("entrySerial")String entrySerial,@Param("entryBatch")String entryBatch,@Param("drugName")String drugName);
}
