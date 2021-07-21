package cn.gson.hui_ren_boot.model.pojos.hospital;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Details {

    private long detailsSerial;//序号
//    private Long drugId;//药品id
    private String detailsDrip;//滴速
    private String detailsWay;//用法
    private String datailsDosage;//临床用量
    private String daralisUsage;//用法
    private String daralisTime;//每天次数
    private String adviceId;//医嘱号
    private Long daralisCost;//费用
    private Long daralisDstate;//详情状况
    private Date daralisDisable;//停用时间
    private Date daralisStart;//开始时间
    private Long daralisPrice;//单价
    private String daralisId;//
    private DrugInfo drug;//药品表

    @OneToOne
    public DrugInfo getDrug() {
        return drug;
    }

    public void setDrug(DrugInfo drug) {
        this.drug = drug;
    }

    @Id
    @Column(name = "DETAILS_SERIAL")
    public long getDetailsSerial() {
        return detailsSerial;
    }

    public void setDetailsSerial(long detailsSerial) {
        this.detailsSerial = detailsSerial;
    }


    @Basic
    @Column(name = "DETAILS_DRIP")
    public String getDetailsDrip() {
        return detailsDrip;
    }

    public void setDetailsDrip(String detailsDrip) {
        this.detailsDrip = detailsDrip;
    }

    @Basic
    @Column(name = "DETAILS_WAY")
    public String getDetailsWay() {
        return detailsWay;
    }

    public void setDetailsWay(String detailsWay) {
        this.detailsWay = detailsWay;
    }

    @Basic
    @Column(name = "DATAILS_DOSAGE")
    public String getDatailsDosage() {
        return datailsDosage;
    }

    public void setDatailsDosage(String datailsDosage) {
        this.datailsDosage = datailsDosage;
    }

    @Basic
    @Column(name = "DARALIS_USAGE")
    public String getDaralisUsage() {
        return daralisUsage;
    }

    public void setDaralisUsage(String daralisUsage) {
        this.daralisUsage = daralisUsage;
    }

    @Basic
    @Column(name = "DARALIS_TIME")
    public String getDaralisTime() {
        return daralisTime;
    }

    public void setDaralisTime(String daralisTime) {
        this.daralisTime = daralisTime;
    }

    @Basic
    @Column(name = "ADVICE_ID")
    public String getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(String adviceId) {
        this.adviceId = adviceId;
    }

    @Basic
    @Column(name = "DARALIS_COST")
    public Long getDaralisCost() {
        return daralisCost;
    }

    public void setDaralisCost(Long daralisCost) {
        this.daralisCost = daralisCost;
    }

    @Basic
    @Column(name = "DARALIS_DSTATE")
    public Long getDaralisDstate() {
        return daralisDstate;
    }

    public void setDaralisDstate(Long daralisDstate) {
        this.daralisDstate = daralisDstate;
    }

    @Basic
    @Column(name = "DARALIS_DISABLE")
    public Date getDaralisDisable() {
        return daralisDisable;
    }

    public void setDaralisDisable(Date daralisDisable) {
        this.daralisDisable = daralisDisable;
    }

    @Basic
    @Column(name = "DARALIS_START")
    public Date getDaralisStart() {
        return daralisStart;
    }

    public void setDaralisStart(Date daralisStart) {
        this.daralisStart = daralisStart;
    }

    @Basic
    @Column(name = "DARALIS_PRICE")
    public Long getDaralisPrice() {
        return daralisPrice;
    }

    public void setDaralisPrice(Long daralisPrice) {
        this.daralisPrice = daralisPrice;
    }

    @Basic
    @Column(name = "DARALIS_ID")
    public String getDaralisId() {
        return daralisId;
    }

    public void setDaralisId(String daralisId) {
        this.daralisId = daralisId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details details = (Details) o;
        return detailsSerial == details.detailsSerial  && Objects.equals(detailsDrip, details.detailsDrip) && Objects.equals(detailsWay, details.detailsWay) && Objects.equals(datailsDosage, details.datailsDosage) && Objects.equals(daralisUsage, details.daralisUsage) && Objects.equals(daralisTime, details.daralisTime)&& Objects.equals(adviceId, details.adviceId) && Objects.equals(daralisCost, details.daralisCost) && Objects.equals(daralisDstate, details.daralisDstate) && Objects.equals(daralisDisable, details.daralisDisable) && Objects.equals(daralisStart, details.daralisStart) && Objects.equals(daralisPrice, details.daralisPrice) && Objects.equals(daralisId, details.daralisId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailsSerial, detailsDrip, detailsWay, datailsDosage, daralisUsage, daralisTime,adviceId,daralisCost, daralisDstate, daralisDisable, daralisStart, daralisPrice, daralisId);
    }
}
