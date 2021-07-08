package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "TREATMENT_RECHARGE", schema = "HUIREN", catalog = "")
public class TreatmentRecharge {
    private long rechargeId;
    private String treatmentNo;
    private Date rechargeTime;
    private long rechargeMoney;

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
    public long getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(long rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreatmentRecharge that = (TreatmentRecharge) o;
        return rechargeId == that.rechargeId && rechargeMoney == that.rechargeMoney && Objects.equals(treatmentNo, that.treatmentNo) && Objects.equals(rechargeTime, that.rechargeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rechargeId, treatmentNo, rechargeTime, rechargeMoney);
    }

    public TreatmentRecharge() {
    }

    public TreatmentRecharge(long rechargeId, String treatmentNo, Date rechargeTime, long rechargeMoney) {
        this.rechargeId = rechargeId;
        this.treatmentNo = treatmentNo;
        this.rechargeTime = rechargeTime;
        this.rechargeMoney = rechargeMoney;
    }

    public TreatmentRecharge(String treatmentNo, long rechargeMoney) {
        this.treatmentNo = treatmentNo;
        this.rechargeMoney = rechargeMoney;
    }
}
