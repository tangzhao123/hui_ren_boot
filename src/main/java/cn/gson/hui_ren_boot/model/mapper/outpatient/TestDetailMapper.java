package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TestDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 开检验项目详表
 */
@Mapper
public interface TestDetailMapper {
    public void addItemDetail(List<Comboitem> comboitems, String testNumber);

    //查询患者当次所开的检验项目
    public List<TestDetail> selItem(String recordsNo);
}
