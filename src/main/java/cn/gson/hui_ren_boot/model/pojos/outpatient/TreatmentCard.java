package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.util.Objects;

/**
 * 诊疗卡
 */
@Entity
@Table(name = "TREATMENT_CARD", schema = "HUIREN", catalog = "")
public class TreatmentCard {
    private long treatmentId;
    private String treatmentNo;
    private String treatmentPassword;
    private Long treatmentBalance;
    private String treatmentName;
    private String treatmentCard;
    private Long treatmentLock;
    private long money;

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "TREATMENT_ID")
    public long getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(long treatmentId) {
        this.treatmentId = treatmentId;
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
    @Column(name = "TREATMENT_PASSWORD")
    public String getTreatmentPassword() {
        return treatmentPassword;
    }

    public void setTreatmentPassword(String treatmentPassword) {
        this.treatmentPassword = treatmentPassword;
    }

    @Basic
    @Column(name = "TREATMENT_BALANCE")
    public Long getTreatmentBalance() {
        return treatmentBalance;
    }

    public void setTreatmentBalance(Long treatmentBalance) {
        this.treatmentBalance = treatmentBalance;
    }

    @Basic
    @Column(name = "TREATMENT_NAME")
    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    @Basic
    @Column(name = "TREATMENT_CARD")
    public String getTreatmentCard() {
        return treatmentCard;
    }

    public void setTreatmentCard(String treatmentCard) {
        this.treatmentCard = treatmentCard;
    }

    @Basic
    @Column(name = "TREATMENT_LOCK")
    public Long getTreatmentLock() {
        return treatmentLock;
    }

    public void setTreatmentLock(Long treatmentLock) {
        this.treatmentLock = treatmentLock;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreatmentCard that = (TreatmentCard) o;
        return treatmentId == that.treatmentId && Objects.equals(treatmentNo, that.treatmentNo) && Objects.equals(treatmentPassword, that.treatmentPassword) && Objects.equals(treatmentBalance, that.treatmentBalance) && Objects.equals(treatmentName, that.treatmentName) && Objects.equals(treatmentCard, that.treatmentCard) && Objects.equals(treatmentLock, that.treatmentLock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treatmentId, treatmentNo, treatmentPassword, treatmentBalance, treatmentName, treatmentCard, treatmentLock);
    }

    @Override
    public String toString() {
        return "TreatmentCard{" +
                "treatmentId=" + treatmentId +
                ", treatmentNo='" + treatmentNo + '\'' +
                ", treatmentPassword='" + treatmentPassword + '\'' +
                ", treatmentBalance=" + treatmentBalance +
                ", treatmentName='" + treatmentName + '\'' +
                ", treatmentCard='" + treatmentCard + '\'' +
                ", treatmentLock=" + treatmentLock +
                '}';
    }
}
