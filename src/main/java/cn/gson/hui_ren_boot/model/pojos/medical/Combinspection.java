package cn.gson.hui_ren_boot.model.pojos.medical;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Combinspection {

    private long inspectionId;//主键
    private String inspectionName;//检验人
    private String inspectionContent;//检验结果
    private String itemName;//项目名
    private Long testId;//体检单号
    private String comboName;//套餐名
    private String inspectionUnit;//单位值
    private String inspectionPhone;//电话
    private Timestamp inspectionDate;//时间


    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "INSPECTION_ID")
    public long getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(long inspectionId) {
        this.inspectionId = inspectionId;
    }

    @Basic
    @Column(name = "INSPECTION_NAME")
    public String getInspectionName() {
        return inspectionName;
    }

    public void setInspectionName(String inspectionName) {
        this.inspectionName = inspectionName;
    }

    @Basic
    @Column(name = "INSPECTION_CONTENT")
    public String getInspectionContent() {
        return inspectionContent;
    }

    public void setInspectionContent(String inspectionContent) {
        this.inspectionContent = inspectionContent;
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
    @Column(name = "TEST_ID")
    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
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
    @Column(name = "INSPECTION_UNIT")
    public String getInspectionUnit() {
        return inspectionUnit;
    }

    public void setInspectionUnit(String inspectionUnit) {
        this.inspectionUnit = inspectionUnit;
    }

    @Basic
    @Column(name = "INSPECTION_PHONE")
    public String getInspectionPhone() {
        return inspectionPhone;
    }

    public void setInspectionPhone(String inspectionPhone) {
        this.inspectionPhone = inspectionPhone;
    }

    @Basic
    @Column(name = "INSPECTION_DATE")
    public Timestamp getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Timestamp inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Combinspection that = (Combinspection) o;
        return inspectionId == that.inspectionId && Objects.equals(inspectionName, that.inspectionName) && Objects.equals(inspectionContent, that.inspectionContent) && Objects.equals(itemName, that.itemName) && Objects.equals(testId, that.testId) && Objects.equals(comboName, that.comboName) && Objects.equals(inspectionUnit, that.inspectionUnit) && Objects.equals(inspectionPhone, that.inspectionPhone) && Objects.equals(inspectionDate, that.inspectionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inspectionId, inspectionName, inspectionContent, itemName, testId, comboName, inspectionUnit, inspectionPhone, inspectionDate);
    }
}
