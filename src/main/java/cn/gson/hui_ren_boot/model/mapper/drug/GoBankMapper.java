package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.GoBank;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoBankMapper {

    //新增出库单
    public void addGoBank(GoBank goBank);
}
