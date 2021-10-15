package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.GoBank;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoBanksMapper {

    public List<GoBank> goBank(@Param("goNum")String goNum,@Param("goBatch")String goBatch,@Param("drugName")String drugName);

}
