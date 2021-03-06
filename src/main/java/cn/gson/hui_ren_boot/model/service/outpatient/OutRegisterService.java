package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.*;
import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecord;
import cn.gson.hui_ren_boot.model.pojos.outpatient.OutpatientRegister;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TestDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 门诊患者库
 */
@Service
@Transactional
public class OutRegisterService {
    @Autowired
    OutRegisterMapper outRegisterMapper;
    @Autowired
    MedicalRecordMapper medicalRecordMapper;
    @Autowired
    PrescriptionDetailMapper prescriptionDetailMapper;
    @Autowired
    TestDetailMapper testDetailMapper;

    //多条件分页查询
    public Object allRegisterByPage(Integer pageNo, Integer size, OutpatientRegister outpatientRegister){
        return outRegisterMapper.allRegister(outpatientRegister);
    }

    //根据患者编号查询病历
    public List<MedicalRecord> selRecord(int outpatientId){
        return medicalRecordMapper.selRecord(outpatientId);
    }

    //查询患者每次所开的处方
    public List<PrescriptionDetail> selMedicine(String recordsNo){
        return prescriptionDetailMapper.selMedicine(recordsNo);
    }

    //查询患者当次所开的检验项目
    public List<TestDetail> selItem(String recordsNo){
        return testDetailMapper.selItem(recordsNo);
    }
}
