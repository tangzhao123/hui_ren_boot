package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugDeport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugDeportMapper {

    //查询所有的仓库
    public List<DrugDeport> finAllDeport();

    //修改仓库总库存数量
    public void updateDeport(@Param("deportStock") Integer deportStock,@Param("deportId") Long deportId );

    //修改仓库总库存数量
    public void updateDeports(@Param("deportStock") Integer deportStock,@Param("deportId") Long deportId );
}
