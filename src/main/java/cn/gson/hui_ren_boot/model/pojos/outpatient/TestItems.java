package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TEST_ITEMS", schema = "HUIREN", catalog = "")
public class TestItems {
    private long testId;
    private String testNumber;
    private String recordsNo;
    private double testSumtotal;
    private Date itemsDate;
    private Staff outdoctor;
    private Medical medical;
    private OutpatientRegister outpatient;
    private List<Comboitem> comboitems;
    private long itemState;

    @OneToOne
    public Staff getOutdoctor() {
        return outdoctor;
    }

    public void setOutdoctor(Staff outdoctor) {
        this.outdoctor = outdoctor;
    }

    @OneToOne
    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }

    @OneToOne
    public OutpatientRegister getOutpatient() {
        return outpatient;
    }

    public void setOutpatient(OutpatientRegister outpatient) {
        this.outpatient = outpatient;
    }

    @OneToMany
    public List<Comboitem> getComboitems() {
        return comboitems;
    }

    public void setComboitems(List<Comboitem> comboitems) {
        this.comboitems = comboitems;
    }

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "TEST_ID")
    public long getTestId() {
        return testId;
    }

    public void setTestId(long testId) {
        this.testId = testId;
    }

    @Basic
    @Column(name = "RECORDS_NO")
    public String getRecordsNo() {
        return recordsNo;
    }

    public void setRecordsNo(String recordsNo) {
        this.recordsNo = recordsNo;
    }

    @Basic
    @Column(name = "TEST_NUMBER")
    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }

    @Basic
    @Column(name = "TEST_SUMTOTAL")
    public double getTestSumtotal() {
        return testSumtotal;
    }

    public void setTestSumtotal(double testSumtotal) {
        this.testSumtotal = testSumtotal;
    }

    @Basic
    @Column(name = "ITEMS_DATE")
    public Date getItemsDate() {
        return itemsDate;
    }

    public void setItemsDate(Date itemsDate) {
        this.itemsDate = itemsDate;
    }

    @Basic
    @Column(name = "ITEM_STATE")
    public long getItemState() {
        return itemState;
    }

    public void setItemState(long itemState) {
        this.itemState = itemState;
    }

    @Override
    public String toString() {
        return "TestItems{" +
                "testId=" + testId +
                ", testNumber='" + testNumber + '\'' +
                ", recordsNo='" + recordsNo + '\'' +
                ", testSumtotal=" + testSumtotal +
                ", itemsDate=" + itemsDate +
                ", outdoctor=" + outdoctor +
                ", medical=" + medical +
                ", outpatient=" + outpatient +
                ", comboitems=" + comboitems +
                '}';
    }
}
