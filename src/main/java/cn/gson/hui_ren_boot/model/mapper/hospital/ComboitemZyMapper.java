package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComboitemZyMapper {
    public List<Comboitem> allComboitem(Comboitem inputboxs);//查询项目表
}
