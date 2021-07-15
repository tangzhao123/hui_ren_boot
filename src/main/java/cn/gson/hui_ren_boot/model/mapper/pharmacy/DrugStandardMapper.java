package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStandard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugStandardMapper {
    //查询药品规格表
    public List<DrugStandard> allStandard();
}
