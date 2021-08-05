package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStock;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugStockMapper {

    //新增库存表
    public void addDrugStock(List<DrugStock> drugStocks);
}
