package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Cmobo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CmoboMapper {

    //查询体检套餐
    public List<Cmobo> seeCmobo();
}
