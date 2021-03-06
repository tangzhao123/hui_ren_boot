package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;

import javax.persistence.*;
import java.util.Date;

/**
 * 就诊记录
 */
@Entity
@Table(name = "MEDICAL_RECORD_INFO", schema = "HUIREN", catalog = "")
public class MedicalRecordInfo {
    private long recordsId;
    private String recordsNo;
    private String treatmentNo;
    private String diagnosticRecord;
    private Date recordTime;
    private Staff outdoctor;
    private Medical medical;
    private OutpatientRegister outpatient;

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
    @Column(name = "RECORDS_ID")
    public long getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(long recordsId) {
        this.recordsId = recordsId;
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
    @Column(name = "TREATMENT_NO")
    public String getTreatmentNo() {
        return treatmentNo;
    }

    public void setTreatmentNo(String treatmentNo) {
        this.treatmentNo = treatmentNo;
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

}
