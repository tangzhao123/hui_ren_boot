package cn.gson.hui_ren_boot.model.pojos.medical;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Cmobo {
    private long comboId;
    private String comboName;
    private Long comboMoney;

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "COMBO_ID")
    public long getComboId() {
        return comboId;
    }

    public void setComboId(long comboId) {
        this.comboId = comboId;
    }

    @Basic
    @Column(name = "COMBO_NAME")
    public String getComboName() {
        return comboName;
    }

    public void setComboName(String comboName) {
        this.comboName = comboName;
    }

    @Basic
    @Column(name = "COMBO_MONEY")
    public Long getComboMoney() {
        return comboMoney;
    }

    public void setComboMoney(Long comboMoney) {
        this.comboMoney = comboMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cmobo cmobo = (Cmobo) o;
        return comboId == cmobo.comboId && Objects.equals(comboName, cmobo.comboName) && Objects.equals(comboMoney, cmobo.comboMoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comboId, comboName, comboMoney);
    }
}
