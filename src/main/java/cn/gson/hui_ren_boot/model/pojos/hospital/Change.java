package cn.gson.hui_ren_boot.model.pojos.hospital;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Change {

    private long changeId;//id
    private String changeName;//患者名
    private String registerId;//住院号
    private String changeReason;//转科原因
    private String changeDoctor;//医生姓名
    private String changeState;//申请状态
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
    private Date changeDate;//申请时间
    private String medicalName;//科室名
    private String medicalstartName;//原科室
    private String staffName;//新医生

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "CHANGE_ID")
    public long getChangeId() {
        return changeId;
    }

    public void setChangeId(long changeId) {
        this.changeId = changeId;
    }
    @Basic
    @Column(name = "STAFF_NAME")
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Basic
    @Column(name = "CHANGE_NAME")
    public String getChangeName() {
        return changeName;
    }

    public void setChangeName(String changeName) {
        this.changeName = changeName;
    }
    @Basic
    @Column(name = "MEDICAL_NAME")
    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName;
    }
    @Basic
    @Column(name = "MEDICAL_STARTNAME")
    public String getMedicalstartName() {
        return medicalstartName;
    }

    public void setMedicalstartName(String medicalstartName) {
        this.medicalstartName = medicalstartName;
    }








    @Basic
    @Column(name = "REGISTER_ID")
    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    @Basic
    @Column(name = "CHANGE_REASON")
    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    @Basic
    @Column(name = "CHANGE_DOCTOR")
    public String getChangeDoctor() {
        return changeDoctor;
    }

    public void setChangeDoctor(String changeDoctor) {
        this.changeDoctor = changeDoctor;
    }

    @Basic
    @Column(name = "CHANGE_STATE")
    public String getChangeState() {
        return changeState;
    }

    public void setChangeState(String changeState) {
        this.changeState = changeState;
    }

    @Basic
    @Column(name = "CHANGE_DATE")
    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Change change = (Change) o;
        return changeId == change.changeId && Objects.equals(changeName, change.changeName) && Objects.equals(registerId, change.registerId) && Objects.equals(changeReason, change.changeReason) && Objects.equals(changeDoctor, change.changeDoctor) && Objects.equals(changeState, change.changeState) && Objects.equals(changeDate, change.changeDate)&& Objects.equals(medicalstartName, change.medicalstartName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeId, changeName, registerId, changeReason, changeDoctor, changeState, changeDate,medicalstartName);
    }

    @Override
    public String toString() {
        return "Change{" +
                "changeId=" + changeId +
                ", changeName='" + changeName + '\'' +
                ", registerId='" + registerId + '\'' +
                ", changeReason='" + changeReason + '\'' +
                ", changeDoctor='" + changeDoctor + '\'' +
                ", changeState='" + changeState + '\'' +
                ", changeDate=" + changeDate +
                ", medicalName='" + medicalName + '\'' +
                '}';
    }
}
