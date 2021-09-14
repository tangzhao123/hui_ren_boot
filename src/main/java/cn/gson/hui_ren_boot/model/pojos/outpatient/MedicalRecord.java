package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;

import javax.persistence.*;
import java.util.Date;

/**
 * 门诊病历
 */
@Entity
@Table(name = "MEDICAL_RECORD", schema = "HUIREN", catalog = "")
public class MedicalRecord {
    private String recordNo;
    private String recordsNo;
    private String recordSymptom;
    private String recordResult;
    private String recordPlan;
    private String recordHpi;
    private String recordPh;
    private String recordFamily;
    private String checkUps;
    private String recordAssistant;
    private String outpatientAllergic;
    private Date onset;
    private String infoNo;
    private String treatmentNo;
    private OutpatientRegister outpatient;
    private MedicalRecordInfo medicalInfo;
    private Staff outdoctor;
    private Medical medical;

    @OneToOne
    public OutpatientRegister getOutpatient() {
        return outpatient;
    }

    public void setOutpatient(OutpatientRegister outpatient) {
        this.outpatient = outpatient;
    }

    @OneToOne
    public MedicalRecordInfo getMedicalInfo() {
        return medicalInfo;
    }

    public void setMedicalInfo(MedicalRecordInfo medicalInfo) {
        this.medicalInfo = medicalInfo;
    }

    @OneToOne
    public Staff getOutdoctor() {
        return outdoctor;
    }

    public void setOutdoctor(Staff outdoctor) {
        this.outdoctor = outdoctor;
    }

    @OneToOne
    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }

    @Id
    @Column(name = "RECORD_NO")
    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    @Basic
    @Column(name = "RECORDS_NO")
    public String getRecordsNo() {
        return recordsNo;
    }

    public void setRecordsNo(String recordsNo) {
        this.recordsNo = recordsNo;
    }

    @Basic
    @Column(name = "RECORD_SYMPTOM")
    public String getRecordSymptom() {
        return recordSymptom;
    }

    public void setRecordSymptom(String recordSymptom) {
        this.recordSymptom = recordSymptom;
    }

    @Basic
    @Column(name = "RECORD_RESULT")
    public String getRecordResult() {
        return recordResult;
    }

    public void setRecordResult(String recordResult) {
        this.recordResult = recordResult;
    }

    @Basic
    @Column(name = "RECORD_PLAN")
    public String getRecordPlan() {
        return recordPlan;
    }

    public void setRecordPlan(String recordPlan) {
        this.recordPlan = recordPlan;
    }

    @Basic
    @Column(name = "RECORD_HPI")
    public String getRecordHpi() {
        return recordHpi;
    }

    public void setRecordHpi(String recordHpi) {
        this.recordHpi = recordHpi;
    }

    @Basic
    @Column(name = "RECORD_PH")
    public String getRecordPh() {
        return recordPh;
    }

    public void setRecordPh(String recordPh) {
        this.recordPh = recordPh;
    }

    @Basic
    @Column(name = "RECORD_FAMILY")
    public String getRecordFamily() {
        return recordFamily;
    }

    public void setRecordFamily(String recordFamily) {
        this.recordFamily = recordFamily;
    }

    @Basic
    @Column(name = "CHECK_UPS")
    public String getCheckUps() {
        return checkUps;
    }

    public void setCheckUps(String checkUps) {
        this.checkUps = checkUps;
    }

    @Basic
    @Column(name = "RECORD_ASSISTANT")
    public String getRecordAssistant() {
        return recordAssistant;
    }

    public void setRecordAssistant(String recordAssistant) {
        this.recordAssistant = recordAssistant;
    }

    @Basic
    @Column(name = "OUTPATIENT_ALLERGIC")
    public String getOutpatientAllergic() {
        return outpatientAllergic;
    }

    public void setOutpatientAllergic(String outpatientAllergic) {
        this.outpatientAllergic = outpatientAllergic;
    }

    @Basic
    @Column(name = "ONSET")
    public Date getOnset() {
        return onset;
    }

    public void setOnset(Date onset) {
        this.onset = onset;
    }

    public String getInfoNo() {
        return infoNo;
    }

    public void setInfoNo(String infoNo) {
        this.infoNo = infoNo;
    }

    public String getTreatmentNo() {
        return treatmentNo;
    }

    public void setTreatmentNo(String treatmentNo) {
        this.treatmentNo = treatmentNo;
    }
}
