package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.TreatmentCardMapper;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 诊疗卡
 */
@Service
@Transactional
public class TreatmentCardService {
    @Autowired
    TreatmentCardMapper treatmentCardMapper;

    //多条件分页查询诊疗卡
    public Object allCardByPage(Integer pageNo,Integer size,TreatmentCard treatmentCard){
        return treatmentCardMapper.allCard(treatmentCard);
    }

    //新增诊疗卡
    public void addCard(TreatmentCard treatmentCard){
        treatmentCardMapper.addCard(treatmentCard);
    }
}
