package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.hospital.Hospital;
import cn.gson.hui_ren_boot.model.pojos.medical.TestResult;
import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecord;
import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecordInfo;
import cn.gson.hui_ren_boot.model.service.outpatient.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 门诊病历
 */
@RestController
@RequestMapping("/outpatient")
public class MedicalRecordController {
    @Autowired
    MedicalRecordService recordService;

    //新增门诊病历
    @RequestMapping("/add-record")
    public String addRecord(@RequestBody MedicalRecord medicalRecord){
        try{
            recordService.addRecord(medicalRecord);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    //新增就诊记录
    @RequestMapping("/add-info")
    public void addInfo(@RequestBody MedicalRecordInfo info){
        recordService.addInfo(info);
    }

    //新增住院申请
    @RequestMapping("/add-hospital")
    public String addHospital(@RequestBody Hospital hospital){
        try{
            recordService.addHospital(hospital);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    //查询当天的就诊记录
    @RequestMapping("/sel-info")
    public List<MedicalRecordInfo> selInfo(int medicalId,int staffId){
        return recordService.selInfo(medicalId, staffId);
    }

    //根据就诊记录号门诊查询检验结果
    @RequestMapping("/sel-test-result")
    public List<TestResult> selTestResult(String recordsNo){
        return recordService.selTestResult(recordsNo);
    }
}
