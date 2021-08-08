package cn.gson.hui_ren_boot.model.pojos.hospital;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Record {//床位使用表
    private long recordId;//序号
    private String recordSerial;//床位记录编号
    private String sickbedMark;//床位号
    private String recordName;//使用人
    private Date recordDate;//使用日期
    private Date recordLeave;//结束日期
    private Long recordState;//占用情况
    private Long recordDays;//住院天数
    private String registerId;//住院号
    private Register register;//病人信息

    public Record() {
    }

    public Record(long recordId, String recordSerial, String sickbedMark, String recordName, Date recordDate, Date recordLeave, Long recordState, Long recordDays, String registerId, Register register) {
        this.recordId = recordId;
        this.recordSerial = recordSerial;
        this.sickbedMark = sickbedMark;
        this.recordName = recordName;
        this.recordDate = recordDate;
        this.recordLeave = recordLeave;
        this.recordState = recordState;
        this.recordDays = recordDays;
        this.registerId = registerId;
        this.register = register;
    }

    @OneToOne
    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
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
    @Column(name = "RECORD_SERIAL")
    public String getRecordSerial() {
        return recordSerial;
    }

    public void setRecordSerial(String recordSerial) {
        this.recordSerial = recordSerial;
    }

    @Basic
    @Column(name = "SICKBED_MARK")
    public String getSickbedMark() {
        return sickbedMark;
    }

    public void setSickbedMark(String sickbedMark) {
        this.sickbedMark = sickbedMark;
    }

    @Basic
    @Column(name = "RECORD_NAME")
    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }


    @Basic
    @Column(name = "RECORD_DATE")
    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    @Basic
    @Column(name = "RECORD_LEAVE")
    public Date getRecordLeave() {
        return recordLeave;
    }

    public void setRecordLeave(Date recordLeave) {
        this.recordLeave = recordLeave;
    }

    @Basic
    @Column(name = "RECORD_STATE")
    public Long getRecordState() {
        return recordState;
    }

    public void setRecordState(Long recordState) {
        this.recordState = recordState;
    }

    @Basic
    @Column(name = "RECORD_DAYS")
    public Long getRecordDays() {
        return recordDays;
    }

    public void setRecordDays(Long recordDays) {
        this.recordDays = recordDays;
    }

    @Basic
    @Column(name = "REGISTER_ID")
    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return recordId == record.recordId && Objects.equals(recordSerial, record.recordSerial) && Objects.equals( recordName, record. recordName) && Objects.equals(recordName, record.recordName) && Objects.equals(recordDate, record.recordDate) && Objects.equals(recordLeave, record.recordLeave) && Objects.equals(recordState, record.recordState) && Objects.equals(recordDays, record.recordDays) && Objects.equals(registerId, record.registerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, recordSerial,recordName, recordName, recordDate, recordLeave, recordState, recordDays, registerId);
    }

    @Override
    public String toString() {
        return "Record{" +
                "recordId=" + recordId +
                ", recordSerial='" + recordSerial + '\'' +
                ", sickbedMark='" + sickbedMark + '\'' +
                ", recordName='" + recordName + '\'' +
                ", recordDate=" + recordDate +
                ", recordLeave=" + recordLeave +
                ", recordState=" + recordState +
                ", recordDays=" + recordDays +
                ", registerId='" + registerId + '\'' +
                '}';
    }
}
