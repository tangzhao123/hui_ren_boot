package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DrugtypeMapper {
    //查询药品新增类别
    public List<DrugType> allType();
}
