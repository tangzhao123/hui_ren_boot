package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.TreatmentCardMapper;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RegisteredService {
    @Autowired
    TreatmentCardMapper treatmentCardMapper;

    public Object selLock(String treatmentCard){
        return treatmentCardMapper.selLock(treatmentCard);
    }
}
