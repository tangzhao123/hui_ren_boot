package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Leave {

    private long leaveSerial;//序号
    private String leaveName;//患者名
    private String diagnosisId;//出院诊断
    private Date leaveDate;//出院日期
    private Long leaveAmount;//住院累计金额
    private String staffId;//操作员
    private Long leaveState;//结算状态 0退款，1补款
    private Long leaveArrears;//结算交的费用
    private String registerId;//住院号



    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "LEAVE_SERIAL")
    public long getLeaveSerial() {
        return leaveSerial;
    }

    public void setLeaveSerial(long leaveSerial) {
        this.leaveSerial = leaveSerial;
    }

    @Basic
    @Column(name = "LEAVE_NAME")
    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    @Basic
    @Column(name = "DIAGNOSIS_ID")
    public String getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(String diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    @Basic
    @Column(name = "LEAVE_DATE")
    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    @Basic
    @Column(name = "LEAVE_AMOUNT")
    public Long getLeaveAmount() {
        return leaveAmount;
    }

    public void setLeaveAmount(Long leaveAmount) {
        this.leaveAmount = leaveAmount;
    }

    @Basic
    @Column(name = "STAFF_ID")
    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }



    @Basic
    @Column(name = "LEAVE_STATE")
    public Long getLeaveState() {
        return leaveState;
    }

    public void setLeaveState(Long leaveState) {
        this.leaveState = leaveState;
    }

    @Basic
    @Column(name = "LEAVE_ARREARS")
    public Long getLeaveArrears() {
        return leaveArrears;
    }

    public void setLeaveArrears(Long leaveArrears) {
        this.leaveArrears = leaveArrears;
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
        Leave leave = (Leave) o;
        return leaveSerial == leave.leaveSerial && Objects.equals(leaveName, leave.leaveName) && Objects.equals(diagnosisId, leave.diagnosisId) && Objects.equals(leaveDate, leave.leaveDate) && Objects.equals(leaveAmount, leave.leaveAmount) && Objects.equals(staffId, leave.staffId)  && Objects.equals(leaveState, leave.leaveState) && Objects.equals(leaveArrears, leave.leaveArrears) && Objects.equals(registerId, leave.registerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leaveSerial, leaveName, diagnosisId, leaveDate, leaveAmount, staffId,leaveState, leaveArrears, registerId);
    }
}
