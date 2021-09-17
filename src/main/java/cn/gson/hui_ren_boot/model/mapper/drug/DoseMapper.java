package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Dose;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DoseMapper {

    //新增发药详情表
    public void addDose(Dose dose);
}
