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
    
    //充值，根据卡号修改余额
    public void editBalance(TreatmentCard treatmentCard);

    //挂失，根据卡号修改卡的状态
    public void delCard(String treatmentNo);

    //解锁，根据卡号修改卡的状态
    public void unlock(String treatmentNo);

    //挂号时选择卡号，只显示未锁定的卡号，根据身份证号查询
    public List<TreatmentCard> selLock(String treatmentCard);
}
