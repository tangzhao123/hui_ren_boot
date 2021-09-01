package cn.gson.hui_ren_boot.model.mapper.drug;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PharmacyDetailMapper {

    //根据药品编号修改药房库存
    public void updatePharmacyDetail(@Param("count") Long count,@Param("drugId") Long drugId);
}
