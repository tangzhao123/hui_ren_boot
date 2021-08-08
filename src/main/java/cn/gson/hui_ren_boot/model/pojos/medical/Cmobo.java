package cn.gson.hui_ren_boot.model.pojos.medical;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "CMOBO", schema = "HUIREN")
public class Cmobo {
    private long comboId;
    private String comboName;
    private Long comboMoney;
    private String comboSerial;
    private List<Comboitem> comboitems;

    @ManyToMany
    @JoinTable(name = "COMBOMIDDLE",joinColumns = {
            @JoinColumn(name="COMBO_SERIAL"),
    },inverseJoinColumns = {
            @JoinColumn(name = "ITEM_ID")
    })
    public List<Comboitem> getComboitems() {
        return comboitems;
    }

    public void setComboitems(List<Comboitem> comboitems) {
        this.comboitems = comboitems;
    }

    @Id
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

    @Basic
    @Column(name = "COMBO_SERIAL")
    public String getComboSerial() {
        return comboSerial;
    }

    public void setComboSerial(String comboSerial) {
        this.comboSerial = comboSerial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cmobo that = (Cmobo) o;
        return comboId == that.comboId && Objects.equals(comboName, that.comboName) && Objects.equals(comboMoney, that.comboMoney) && Objects.equals(comboSerial, that.comboSerial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comboId, comboName, comboMoney, comboSerial);
    }
}
