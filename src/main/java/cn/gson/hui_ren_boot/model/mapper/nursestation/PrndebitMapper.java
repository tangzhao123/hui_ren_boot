package cn.gson.hui_ren_boot.model.mapper.nursestation;

import cn.gson.hui_ren_boot.model.pojos.nursestation.Prndebit;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PrndebitMapper {
    //新增执行医嘱扣费记录
    public void addPrndebit(Prndebit prndebit);

    //查询诊疗卡的余额
    public List<TreatmentCard> selectCard(@Param("treatmentNo") String treatmentNo);

    //修改诊疗卡的余额
    public void updateCard(@Param("treatmentBalance")double treatmentBalance,@Param("treatmentNo")String treatmentNo);
}
