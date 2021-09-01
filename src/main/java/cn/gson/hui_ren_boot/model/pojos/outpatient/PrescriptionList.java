package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PRESCRIPTION_LIST", schema = "HUIREN", catalog = "")
public class PrescriptionList {
    private long prescriptionId;
    private String prescriptionNo;
    private String recordNo;
    private Long prescriptionType;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date prescriptionDate;
    private String prescriptionDiagnosis;
    private String outpatientId;
    private Long staffId;
    private Long medicalId;
    private String doctorAdvice;
    private double sumMoney;
    private Long dosis;
    private String usage;
    private Long state;
    private MedicalRecordInfo info;
    private OutpatientRegister outpatient;
    private Staff outdoctor;
    private Medical medical;
    private List<PrescriptionDetail> details;

    @OneToOne
    public MedicalRecordInfo getInfo() {
        return info;
    }

    public void setInfo(MedicalRecordInfo info) {
        this.info = info;
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

    @OneToMany
    public List<PrescriptionDetail> getDetails() {
        return details;
    }

    public void setDetails(List<PrescriptionDetail> details) {
        this.details = details;
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
    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(Date prescriptionDate) {
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

    @Basic
    @Column(name = "SUM_MONEY")
    public double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(double sumMoney) {
        this.sumMoney = sumMoney;
    }

    @Basic
    @Column(name = "DOSIS")
    public Long getDosis() {
        return dosis;
    }

    public void setDosis(Long dosis) {
        this.dosis = dosis;
    }

    @Basic
    @Column(name = "USAGE")
    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Basic
    @Column(name = "STATE")
    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrescriptionList that = (PrescriptionList) o;
        return prescriptionId == that.prescriptionId && Objects.equals(prescriptionNo, that.prescriptionNo) && Objects.equals(recordNo, that.recordNo) && Objects.equals(prescriptionType, that.prescriptionType) && Objects.equals(prescriptionDate, that.prescriptionDate) && Objects.equals(prescriptionDiagnosis, that.prescriptionDiagnosis) && Objects.equals(outpatientId, that.outpatientId) && Objects.equals(staffId, that.staffId) && Objects.equals(medicalId, that.medicalId) && Objects.equals(doctorAdvice, that.doctorAdvice) && Objects.equals(sumMoney, that.sumMoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prescriptionId, prescriptionNo, recordNo, prescriptionType, prescriptionDate, prescriptionDiagnosis, outpatientId, staffId, medicalId, doctorAdvice, sumMoney);
    }

    @Override
    public String toString() {
        return "PrescriptionList{" +
                "prescriptionId=" + prescriptionId +
                ", prescriptionNo='" + prescriptionNo + '\'' +
                ", recordNo='" + recordNo + '\'' +
                ", prescriptionType=" + prescriptionType +
                ", prescriptionDate=" + prescriptionDate +
                ", prescriptionDiagnosis='" + prescriptionDiagnosis + '\'' +
                ", outpatientId='" + outpatientId + '\'' +
                ", staffId=" + staffId +
                ", medicalId=" + medicalId +
                ", doctorAdvice='" + doctorAdvice + '\'' +
                ", sumMoney=" + sumMoney +
                ", info=" + info +
                ", outpatient=" + outpatient +
                ", outdoctor=" + outdoctor +
                ", medical=" + medical +
                ", details=" + details +
                '}';
    }
}
