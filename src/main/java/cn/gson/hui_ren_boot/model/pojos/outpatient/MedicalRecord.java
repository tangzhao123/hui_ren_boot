package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "MEDICAL_RECORD", schema = "HUIREN", catalog = "")
public class MedicalRecord {
    private String recordNo;
    private String outpatientId;
    private String recordId;
    private Long outdoctorId;
    private Date recordSymptom;
    private String recordResult;
    private String recordPlan;
    private String recordHpi;
    private String recordPh;
    private String recordFamily;
    private String checkUps;
    private String recordAssistant;
    private String outpatientAllergic;
    private OutpatientRegister outpatient;
    private MedicalRecordInfo medicalInfo;
    private Staff outdoctor;

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

    @Id
    @Column(name = "RECORD_NO")
    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    @Basic
    @Column(name = "OUTPATIENT_ID")
    public String getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(String outpatientId) {
        this.outpatientId = outpatientId;
    }

    @Basic
    @Column(name = "RECORD_ID")
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "OUTDOCTOR_ID")
    public Long getOutdoctorId() {
        return outdoctorId;
    }

    public void setOutdoctorId(Long outdoctorId) {
        this.outdoctorId = outdoctorId;
    }

    @Basic
    @Column(name = "RECORD_SYMPTOM")
    public Date getRecordSymptom() {
        return recordSymptom;
    }

    public void setRecordSymptom(Date recordSymptom) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalRecord that = (MedicalRecord) o;
        return Objects.equals(recordNo, that.recordNo) && Objects.equals(outpatientId, that.outpatientId) && Objects.equals(recordId, that.recordId) && Objects.equals(outdoctorId, that.outdoctorId) && Objects.equals(recordSymptom, that.recordSymptom) && Objects.equals(recordResult, that.recordResult) && Objects.equals(recordPlan, that.recordPlan) && Objects.equals(recordHpi, that.recordHpi) && Objects.equals(recordPh, that.recordPh) && Objects.equals(recordFamily, that.recordFamily) && Objects.equals(checkUps, that.checkUps) && Objects.equals(recordAssistant, that.recordAssistant) && Objects.equals(outpatientAllergic, that.outpatientAllergic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordNo, outpatientId, recordId, outdoctorId, recordSymptom, recordResult, recordPlan, recordHpi, recordPh, recordFamily, checkUps, recordAssistant, outpatientAllergic);
    }
}
