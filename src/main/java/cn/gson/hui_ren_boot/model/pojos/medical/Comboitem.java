package cn.gson.hui_ren_boot.model.pojos.medical;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Comboitem {
    private long itemId;
    private String itemName;
    private String itemOffice;
    private Long itemMoney;
    private String itemType;
    private String itemUnit;

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "ITEM_ID")
    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "ITEM_UNIT")
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Basic
    @Column(name = "ITEM_NAME")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "ITEM_OFFICE")
    public String getItemOffice() {
        return itemOffice;
    }

    public void setItemOffice(String itemOffice) {
        this.itemOffice = itemOffice;
    }

    @Basic
    @Column(name = "ITEM_MONEY")
    public Long getItemMoney() {
        return itemMoney;
    }

    public void setItemMoney(Long itemMoney) {
        this.itemMoney = itemMoney;
    }

    @Basic
    @Column(name = "ITEM_TYPE")
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comboitem comboitem = (Comboitem) o;
        return itemId == comboitem.itemId && Objects.equals(itemName, comboitem.itemName) && Objects.equals(itemOffice, comboitem.itemOffice) && Objects.equals(itemMoney, comboitem.itemMoney) && Objects.equals(itemType, comboitem.itemType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, itemName, itemOffice, itemMoney, itemType);
    }

    @Override
    public String toString() {
        return "Comboitem{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemOffice='" + itemOffice + '\'' +
                ", itemMoney=" + itemMoney +
                ", itemType='" + itemType + '\'' +
                ", itemUnit='" + itemUnit + '\'' +
                '}';
    }
}
