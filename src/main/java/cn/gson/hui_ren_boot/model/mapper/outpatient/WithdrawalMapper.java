package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.Withdrawal;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WithdrawalMapper {
    //新增退号单
    public void addDrawal(Withdrawal withdrawal);

    //查询退号单
    public List<Withdrawal> selBack();
}
