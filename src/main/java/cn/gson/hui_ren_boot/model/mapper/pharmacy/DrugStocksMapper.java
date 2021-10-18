package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugStocksMapper {
    /*联表查询药品库存*/
    public List<DrugStock> seStock(@Param("drugName")String drugName,@Param("typeName")String typeName,@Param("stockBatch")String stockBatch);
}
