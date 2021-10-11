package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.HospitalMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.MedicalRecordInfoMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.MedicalRecordMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Hospital;
import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecord;
import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecordInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Autowired
    HospitalMapper hospitalMapper;

    //新增门诊病历
    public void addRecord(MedicalRecord record){
        recordMapper.addRecord(record);
    }

    //新增就诊记录
    public void addInfo(MedicalRecordInfo info){
        infoMapper.addInfo(info);
    }

    //新增住院申请
    public void addHospital(Hospital hospital){
        hospitalMapper.addHospital(hospital);
    }

    //查询当天的就诊记录
    public List<MedicalRecordInfo> selInfo(int medicalId,int staffId){
        return infoMapper.selInfo(medicalId, staffId);
    }
}
