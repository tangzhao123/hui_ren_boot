package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 检验项目
 */
@Mapper
public interface ComboitemsMapper {
    public List<Comboitem> allCom(String itemName);
}
