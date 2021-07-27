package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugConsumable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugConsumableMapper {

    //查询所有的耗材信息
    public List<DrugConsumable> findAllConsumable();
}
