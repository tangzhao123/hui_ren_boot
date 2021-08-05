package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.WarehouseEntry;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WareHouseEntryMapper {

    //新增入库单
    public void addWareHouseEntry(WarehouseEntry warehouseEntry);
}
