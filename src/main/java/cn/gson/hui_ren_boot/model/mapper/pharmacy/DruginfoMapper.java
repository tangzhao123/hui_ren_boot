package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DruginfoMapper {
    //分页查询药品信息
    public List<DrugInfo> allDrug(DrugInfo drugInfo);

    //修改药品状态
    public DrugInfo allState(@Param("drugId")String id);


}
