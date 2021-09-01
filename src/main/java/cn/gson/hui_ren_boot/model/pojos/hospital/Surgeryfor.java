package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Surgeryfor {

    private String surgeryforId;//主键
    private String registerName;//患者
    private String registerId;//住院号
    private String registerClinic;//诊疗卡
    private Date surgeryforDate;//申请时间
    private Long surgeryforState;//申请状态
    private String additionalName;//手术名
    private String additionalMoney;//手术费
    private String additionalLevel;//手术级别
    private String additionalBlade;//切口
    private String additionaAnesthesia;//麻醉方式


    @Id
    @Column(name = "SURGERYFOR_ID")
    public String getSurgeryforId() {
        return surgeryforId;
    }

    public void setSurgeryforId(String surgeryforId) {
        this.surgeryforId = surgeryforId;
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
    @Column(name = "REGISTER_CLINIC")
    public String getRegisterClinic() {
        return registerClinic;
    }

    public void setRegisterClinic(String registerClinic) {
        this.registerClinic = registerClinic;
    }

    @Basic
    @Column(name = "SURGERYFOR_DATE")
    public Date getSurgeryforDate() {
        return surgeryforDate;
    }

    public void setSurgeryforDate(Date surgeryforDate) {
        this.surgeryforDate = surgeryforDate;
    }

    @Basic
    @Column(name = "SURGERYFOR_STATE")
    public Long getSurgeryforState() {
        return surgeryforState;
    }

    public void setSurgeryforState(Long surgeryforState) {
        this.surgeryforState = surgeryforState;
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
    @Column(name = "ADDITIONAL_MONEY")
    public String getAdditionalMoney() {
        return additionalMoney;
    }

    public void setAdditionalMoney(String additionalMoney) {
        this.additionalMoney = additionalMoney;
    }

    @Basic
    @Column(name = "ADDITIONAL_LEVEL")
    public String getAdditionalLevel() {
        return additionalLevel;
    }

    public void setAdditionalLevel(String additionalLevel) {
        this.additionalLevel = additionalLevel;
    }

    @Basic
    @Column(name = "ADDITIONAL_BLADE")
    public String getAdditionalBlade() {
        return additionalBlade;
    }

    public void setAdditionalBlade(String additionalBlade) {
        this.additionalBlade = additionalBlade;
    }

    @Basic
    @Column(name = "ADDITIONA_ANESTHESIA")
    public String getAdditionaAnesthesia() {
        return additionaAnesthesia;
    }

    public void setAdditionaAnesthesia(String additionaAnesthesia) {
        this.additionaAnesthesia = additionaAnesthesia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Surgeryfor that = (Surgeryfor) o;
        return Objects.equals(surgeryforId, that.surgeryforId) && Objects.equals(registerName, that.registerName) && Objects.equals(registerId, that.registerId) && Objects.equals(registerClinic, that.registerClinic) && Objects.equals(surgeryforDate, that.surgeryforDate) && Objects.equals(surgeryforState, that.surgeryforState) && Objects.equals(additionalName, that.additionalName) && Objects.equals(additionalMoney, that.additionalMoney) && Objects.equals(additionalLevel, that.additionalLevel) && Objects.equals(additionalBlade, that.additionalBlade) && Objects.equals(additionaAnesthesia, that.additionaAnesthesia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surgeryforId, registerName, registerId, registerClinic, surgeryforDate, surgeryforState, additionalName, additionalMoney, additionalLevel, additionalBlade, additionaAnesthesia);
    }
}
