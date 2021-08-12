package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "REGISTER_TYPE", schema = "HUIREN", catalog = "")
public class RegisterType {
    private long typeNumber;
    private String typeName;
    private double typeMoney;

    @Id
    @Column(name = "TYPE_NUMBER")
    public long getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(long typeNumber) {
        this.typeNumber = typeNumber;
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
    @Column(name = "TYPE_MONEY")
    public double getTypeMoney() {
        return typeMoney;
    }

    public void setTypeMoney(double typeMoney) {
        this.typeMoney = typeMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegisterType that = (RegisterType) o;
        return typeNumber == that.typeNumber && Objects.equals(typeName, that.typeName) && Objects.equals(typeMoney, that.typeMoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeNumber, typeName, typeMoney);
    }
}
