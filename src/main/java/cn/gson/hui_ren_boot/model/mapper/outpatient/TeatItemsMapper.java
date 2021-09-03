package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.TestItems;
import org.apache.ibatis.annotations.Mapper;

/**
 * 开检验项目
 */
@Mapper
public interface TeatItemsMapper {
    public void addItem(TestItems testItems);
}
