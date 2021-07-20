package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecord;
import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecordInfo;
import cn.gson.hui_ren_boot.model.service.outpatient.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 门诊病历
 */
@RestController
@RequestMapping("/outpatient")
public class MedicalRecordController {
    @Autowired
    MedicalRecordService recordService;

    public void addRecord(@RequestBody MedicalRecord medicalRecord){
        MedicalRecordInfo recordInfo = new MedicalRecordInfo();
        recordInfo.setRecordsNo(medicalRecord.getInfoNo());
        recordInfo.setTreatmentNo(medicalRecord.getTreatmentNo());
        recordInfo.setOutdoctor(medicalRecord.getOutdoctor());
        recordService.addRecord(recordInfo,medicalRecord);
    }
}
