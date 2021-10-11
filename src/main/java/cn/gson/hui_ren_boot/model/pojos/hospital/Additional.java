package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Additional {
    private Long additionalId;//主键
    private String additionalName;//手术名称
    private Double additionalMoney;//金额
    private String additionalLevel;//手术级别
    private String additionalBlade;//切口
    private String medicalName;//科室名
    private Long additionaAnesthesia;//麻醉方式



    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "ADDITIONAL_ID")
    public Long getAdditionalId() {
        return additionalId;
    }

    public void setAdditionalId(Long additionalId) {
        this.additionalId = additionalId;
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
    public Double getAdditionalMoney() {
        return additionalMoney;
    }

    public void setAdditionalMoney(Double additionalMoney) {
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
    @Column(name = "MEDICAL_NAME")
    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName;
    }

    @Basic
    @Column(name = "ADDITIONA_ANESTHESIA")
    public Long getAdditionaAnesthesia() {
        return additionaAnesthesia;
    }

    public void setAdditionaAnesthesia(Long additionaAnesthesia) {
        this.additionaAnesthesia = additionaAnesthesia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Additional that = (Additional) o;
        return Objects.equals(additionalId, that.additionalId) && Objects.equals(additionalName, that.additionalName) && Objects.equals(additionalMoney, that.additionalMoney) && Objects.equals(additionalLevel, that.additionalLevel) && Objects.equals(additionalBlade, that.additionalBlade) && Objects.equals(medicalName, that.medicalName) && Objects.equals(additionaAnesthesia, that.additionaAnesthesia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalId, additionalName, additionalMoney, additionalLevel, additionalBlade, medicalName, additionaAnesthesia);
    }

    @Override
    public String toString() {
        return "Additional{" +
                "additionalId=" + additionalId +
                ", additionalName='" + additionalName + '\'' +
                ", additionalMoney=" + additionalMoney +
                ", additionalLevel='" + additionalLevel + '\'' +
                ", additionalBlade='" + additionalBlade + '\'' +
                ", medicalName='" + medicalName + '\'' +
                ", additionaAnesthesia=" + additionaAnesthesia +
                '}';
    }
}
