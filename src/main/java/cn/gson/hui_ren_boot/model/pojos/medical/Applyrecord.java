package cn.gson.hui_ren_boot.model.pojos.medical;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
public class Applyrecord {
    private Long applyId;//记录2id
    private String additionalName;//手术名称
    private String registerName;//患者姓名
    private String registerId;//住院号
    private Date applyTime;//扣费时间
    private Double additionalMoney;//手术费用


    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "APPLY_ID")
    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }



    @Basic
    @Column(name = "ADDITIONAL_NAME")
    public String getAdditionalName() {
        return additionalName;
    }

    public void setAdditionalName(String additionalName) {
        this.additionalName = additionalName;
    }

    @Basic
    @Column(name = "REGISTER_NAME")
    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
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
    @Column(name = "APPLY_TIME")
    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    @Basic
    @Column(name = "ADDITIONAL_MONEY")
    public Double getAdditionalMoney() {
        return additionalMoney;
    }

    public void setAdditionalMoney(Double additionalMoney) {
        this.additionalMoney = additionalMoney;
    }







    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Applyrecord that = (Applyrecord) o;
        return Objects.equals(applyId, that.applyId)  && Objects.equals(additionalName, that.additionalName) && Objects.equals(registerName, that.registerName) && Objects.equals(registerId, that.registerId) && Objects.equals(applyTime, that.applyTime) && Objects.equals(additionalMoney, that.additionalMoney) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyId, additionalName, registerName, registerId, applyTime, additionalMoney);
    }

    @Override
    public String toString() {
        return "Applyrecord{" +
                "applyId=" + applyId +
                ", additionalName='" + additionalName + '\'' +
                ", registerName='" + registerName + '\'' +
                ", registerId='" + registerId + '\'' +
                ", applyTime=" + applyTime +
                ", additionalMoney=" + additionalMoney +
                '}';
    }
}
