package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.TreatmentCardMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.TreatmentLossMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.TreatmentRechargeMapper;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentRecharge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 诊疗卡
 */
@Service
@Transactional
public class TreatmentCardService {
    @Autowired
    TreatmentCardMapper treatmentCardMapper;

    @Autowired
    TreatmentLossMapper treatmentLossMapper;

    @Autowired
    TreatmentRechargeMapper treatmentRechargeMapper;

    //多条件分页查询诊疗卡
    public Object allCardByPage(Integer pageNo,Integer size,TreatmentCard treatmentCard){
        return treatmentCardMapper.allCard(treatmentCard);
    }

    //新增诊疗卡
    public void addCard(TreatmentCard treatmentCard){
        treatmentCardMapper.addCard(treatmentCard);
    }

    //充值，根据卡号修改余额，同时新增诊疗卡充值记录
    public void editBalance(TreatmentCard treatmentCard){
        treatmentCardMapper.editBalance(treatmentCard);
        TreatmentRecharge recharge = new TreatmentRecharge(treatmentCard.getTreatmentNo(), treatmentCard.getMoney());
        treatmentRechargeMapper.addCharge(recharge);
    }

    //挂失，根据卡号修改卡的状态,同时新增诊疗卡挂失表
    public void delCard(String treatmentNo){
        treatmentCardMapper.delCard(treatmentNo);
        treatmentLossMapper.addLoss(treatmentNo);
    }
}
