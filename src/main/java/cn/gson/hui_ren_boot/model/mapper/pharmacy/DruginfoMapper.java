package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DruginfoMapper {
    //查询处方选药
    public List<DrugInfo> allDrug(DrugInfo drugInfo);

    //修改药品状态
    public void allState(DrugInfo drugInfo);

    //新增药品
    public void addDrug(DrugInfo drugInfo);

}
