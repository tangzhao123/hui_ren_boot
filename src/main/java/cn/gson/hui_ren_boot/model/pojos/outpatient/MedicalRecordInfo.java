package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "MEDICAL_RECORD_INFO", schema = "HUIREN", catalog = "")
public class MedicalRecordInfo {
    private long recordId;
    private String recordNo;
    private String treatmentNo;
    private String outdoctorName;
    private long outdoctorNo;
    private long technicalOffice;
    private String diagnosticRecord;
    private Date recordTime;
    private Staff outdoctor;

    @OneToOne
    public Staff getOutdoctor() {
        return outdoctor;
    }

    public void setOutdoctor(Staff outdoctor) {
        this.outdoctor = outdoctor;
    }

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "RECORD_ID")
    public long getRecordId() {
        return recordId;
    }

    public void setRecordId(long recordId) {
        this.recordId = recordId;
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
    @Column(name = "TREATMENT_NO")
    public String getTreatmentNo() {
        return treatmentNo;
    }

    public void setTreatmentNo(String treatmentNo) {
        this.treatmentNo = treatmentNo;
    }

    @Basic
    @Column(name = "OUTDOCTOR_NAME")
    public String getOutdoctorName() {
        return outdoctorName;
    }

    public void setOutdoctorName(String outdoctorName) {
        this.outdoctorName = outdoctorName;
    }

    @Basic
    @Column(name = "OUTDOCTOR_NO")
    public long getOutdoctorNo() {
        return outdoctorNo;
    }

    public void setOutdoctorNo(long outdoctorNo) {
        this.outdoctorNo = outdoctorNo;
    }

    @Basic
    @Column(name = "TECHNICAL_OFFICE")
    public long getTechnicalOffice() {
        return technicalOffice;
    }

    public void setTechnicalOffice(long technicalOffice) {
        this.technicalOffice = technicalOffice;
    }

    @Basic
    @Column(name = "DIAGNOSTIC_RECORD")
    public String getDiagnosticRecord() {
        return diagnosticRecord;
    }

    public void setDiagnosticRecord(String diagnosticRecord) {
        this.diagnosticRecord = diagnosticRecord;
    }

    @Basic
    @Column(name = "RECORD_TIME")
    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalRecordInfo that = (MedicalRecordInfo) o;
        return recordId == that.recordId && outdoctorNo == that.outdoctorNo && technicalOffice == that.technicalOffice && Objects.equals(recordNo, that.recordNo) && Objects.equals(treatmentNo, that.treatmentNo) && Objects.equals(outdoctorName, that.outdoctorName) && Objects.equals(diagnosticRecord, that.diagnosticRecord) && Objects.equals(recordTime, that.recordTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, recordNo, treatmentNo, outdoctorName, outdoctorNo, technicalOffice, diagnosticRecord, recordTime);
    }
}
