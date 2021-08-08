package cn.gson.hui_ren_boot.model.pojos.medical;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Combomiddle {
    private String comboSerial;
    private Integer itemId;


    @Id
    @Column(name = "COMBO_SERIAL")
    public String getComboSerial() {
        return comboSerial;
    }

    public void setComboSerial(String comboSerial) {
        this.comboSerial = comboSerial;
    }

    @Basic
    @Column(name = "ITEM_ID")
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Combomiddle that = (Combomiddle) o;
        return Objects.equals(comboSerial, that.comboSerial) && Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comboSerial, itemId);
    }
}
