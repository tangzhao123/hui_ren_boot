package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Inventory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InventoryMapper {

    //批量新增盘点详情表
    public void addInventory(List<Inventory> inventoryData,String inventoryCheck);

    //根据盘点单号查询
    public List<Inventory> findAllInventory(String inventoryCheck);
}
