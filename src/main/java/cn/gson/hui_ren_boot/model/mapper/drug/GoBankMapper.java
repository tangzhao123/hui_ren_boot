package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.GoBank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoBankMapper {

    //新增出库单
    public void addGoBank(GoBank goBank);

    //查询历史出库记录
    public List<GoBank> findAllGoBank(String start,String end,String search);
}
