package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.MedicalRecordInfoMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.MedicalRecordMapper;
import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecord;
import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecordInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 门诊病历
 */
@Service
@Transactional
public class MedicalRecordService {
    @Autowired
    MedicalRecordMapper recordMapper;

    @Autowired
    MedicalRecordInfoMapper infoMapper;

    //新增门诊病历，同时新增就诊记录
    public void addRecord(MedicalRecordInfo info, MedicalRecord record){
        infoMapper.addInfo(info);
        recordMapper.addRecord(record);
    }
}
