package cn.gson.hui_ren_boot.model.pojos.medical;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Applyrecord {
    private Long applyId;//记录2id
    private String operationId;//手术室id
    private String additionalName;//手术名称
    private String registerName;//患者姓名
    private String registerId;//住院号
    private Timestamp applyTime;//使用时间
    private Long additionalMoney;//手术费用
    private Long applyState;//状态
    private String regisiterClinic;//诊疗卡号

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
    @Column(name = "OPERATION_ID")
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
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
    public Timestamp getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Timestamp applyTime) {
        this.applyTime = applyTime;
    }

    @Basic
    @Column(name = "ADDITIONAL_MONEY")
    public Long getAdditionalMoney() {
        return additionalMoney;
    }

    public void setAdditionalMoney(Long additionalMoney) {
        this.additionalMoney = additionalMoney;
    }

    @Basic
    @Column(name = "APPLY_STATE")
    public Long getApplyState() {
        return applyState;
    }

    public void setApplyState(Long applyState) {
        this.applyState = applyState;
    }

    @Basic
    @Column(name = "REGISITER_CLINIC")
    public String getRegisiterClinic() {
        return regisiterClinic;
    }

    public void setRegisiterClinic(String regisiterClinic) {
        this.regisiterClinic = regisiterClinic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Applyrecord that = (Applyrecord) o;
        return Objects.equals(applyId, that.applyId) && Objects.equals(operationId, that.operationId) && Objects.equals(additionalName, that.additionalName) && Objects.equals(registerName, that.registerName) && Objects.equals(registerId, that.registerId) && Objects.equals(applyTime, that.applyTime) && Objects.equals(additionalMoney, that.additionalMoney) && Objects.equals(applyState, that.applyState) && Objects.equals(regisiterClinic, that.regisiterClinic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyId, operationId, additionalName, registerName, registerId, applyTime, additionalMoney, applyState, regisiterClinic);
    }

    @Override
    public String toString() {
        return "Applyrecord{" +
                "applyId=" + applyId +
                ", operationId='" + operationId + '\'' +
                ", additionalName='" + additionalName + '\'' +
                ", registerName='" + registerName + '\'' +
                ", registerId='" + registerId + '\'' +
                ", applyTime=" + applyTime +
                ", additionalMoney=" + additionalMoney +
                ", applyState=" + applyState +
                ", regisiterClinic='" + regisiterClinic + '\'' +
                '}';
    }
}
