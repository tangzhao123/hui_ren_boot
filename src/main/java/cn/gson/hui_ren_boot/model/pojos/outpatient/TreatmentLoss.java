package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * 诊疗卡挂失
 */
@Entity
@Table(name = "TREATMENT_LOSS", schema = "HUIREN", catalog = "")
public class TreatmentLoss {
    private long lossId;
    private String treatmentNo;
    private Date lossTime;

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "LOSS_ID")
    public long getLossId() {
        return lossId;
    }

    public void setLossId(long lossId) {
        this.lossId = lossId;
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
    @Column(name = "LOSS_TIME")
    public Date getLossTime() {
        return lossTime;
    }

    public void setLossTime(Date lossTime) {
        this.lossTime = lossTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreatmentLoss that = (TreatmentLoss) o;
        return lossId == that.lossId && Objects.equals(treatmentNo, that.treatmentNo) && Objects.equals(lossTime, that.lossTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lossId, treatmentNo, lossTime);
    }
}
