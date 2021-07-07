package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * 门诊患者库
 */
@Entity
@Table(name = "OUTPATIENT_REGISTER", schema = "HUIREN")
public class OutpatientRegister {
    private String outpatientId;
    private String outpatientName;
    private int outpatientSex;
    private Date outpatientBirth;
    private String outpatientAge;
    private int outpatientMarry;
    private String outpatientVocation;
    private String outpatientNative;
    private String outpatientNation;
    private String outpatientCard;
    private String outpatientWork;
    private String outpatientPhone;
    private String outpatientAddress;
    private String outpatientWeight;
    private String outpatientBlood;

    @Id
    @Column(name = "OUTPATIENT_ID")
    public String getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(String outpatientId) {
        this.outpatientId = outpatientId;
    }

    @Basic
    @Column(name = "OUTPATIENT_NAME")
    public String getOutpatientName() {
        return outpatientName;
    }

    public void setOutpatientName(String outpatientName) {
        this.outpatientName = outpatientName;
    }

    @Basic
    @Column(name = "OUTPATIENT_SEX")
    public int getOutpatientSex() {
        return outpatientSex;
    }

    public void setOutpatientSex(int outpatientSex) {
        this.outpatientSex = outpatientSex;
    }

    @Basic
    @Column(name = "OUTPATIENT_BIRTH")
    public Date getOutpatientBirth() {
        return outpatientBirth;
    }

    public void setOutpatientBirth(Date outpatientBirth) {
        this.outpatientBirth = outpatientBirth;
    }

    @Basic
    @Column(name = "OUTPATIENT_AGE")
    public String getOutpatientAge() {
        return outpatientAge;
    }

    public void setOutpatientAge(String outpatientAge) {
        this.outpatientAge = outpatientAge;
    }

    @Basic
    @Column(name = "OUTPATIENT_MARRY")
    public int getOutpatientMarry() {
        return outpatientMarry;
    }

    public void setOutpatientMarry(int outpatientMarry) {
        this.outpatientMarry = outpatientMarry;
    }

    @Basic
    @Column(name = "OUTPATIENT_VOCATION")
    public String getOutpatientVocation() {
        return outpatientVocation;
    }

    public void setOutpatientVocation(String outpatientVocation) {
        this.outpatientVocation = outpatientVocation;
    }

    @Basic
    @Column(name = "OUTPATIENT_NATIVE")
    public String getOutpatientNative() {
        return outpatientNative;
    }

    public void setOutpatientNative(String outpatientNative) {
        this.outpatientNative = outpatientNative;
    }

    @Basic
    @Column(name = "OUTPATIENT_NATION")
    public String getOutpatientNation() {
        return outpatientNation;
    }

    public void setOutpatientNation(String outpatientNation) {
        this.outpatientNation = outpatientNation;
    }

    @Basic
    @Column(name = "OUTPATIENT_CARD")
    public String getOutpatientCard() {
        return outpatientCard;
    }

    public void setOutpatientCard(String outpatientCard) {
        this.outpatientCard = outpatientCard;
    }

    @Basic
    @Column(name = "OUTPATIENT_WORK")
    public String getOutpatientWork() {
        return outpatientWork;
    }

    public void setOutpatientWork(String outpatientWork) {
        this.outpatientWork = outpatientWork;
    }

    @Basic
    @Column(name = "OUTPATIENT_PHONE")
    public String getOutpatientPhone() {
        return outpatientPhone;
    }

    public void setOutpatientPhone(String outpatientPhone) {
        this.outpatientPhone = outpatientPhone;
    }

    @Basic
    @Column(name = "OUTPATIENT_ADDRESS")
    public String getOutpatientAddress() {
        return outpatientAddress;
    }

    public void setOutpatientAddress(String outpatientAddress) {
        this.outpatientAddress = outpatientAddress;
    }

    @Basic
    @Column(name = "OUTPATIENT_WEIGHT")
    public String getOutpatientWeight() {
        return outpatientWeight;
    }

    public void setOutpatientWeight(String outpatientWeight) {
        this.outpatientWeight = outpatientWeight;
    }

    @Basic
    @Column(name = "OUTPATIENT_BLOOD")
    public String getOutpatientBlood() {
        return outpatientBlood;
    }

    public void setOutpatientBlood(String outpatientBlood) {
        this.outpatientBlood = outpatientBlood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutpatientRegister that = (OutpatientRegister) o;
        return outpatientSex == that.outpatientSex && outpatientMarry == that.outpatientMarry && Objects.equals(outpatientId, that.outpatientId) && Objects.equals(outpatientName, that.outpatientName) && Objects.equals(outpatientBirth, that.outpatientBirth) && Objects.equals(outpatientAge, that.outpatientAge) && Objects.equals(outpatientVocation, that.outpatientVocation) && Objects.equals(outpatientNative, that.outpatientNative) && Objects.equals(outpatientNation, that.outpatientNation) && Objects.equals(outpatientCard, that.outpatientCard) && Objects.equals(outpatientWork, that.outpatientWork) && Objects.equals(outpatientPhone, that.outpatientPhone) && Objects.equals(outpatientAddress, that.outpatientAddress) && Objects.equals(outpatientWeight, that.outpatientWeight) && Objects.equals(outpatientBlood, that.outpatientBlood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outpatientId, outpatientName, outpatientSex, outpatientBirth, outpatientAge, outpatientMarry, outpatientVocation, outpatientNative, outpatientNation, outpatientCard, outpatientWork, outpatientPhone, outpatientAddress, outpatientWeight, outpatientBlood);
    }

    @Override
    public String toString() {
        return "OutpatientRegister{" +
                "outpatientName='" + outpatientName + '\'' +
                ", outpatientCard='" + outpatientCard + '\'' +
                ", outpatientPhone='" + outpatientPhone + '\'' +
                ", outpatientAddress='" + outpatientAddress + '\'' +
                '}';
    }
}
