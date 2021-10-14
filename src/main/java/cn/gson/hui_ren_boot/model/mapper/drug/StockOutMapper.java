package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Stockout;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface  StockOutMapper {

    //批量新增出库详单
    public void addStockOut(List<Stockout> storageData,String stockoutGo);

    //根据出库单号查询出库详单
    public List<Stockout> findAllStockOut(String stockoutGo);
}
