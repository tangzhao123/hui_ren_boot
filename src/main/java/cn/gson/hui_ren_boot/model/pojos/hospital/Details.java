package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Details {

    private long detailsSerial;//序号
    private String drugName;//药品名
    private String detailsDrip;//滴速
    private String datailsDosage;//临床用量
    private String daralisUsage;//用法
    private String daralisTime;//每天次数
    private String adviceId;//医嘱号
    private Long  daralisDstate;//详情状况
    private Date daralisDisable;//停用时间1
    private Date daralisStart;//开始时间
    private Long daralisPrice;//单价
    private Long daralisNumber;//药品数量
    private String standardUse;//剂型
    private String daralisMark;//医嘱详情号
    private String registerId;//住院号
    private double detailsMoney;//金额
    private Long drugRecipe;//处方非处方药
    private String standardName;//规格

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "DETAILS_SERIAL")
    public long getDetailsSerial() {
        return detailsSerial;
    }

    public void setDetailsSerial(long detailsSerial) {
        this.detailsSerial = detailsSerial;
    }
    @Basic
    @Column(name = "DRUG_RECIPE")
    public Long getDrugRecipe() {
        return drugRecipe;
    }
    @Basic
    @Column(name = "STANDARD_NAME")
    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public void setDrugRecipe(Long drugRecipe) {
        this.drugRecipe = drugRecipe;
    }

    @Basic
    @Column(name = "DARALIS_MARK")
    public String getDaralisMark() {
        return daralisMark;
    }

    public void setDaralisMark(String daralisMark) {
        this.daralisMark = daralisMark;
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
    @Column(name = "DETAILS_MONEY")
    public double getDetailsMoney() {
        return detailsMoney;
    }

    public void setDetailsMoney(double detailsMoney) {
        this.detailsMoney = detailsMoney;
    }

    @Basic
    @Column(name = "DRUG_NAME")
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
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
    @Column(name = "DARALIS_NUMBER")
    public Long getDaralisNumber() {
        return daralisNumber;
    }

    public void setDaralisNumber(Long daralisNumber) {
        this.daralisNumber = daralisNumber;
    }





    @Basic
    @Column(name = "STANDARD_USE")
    public String getStandardUse() {
        return standardUse;
    }

    public void setStandardUse(String standardUse) {
        this.standardUse = standardUse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details details = (Details) o;
        return detailsSerial == details.detailsSerial && Objects.equals(drugName, details.drugName) && Objects.equals(detailsDrip, details.detailsDrip)  && Objects.equals(daralisUsage, details.daralisUsage) && Objects.equals(daralisTime, details.daralisTime) && Objects.equals(adviceId, details.adviceId) && Objects.equals(daralisDstate, details.daralisDstate) && Objects.equals(daralisDisable, details.daralisDisable) && Objects.equals(daralisStart, details.daralisStart) && Objects.equals(daralisPrice, details.daralisPrice) && Objects.equals(daralisNumber, details.daralisNumber) && Objects.equals(standardUse, details.standardUse)&& Objects.equals(daralisMark, details.daralisMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailsSerial, drugName, detailsDrip, datailsDosage, daralisUsage, daralisTime, adviceId, daralisDstate, daralisDisable, daralisStart, daralisPrice, daralisNumber,standardUse,daralisMark);
    }

    @Override
    public String toString() {
        return "Details{" +
                "detailsSerial=" + detailsSerial +
                ", drugName='" + drugName + '\'' +
                ", detailsDrip='" + detailsDrip + '\'' +
                ", datailsDosage='" + datailsDosage + '\'' +
                ", daralisUsage='" + daralisUsage + '\'' +
                ", daralisTime='" + daralisTime + '\'' +
                ", adviceId='" + adviceId + '\'' +
                ", daralisDstate=" + daralisDstate +
                ", daralisDisable=" + daralisDisable +
                ", daralisStart=" + daralisStart +
                ", daralisPrice=" + daralisPrice +
                ", daralisNumber=" + daralisNumber +
                ", standardUse='" + standardUse + '\'' +
                ", daralisMark='" + daralisMark + '\'' +
                ", registerId='" + registerId + '\'' +
                '}';
    }
}
