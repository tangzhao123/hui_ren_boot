package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "DRUG_INFO", schema = "HUIREN")
public class DrugInfo {
    private Long drugSerial;//序号
    private String drugId;//药品编号
    private Long drugSort;//药品类别
    private String drugName;//药品名称
    private String drugUse;//处方用法
    private String drugDosage;//剂型
    private String drugTack;//拆零
    private String drugRemark;//备注
    private Long drugSelling;//中单位售价
    private Long purchasePrice;//中单位进价
    private Long supplierId;//供应商外键
    private String drugNext;//次/天
    private String drugBig;//中单位
    private String drugSmall;//小单位
    private Long drugStock;//药品库存 外键
    private Long drugSurplus;//规格外键
    private Long smallSelling;//小单位售价
    private Long smallPrice;//小单位进价
    private List<DrugType> types;//药品类别
    private List<DrugSupplier> suppliers;//供应商
    private List<DrugStandard> standards;//规格

    @Id
    @Column(name = "DRUG_SERIAL")
    public Long getDrugSerial() {
        return drugSerial;
    }

    public void setDrugSerial(Long drugSerial) {
        this.drugSerial = drugSerial;
    }

    @Basic
    @Column(name = "DRUG_ID")
    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    @Basic
    @Column(name = "DRUG_SORT")
    public Long getDrugSort() {
        return drugSort;
    }

    public void setDrugSort(Long drugSort) {
        this.drugSort = drugSort;
    }

    @Basic
    @Column(name = "DRUG_NAME")
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @Basic
    @Column(name = "DRUG_USE")
    public String getDrugUse() {
        return drugUse;
    }

    public void setDrugUse(String drugUse) {
        this.drugUse = drugUse;
    }

    @Basic
    @Column(name = "DRUG_DOSAGE")
    public String getDrugDosage() {
        return drugDosage;
    }

    public void setDrugDosage(String drugDosage) {
        this.drugDosage = drugDosage;
    }

    @Basic
    @Column(name = "DRUG_TACK")
    public String getDrugTack() {
        return drugTack;
    }

    public void setDrugTack(String drugTack) {
        this.drugTack = drugTack;
    }

    @Basic
    @Column(name = "DRUG_REMARK")
    public String getDrugRemark() {
        return drugRemark;
    }

    public void setDrugRemark(String drugRemark) {
        this.drugRemark = drugRemark;
    }

    @Basic
    @Column(name = "DRUG_SELLING")
    public Long getDrugSelling() {
        return drugSelling;
    }

    public void setDrugSelling(Long drugSelling) {
        this.drugSelling = drugSelling;
    }

    @Basic
    @Column(name = "PURCHASE_PRICE")
    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Basic
    @Column(name = "SUPPLIER_ID")
    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "DRUG_NEXT")
    public String getDrugNext() {
        return drugNext;
    }

    public void setDrugNext(String drugNext) {
        this.drugNext = drugNext;
    }

    @Basic
    @Column(name = "DRUG_BIG")
    public String getDrugBig() {
        return drugBig;
    }

    public void setDrugBig(String drugBig) {
        this.drugBig = drugBig;
    }

    @Basic
    @Column(name = "DRUG_SMALL")
    public String getDrugSmall() {
        return drugSmall;
    }

    public void setDrugSmall(String drugSmall) {
        this.drugSmall = drugSmall;
    }

    @Basic
    @Column(name = "DRUG_STOCK")
    public Long getDrugStock() {
        return drugStock;
    }

    public void setDrugStock(Long drugStock) {
        this.drugStock = drugStock;
    }

    @Basic
    @Column(name = "DRUG_SURPLUS")
    public Long getDrugSurplus() {
        return drugSurplus;
    }

    public void setDrugSurplus(Long drugSurplus) {
        this.drugSurplus = drugSurplus;
    }

    @Basic
    @Column(name = "SMALL_SELLING")
    public Long getSmallSelling() {
        return smallSelling;
    }

    public void setSmallSelling(Long smallSelling) {
        this.smallSelling = smallSelling;
    }

    @Basic
    @Column(name = "SMALL_PRICE")
    public Long getSmallPrice() {
        return smallPrice;
    }

    public void setSmallPrice(Long smallPrice) {
        this.smallPrice = smallPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugInfo drugInfo = (DrugInfo) o;
        return Objects.equals(drugSerial, drugInfo.drugSerial) && Objects.equals(drugId, drugInfo.drugId) && Objects.equals(drugSort, drugInfo.drugSort) && Objects.equals(drugName, drugInfo.drugName) && Objects.equals(drugUse, drugInfo.drugUse) && Objects.equals(drugDosage, drugInfo.drugDosage) && Objects.equals(drugTack, drugInfo.drugTack) && Objects.equals(drugRemark, drugInfo.drugRemark) && Objects.equals(drugSelling, drugInfo.drugSelling) && Objects.equals(purchasePrice, drugInfo.purchasePrice) && Objects.equals(supplierId, drugInfo.supplierId) && Objects.equals(drugNext, drugInfo.drugNext) && Objects.equals(drugBig, drugInfo.drugBig) && Objects.equals(drugSmall, drugInfo.drugSmall) && Objects.equals(drugStock, drugInfo.drugStock) && Objects.equals(drugSurplus, drugInfo.drugSurplus) && Objects.equals(smallSelling, drugInfo.smallSelling) && Objects.equals(smallPrice, drugInfo.smallPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drugSerial, drugId, drugSort, drugName, drugUse, drugDosage, drugTack, drugRemark, drugSelling, purchasePrice, supplierId, drugNext, drugBig, drugSmall, drugStock, drugSurplus, smallSelling, smallPrice);
    }
}
