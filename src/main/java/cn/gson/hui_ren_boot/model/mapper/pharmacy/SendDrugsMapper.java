package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.SendDrug;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SendDrugsMapper {
    public List<SendDrug> send(@Param("sendNum")String sendNum,@Param("drugName")String drugName);
}
