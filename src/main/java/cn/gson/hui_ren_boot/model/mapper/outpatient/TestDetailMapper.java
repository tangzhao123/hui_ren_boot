package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 开检验项目详表
 */
@Mapper
public interface TestDetailMapper {
    public void addItemDetail(List<Comboitem> comboitems, String testNumber);
}
