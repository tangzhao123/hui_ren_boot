package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComboitemMapper {

    //体检项目查询
    public List<Comboitem> selectAll();
}
