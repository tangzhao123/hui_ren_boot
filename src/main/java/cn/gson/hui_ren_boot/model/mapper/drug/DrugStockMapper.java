package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugStockMapper {

    //新增库存表
    public void addDrugStock(List<DrugStock> drugStocks);

    //修改库存数量
    public void updateDrugStock(@Param("stockSurplus") Long stockSurplus, @Param("stockBatch") String stockBatch);

    //根据药品编号查询药品库存
    public List<DrugStock> findAllStock(Long drugId);

    //查询临期库存药品
    public List<DrugStock> findAllPeriod(List<String> stockBatch);

    //根据药品类别查询库存
    public List<DrugStock> allDrugStock(Long typeId);
}
