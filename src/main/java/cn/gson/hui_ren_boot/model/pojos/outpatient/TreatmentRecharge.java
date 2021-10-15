package cn.gson.hui_ren_boot.model.pojos.outpatient;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "TREATMENT_RECHARGE", schema = "HUIREN", catalog = "")
public class TreatmentRecharge {
    private long rechargeId;
    private String treatmentNo;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
    private Date rechargeTime;
    private double rechargeMoney;
    private String rechargeType;

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "RECHARGE_ID")
    public long getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(long rechargeId) {
        this.rechargeId = rechargeId;
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
    @Column(name = "RECHARGE_TIME")
    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    @Basic
    @Column(name = "RECHARGE_MONEY")
    public double getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(double rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    @Basic
    @Column(name = "RECHARGE_TYPE")
    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public TreatmentRecharge() {
    }

    public TreatmentRecharge(String treatmentNo, double rechargeMoney, String rechargeType) {
        this.treatmentNo = treatmentNo;
        this.rechargeMoney = rechargeMoney;
        this.rechargeType = rechargeType;
    }

    public TreatmentRecharge(String treatmentNo, double rechargeMoney) {
        this.treatmentNo = treatmentNo;
        this.rechargeMoney = rechargeMoney;
    }
}
