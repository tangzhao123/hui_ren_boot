package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugDeport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugDeportMapper {

    //查询所有的仓库
    public List<DrugDeport> finAllDeport();
}
