package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DRUG_TYPE", schema = "HUIREN")
public class DrugType {
    private Long typeId;//类别编号
    private String typeName;//类别名称
    private Long typeSon;//子类别
    private String typeRank;//药级别

    @Id
    @Column(name = "TYPE_ID")
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "TYPE_NAME")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "TYPE_SON")
    public Long getTypeSon() {
        return typeSon;
    }

    public void setTypeSon(Long typeSon) {
        this.typeSon = typeSon;
    }

    @Basic
    @Column(name = "TYPE_RANK")
    public String getTypeRank() {
        return typeRank;
    }

    public void setTypeRank(String typeRank) {
        this.typeRank = typeRank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugType drugType = (DrugType) o;
        return Objects.equals(typeId, drugType.typeId) && Objects.equals(typeName, drugType.typeName) && Objects.equals(typeSon, drugType.typeSon) && Objects.equals(typeRank, drugType.typeRank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, typeName, typeSon, typeRank);
    }

    @Override
    public String toString() {
        return "DrugType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", typeSon=" + typeSon +
                ", typeRank='" + typeRank + '\'' +
                '}';
    }
}
