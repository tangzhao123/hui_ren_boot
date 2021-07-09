package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DruginfoMapper {
    //分页查询药品信息
    public List<DrugInfo> allDrug(DrugInfo drugInfo);


}
