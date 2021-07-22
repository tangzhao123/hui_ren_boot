package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

/**
 * 门诊处方单
 */
@Entity
@Table(name = "PRESCRIPTION_LIST", schema = "HUIREN", catalog = "")
public class PrescriptionList {
    private long prescriptionId;
    private String prescriptionNo;
    private String recordNo;
    private Long prescriptionType;
    private Time prescriptionDate;
    private String prescriptionDiagnosis;
    private String outpatientId;
    private Long staffId;
    private Long medicalId;
    private String doctorAdvice;
    private List<PrescriptionDetail> details;
    private OutpatientRegister outpatient;
    private Staff outdoctor;
    private Medical medical;

    @OneToMany
    public List<PrescriptionDetail> getDetails() {
        return details;
    }

    public void setDetails(List<PrescriptionDetail> details) {
        this.details = details;
    }

    @OneToOne
    public OutpatientRegister getOutpatient() {
        return outpatient;
    }

    public void setOutpatient(OutpatientRegister outpatient) {
        this.outpatient = outpatient;
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
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "PRESCRIPTION_ID")
    public long getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(long prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    @Basic
    @Column(name = "PRESCRIPTION_NO")
    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    @Basic
    @Column(name = "RECORD_NO")
    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    @Basic
    @Column(name = "PRESCRIPTION_TYPE")
    public Long getPrescriptionType() {
        return prescriptionType;
    }

    public void setPrescriptionType(Long prescriptionType) {
        this.prescriptionType = prescriptionType;
    }

    @Basic
    @Column(name = "PRESCRIPTION_DATE")
    public Time getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(Time prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    @Basic
    @Column(name = "PRESCRIPTION_DIAGNOSIS")
    public String getPrescriptionDiagnosis() {
        return prescriptionDiagnosis;
    }

    public void setPrescriptionDiagnosis(String prescriptionDiagnosis) {
        this.prescriptionDiagnosis = prescriptionDiagnosis;
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
    @Column(name = "STAFF_ID")
    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "MEDICAL_ID")
    public Long getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Long medicalId) {
        this.medicalId = medicalId;
    }

    @Basic
    @Column(name = "DOCTOR_ADVICE")
    public String getDoctorAdvice() {
        return doctorAdvice;
    }

    public void setDoctorAdvice(String doctorAdvice) {
        this.doctorAdvice = doctorAdvice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrescriptionList that = (PrescriptionList) o;
        return prescriptionId == that.prescriptionId && Objects.equals(prescriptionNo, that.prescriptionNo) && Objects.equals(recordNo, that.recordNo) && Objects.equals(prescriptionType, that.prescriptionType) && Objects.equals(prescriptionDate, that.prescriptionDate) && Objects.equals(prescriptionDiagnosis, that.prescriptionDiagnosis) && Objects.equals(outpatientId, that.outpatientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prescriptionId, prescriptionNo, recordNo, prescriptionType, prescriptionDate, prescriptionDiagnosis, outpatientId);
    }
}
