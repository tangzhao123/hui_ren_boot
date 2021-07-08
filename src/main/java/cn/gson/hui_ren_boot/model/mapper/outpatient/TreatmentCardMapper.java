package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 诊疗卡
 */
@Mapper
public interface TreatmentCardMapper {
    //多条件查询诊疗卡
    public List<TreatmentCard> allCard(TreatmentCard treatmentCard);

    //新增诊疗卡
    public void addCard(TreatmentCard treatmentCard);
}