package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.Withdrawal;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WithdrawalMapper {
    public void addDrawal(Withdrawal withdrawal);
}
