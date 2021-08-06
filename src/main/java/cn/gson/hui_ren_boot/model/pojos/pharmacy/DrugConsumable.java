package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "DRUG_CONSUMABLE", schema = "HUIREN")
public class DrugConsumable {

    private long materialId;
    private String materialSerial;
    private String materialName;
    private Double sellingPrice;
    private String materialBatch;
    private Double materialPrice;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp materialIndate;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp materialDate;
    private String materiaStandard;
    private Long materiaStock;



    @Id
    @Column(name = "MATERIAL_ID")
    public long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    @Basic
    @Column(name = "MATERIAL_SERIAL")
    public String getMaterialSerial() {
        return materialSerial;
    }

    public void setMaterialSerial(String materialSerial) {
        this.materialSerial = materialSerial;
    }

    @Basic
    @Column(name = "MATERIAL_NAME")
    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    @Basic
    @Column(name = "SELLING_PRICE")
    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Basic
    @Column(name = "MATERIAL_BATCH")
    public String getMaterialBatch() {
        return materialBatch;
    }

    public void setMaterialBatch(String materialBatch) {
        this.materialBatch = materialBatch;
    }


    @Basic
    @Column(name = "MATERIAL_PRICE")
    public Double getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(Double materialPrice) {
        this.materialPrice = materialPrice;
    }

    @Basic
    @Column(name = "MATERIAL_INDATE")
    public Timestamp getMaterialIndate() {
        return materialIndate;
    }

    public void setMaterialIndate(Timestamp materialIndate) {
        this.materialIndate = materialIndate;
    }


    @Basic
    @Column(name = "MATERIAL_DATE")
    public Timestamp getMaterialDate() {
        return materialDate;
    }

    public void setMaterialDate(Timestamp materialDate) {
        this.materialDate = materialDate;
    }

    @Basic
    @Column(name = "MATERIA_STANDARD")
    public String getMateriaStandard() {
        return materiaStandard;
    }

    public void setMateriaStandard(String materiaStandard) {
        this.materiaStandard = materiaStandard;
    }

    @Basic
    @Column(name = "MATERIA_STOCK")
    public Long getMateriaStock() {
        return materiaStock;
    }

    public void setMateriaStock(Long materiaStock) {
        this.materiaStock = materiaStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugConsumable that = (DrugConsumable) o;
        return materialId == that.materialId && Objects.equals(materialSerial, that.materialSerial) && Objects.equals(materialName, that.materialName) && Objects.equals(sellingPrice, that.sellingPrice) && Objects.equals(materialBatch, that.materialBatch) && Objects.equals(materialPrice, that.materialPrice) && Objects.equals(materialIndate, that.materialIndate) && Objects.equals(materialDate, that.materialDate) && Objects.equals(materiaStandard, that.materiaStandard) && Objects.equals(materiaStock, that.materiaStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materialId, materialSerial, materialName, sellingPrice, materialBatch, materialPrice, materialIndate, materialDate, materiaStandard, materiaStock);
    }

    @Override
    public String toString() {
        return "DrugConsumable{" +
                "materialId=" + materialId +
                ", materialSerial='" + materialSerial + '\'' +
                ", materialName='" + materialName + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", materialBatch='" + materialBatch + '\'' +
                ", materialPrice=" + materialPrice +
                ", materialIndate=" + materialIndate +
                ", materialDate=" + materialDate +
                ", materiaStandard=" + materiaStandard +
                ", materiaStock=" + materiaStock +
                '}';
    }
}
