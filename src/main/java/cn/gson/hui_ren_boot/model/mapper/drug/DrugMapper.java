package cn.gson.hui_ren_boot.model.mapper.drug;


import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugMapper {

    //根据供货商，药品名称，药品类别查询药品
    public List<DrugInfo> allDrugInfo(DrugInfo drugInfo);

    //查询处方跟医嘱的药品
    public List<DrugInfo> findAllDrugInfo(DrugInfo drugInfo);
}
