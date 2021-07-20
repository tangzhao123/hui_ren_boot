package cn.gson.hui_ren_boot.model.pojos.hospital;

import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Advice {

    private long adviceSerial;//序号
    private String adviceId;//医嘱号
//    private String registerId;//住院号
    private Date adviceStart;//开始时间
    private String adviceSickbed;//床位号
//    private Long staffId;//医生编号
    private Long adviceCost;//医嘱类型
    private Long adviceType;//费用
    private Register register;//信息表
    private Staff staff;//医生
    @OneToOne
    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }
    @OneToOne
    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Id
    @Column(name = "ADVICE_SERIAL")
    public long getAdviceSerial() {
        return adviceSerial;
    }

    public void setAdviceSerial(long adviceSerial) {
        this.adviceSerial = adviceSerial;
    }

    @Basic
    @Column(name = "ADVICE_ID")
    public String getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(String adviceId) {
        this.adviceId = adviceId;
    }

//    @Basic
//    @Column(name = "REGISTER_ID")
//    public String getRegisterId() {
//        return registerId;
//    }
//
//    public void setRegisterId(String registerId) {
//        this.registerId = registerId;
//    }

    @Basic
    @Column(name = "ADVICE_START")
    public Date getAdviceStart() {
        return adviceStart;
    }

    public void setAdviceStart(Date adviceStart) {
        this.adviceStart = adviceStart;
    }

    @Basic
    @Column(name = "ADVICE_SICKBED")
    public String getAdviceSickbed() {
        return adviceSickbed;
    }

    public void setAdviceSickbed(String adviceSickbed) {
        this.adviceSickbed = adviceSickbed;
    }

//    @Basic
//    @Column(name = "STAFF_ID")
//    public Long getStaffId() {
//        return staffId;
//    }
//
//    public void setStaffId(Long staffId) {
//        this.staffId = staffId;
//    }

    @Basic
    @Column(name = "ADVICE_COST")
    public Long getAdviceCost() {
        return adviceCost;
    }

    public void setAdviceCost(Long adviceCost) {
        this.adviceCost = adviceCost;
    }

    @Basic
    @Column(name = "ADVICE_TYPE")
    public Long getAdviceType() {
        return adviceType;
    }

    public void setAdviceType(Long adviceType) {
        this.adviceType = adviceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advice advice = (Advice) o;
        return adviceSerial == advice.adviceSerial && Objects.equals(adviceId, advice.adviceId)  && Objects.equals(adviceStart, advice.adviceStart) && Objects.equals(adviceSickbed, advice.adviceSickbed) &&  Objects.equals(adviceCost, advice.adviceCost) && Objects.equals(adviceType, advice.adviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adviceSerial, adviceId, adviceStart, adviceSickbed,  adviceCost, adviceType);
    }
}
