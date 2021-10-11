package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Inventory {

    private long inventoryId;//盘点详情序号
    private String inventoryDrug;//产品编号
    private Long inventoryNum;//盘点数量
    private Long inventoryKnum;//盈亏数量
    private Long inventorySum;//账面数量
    private double inventoryMargun;//成本差额
    private double inventoryRetail;//零售差额
    private String inventoryCheck;//盘点号
    private String inventoryBatch;//药品批号
    private String inventoryNote;//药品盘点备注
    private String drugName;



    @Id
    @Column(name = "INVENTORY_ID")
    public long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Basic
    @Column(name = "INVENTORY_DRUG")
    public String getInventoryDrug() {
        return inventoryDrug;
    }

    public void setInventoryDrug(String inventoryDrug) {
        this.inventoryDrug = inventoryDrug;
    }

    @Basic
    @Column(name = "INVENTORY_NUM")
    public Long getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(Long inventoryNum) {
        this.inventoryNum = inventoryNum;
    }

    @Basic
    @Column(name = "INVENTORY_KNUM")
    public Long getInventoryKnum() {
        return inventoryKnum;
    }

    public void setInventoryKnum(Long inventoryKnum) {
        this.inventoryKnum = inventoryKnum;
    }

    @Basic
    @Column(name = "INVENTORY_SUM")
    public Long getInventorySum() {
        return inventorySum;
    }

    public void setInventorySum(Long inventorySum) {
        this.inventorySum = inventorySum;
    }

    @Basic
    @Column(name = "INVENTORY_MARGUN")
    public double getInventoryMargun() {
        return inventoryMargun;
    }

    public void setInventoryMargun(double inventoryMargun) {
        this.inventoryMargun = inventoryMargun;
    }

    @Basic
    @Column(name = "INVENTORY_RETAIL")
    public double getInventoryRetail() {
        return inventoryRetail;
    }

    public void setInventoryRetail(double inventoryRetail) {
        this.inventoryRetail = inventoryRetail;
    }

    @Basic
    @Column(name = "INVENTORY_CHECK")
    public String getInventoryCheck() {
        return inventoryCheck;
    }

    public void setInventoryCheck(String inventoryCheck) {
        this.inventoryCheck = inventoryCheck;
    }

    @Basic
    @Column(name = "INVENTORY_BATCH")
    public String getInventoryBatch() {
        return inventoryBatch;
    }

    public void setInventoryBatch(String inventoryBatch) {
        this.inventoryBatch = inventoryBatch;
    }

    @Basic
    @Column(name = "INVENTORY_NOTE")
    public String getInventoryNote() {
        return inventoryNote;
    }

    public void setInventoryNote(String inventoryNote) {
        this.inventoryNote = inventoryNote;
    }

    @Transient
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return inventoryId == inventory.inventoryId && Objects.equals(inventoryDrug, inventory.inventoryDrug) && Objects.equals(inventoryNum, inventory.inventoryNum) && Objects.equals(inventoryKnum, inventory.inventoryKnum) && Objects.equals(inventorySum, inventory.inventorySum) && Objects.equals(inventoryMargun, inventory.inventoryMargun) && Objects.equals(inventoryRetail, inventory.inventoryRetail) && Objects.equals(inventoryCheck, inventory.inventoryCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inventoryId, inventoryDrug, inventoryNum, inventoryKnum, inventorySum, inventoryMargun, inventoryRetail, inventoryCheck);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId=" + inventoryId +
                ", inventoryDrug='" + inventoryDrug + '\'' +
                ", inventoryNum=" + inventoryNum +
                ", inventoryKnum=" + inventoryKnum +
                ", inventorySum=" + inventorySum +
                ", inventoryMargun=" + inventoryMargun +
                ", inventoryRetail=" + inventoryRetail +
                ", inventoryCheck='" + inventoryCheck + '\'' +
                ", inventoryBatch='" + inventoryBatch + '\'' +
                ", inventoryNote='" + inventoryNote + '\'' +
                ", drugName='" + drugName + '\'' +
                '}';
    }
}
