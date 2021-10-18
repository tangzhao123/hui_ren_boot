package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugCheck;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugChecksMapper {
    public List<DrugCheck> check(@Param("checkNo")String checkNo,@Param("drugName")String drugName);
}
