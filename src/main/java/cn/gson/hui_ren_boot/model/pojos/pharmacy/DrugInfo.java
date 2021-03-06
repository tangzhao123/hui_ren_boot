package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DRUG_INFO", schema = "HUIREN")
public class DrugInfo {
    private Long drugSerial;//药品编号
    private String drugId;//药品编码
    private String drugName;//药品名称
    private String drugUse;//用途
    private String drugDosage;//剂型
    private String drugTack;//拆零
    private String drugRemark;//备注
    private double drugSelling;//售价
    private double purchasePrice;//进价
    private String drugNext;//次/天
    private String drugBig;//大单位
    private String drugSmall;//小单位
    private double smallSelling;//小单位售价
    private double smallPrice;//小单位进价
    private Long drugState;//状态
    private Long drugRecipe;//处方非处方药
    private Integer drugLife;//保质期
    private DrugType types;//药品类别
    private DrugSupplier suppliers;//供应商
    private DrugStandard standards;//规格
    private DrugStock stocks;//库存
    private Integer pageNo;
    private Integer size;
    private String typeName;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    //类别
    @OneToOne
    public DrugType getTypes() {
        return types;
    }

    public void setTypes(DrugType types) {
        this.types = types;
    }
    //供应商
    @ManyToOne
    public DrugSupplier getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(DrugSupplier suppliers) {
        this.suppliers = suppliers;
    }
    //规格
    @OneToOne
    public DrugStandard getStandards() {
        return standards;
    }

    public void setStandards(DrugStandard standards) {
        this.standards = standards;
    }
    //库存
    @OneToOne
    public DrugStock getStocks() {
        return stocks;
    }

    public void setStocks(DrugStock stocks) {
        this.stocks = stocks;
    }

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "DRUG_SERIAL")
    public Long getDrugSerial() {
        return drugSerial;
    }

    public void setDrugSerial(Long drugSerial) {
        this.drugSerial = drugSerial;
    }
    @Basic
    @Column(name = "DRUG_RECIPE")
    public Long getDrugRecipe() {
        return drugRecipe;
    }

    public void setDrugRecipe(Long drugRecipe) {
        this.drugRecipe = drugRecipe;
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
    public double getDrugSelling() {
        return drugSelling;
    }

    public void setDrugSelling(double drugSelling) {
        this.drugSelling = drugSelling;
    }

    @Basic
    @Column(name = "PURCHASE_PRICE")
    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
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
    @Column(name = "SMALL_SELLING")
    public double getSmallSelling() {
        return smallSelling;
    }

    public void setSmallSelling(double smallSelling) {
        this.smallSelling = smallSelling;
    }

    @Basic
    @Column(name = "SMALL_PRICE")
    public double getSmallPrice() {
        return smallPrice;
    }

    public void setSmallPrice(double smallPrice) {
        this.smallPrice = smallPrice;
    }

    @Basic
    @Column(name = "DRUG_STATE")
    public Long getDrugState() {
        return drugState;
    }

    public void setDrugState(Long drugState) {
        this.drugState = drugState;
    }

    @Basic
    @Column(name = "DRUG_LIFE")
    public Integer getDrugLife() {
        return drugLife;
    }

    public void setDrugLife(Integer drugLife) {
        this.drugLife = drugLife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugInfo drugInfo = (DrugInfo) o;
        return Objects.equals(drugSerial, drugInfo.drugSerial) && Objects.equals(drugId, drugInfo.drugId) && Objects.equals(drugName, drugInfo.drugName) && Objects.equals(drugUse, drugInfo.drugUse) && Objects.equals(drugDosage, drugInfo.drugDosage) && Objects.equals(drugTack, drugInfo.drugTack) && Objects.equals(drugRemark, drugInfo.drugRemark) && Objects.equals(drugSelling, drugInfo.drugSelling) && Objects.equals(purchasePrice, drugInfo.purchasePrice) && Objects.equals(drugNext, drugInfo.drugNext) && Objects.equals(drugBig, drugInfo.drugBig) && Objects.equals(drugSmall, drugInfo.drugSmall) && Objects.equals(smallSelling, drugInfo.smallSelling) && Objects.equals(smallPrice, drugInfo.smallPrice) && Objects.equals(drugState, drugInfo.drugState) && Objects.equals(drugRecipe, drugInfo.drugRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drugSerial, drugId, drugName, drugUse, drugDosage, drugTack, drugRemark, drugSelling, purchasePrice, drugNext, drugBig, drugSmall, smallSelling, smallPrice,drugState,drugRecipe);
    }

    @Override
    public String toString() {
        return "DrugInfo{" +
                "drugSerial=" + drugSerial +
                ", drugId='" + drugId + '\'' +
                ", drugName='" + drugName + '\'' +
                ", drugUse='" + drugUse + '\'' +
                ", drugDosage='" + drugDosage + '\'' +
                ", drugTack='" + drugTack + '\'' +
                ", drugRemark='" + drugRemark + '\'' +
                ", drugSelling=" + drugSelling +
                ", purchasePrice=" + purchasePrice +
                ", drugNext='" + drugNext + '\'' +
                ", drugBig='" + drugBig + '\'' +
                ", drugSmall='" + drugSmall + '\'' +
                ", smallSelling=" + smallSelling +
                ", smallPrice=" + smallPrice +
                ", drugState=" + drugState +
                ", drugLife=" + drugLife +
                ", types=" + types +
                ", suppliers=" + suppliers +
                ", standards=" + standards +
                ", stocks=" + stocks +
                ", drugRecipe=" + drugRecipe +
                '}';
    }
}
