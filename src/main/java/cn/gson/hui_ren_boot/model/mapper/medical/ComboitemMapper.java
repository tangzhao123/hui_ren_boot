package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComboitemMapper {

    //体检项目查询
    public List<Comboitem> selectAll(Comboitem comboitem);

    //体检项目新增
    public void addComboitem(Comboitem comboitem);

    //修改体检项目
    public void updateComboitem(Comboitem comboitem);

    //查询项目的价格
    public List<Comboitem> selecitem(Long itemId);
}
