package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugDeport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugDeportMapper {
    public List<DrugDeport> allDeport(DrugDeport deport);
}
