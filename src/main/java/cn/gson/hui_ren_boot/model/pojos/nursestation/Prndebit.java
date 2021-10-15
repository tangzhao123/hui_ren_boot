package cn.gson.hui_ren_boot.model.pojos.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Details;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Prndebit {
    private long prndebitId;//主键
    private double prndebitSum;//扣费总额
    private String prndebitUser;//执行人
    private String registerId;//住院号
    private Date prndebitDate;//扣费时间
    private String adviceId;//医嘱号
    private String registerName;//患者名
    private List<Details> details;//医嘱详情周洋加
    @OneToMany
    public List<Details> getDetails() {
        return details;
    }

    public void setDetails(List<Details> details) {
        this.details = details;
    }

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "PRNDEBIT_ID")
    public long getPrndebitId() {
        return prndebitId;
    }

    public void setPrndebitId(long prndebitId) {
        this.prndebitId = prndebitId;
    }

    @Basic
    @Column(name = "PRNDEBIT_SUM")
    public double getPrndebitSum() {
        return prndebitSum;
    }

    public void setPrndebitSum(double prndebitSum) {
        this.prndebitSum = prndebitSum;
    }

    @Basic
    @Column(name = "PRNDEBIT_USER")
    public String getPrndebitUser() {
        return prndebitUser;
    }

    public void setPrndebitUser(String prndebitUser) {
        this.prndebitUser = prndebitUser;
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
    @Column(name = "PRNDEBIT_DATE")
    public Date getPrndebitDate() {
        return prndebitDate;
    }

    public void setPrndebitDate(Date prndebitDate) {
        this.prndebitDate = prndebitDate;
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
    @Column(name = "REGISTER_NAME")
    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prndebit prndebit = (Prndebit) o;
        return prndebitId == prndebit.prndebitId && Objects.equals(prndebitSum, prndebit.prndebitSum) && Objects.equals(prndebitUser, prndebit.prndebitUser) && Objects.equals(registerId, prndebit.registerId) && Objects.equals(prndebitDate, prndebit.prndebitDate) && Objects.equals(adviceId, prndebit.adviceId) && Objects.equals(registerName, prndebit.registerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prndebitId, prndebitSum, prndebitUser, registerId, prndebitDate, adviceId, registerName);
    }

    @Override
    public String toString() {
        return "Prndebit{" +
                "prndebitId=" + prndebitId +
                ", prndebitSum=" + prndebitSum +
                ", prndebitUser='" + prndebitUser + '\'' +
                ", registerId='" + registerId + '\'' +
                ", prndebitDate=" + prndebitDate +
                ", adviceId='" + adviceId + '\'' +
                ", registerName='" + registerName + '\'' +
                '}';
    }
}
