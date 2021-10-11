package cn.gson.hui_ren_boot.model.service.nursestation;

import cn.gson.hui_ren_boot.model.mapper.nursestation.PrndebitMapper;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Prndebit;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrndebitService {
    @Autowired
    PrndebitMapper prndebitMapper;//医嘱执行扣费记录表

    //新增执行医嘱扣费记录
    public void addPrndebit(Prndebit prndebit){
        prndebitMapper.addPrndebit(prndebit);
    }

    //查询诊疗卡的余额
    public List<TreatmentCard> selectCard(String treatmentNo){
        return prndebitMapper.selectCard(treatmentNo);
    }

    //修改诊疗卡的余额
    public void updateCard(Long treatmentBalance,String treatmentNo){
        prndebitMapper.updateCard(treatmentBalance,treatmentNo);
    }
}
