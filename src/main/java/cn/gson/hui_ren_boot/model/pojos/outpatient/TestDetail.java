package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TEST_DETAIL", schema = "HUIREN", catalog = "")
public class TestDetail {
    private long checkId;
    private String testNumber;
    private String itemName;
    private double itemMoney;

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "CHECK_ID")
    public long getCheckId() {
        return checkId;
    }

    public void setCheckId(long checkId) {
        this.checkId = checkId;
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
    @Column(name = "ITEM_NAME")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "ITEM_MONEY")
    public double getItemMoney() {
        return itemMoney;
    }

    public void setItemMoney(double itemMoney) {
        this.itemMoney = itemMoney;
    }

    @Override
    public String toString() {
        return "TestDetail{" +
                "checkId=" + checkId +
                ", testNumber='" + testNumber + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemMoney=" + itemMoney +
                '}';
    }
}
