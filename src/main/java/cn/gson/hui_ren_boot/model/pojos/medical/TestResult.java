package cn.gson.hui_ren_boot.model.pojos.medical;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TEST_RESULT", schema = "HUIREN")
public class TestResult {
    private int resultId;
    private String resultNumber;//检验结果编号
    private String recordsNo;//就诊记录号
    private String itemName;//检验项目名
    private String resultCheckout;//检验结果
    private String staffName;//检验人员
    private Timestamp resultTime;//检验时间


    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "RESULT_ID")
    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    @Basic
    @Column(name = "RESULT_NUMBER")
    public String getResultNumber() {
        return resultNumber;
    }

    public void setResultNumber(String resultNumber) {
        this.resultNumber = resultNumber;
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
    @Column(name = "ITEM_NAME")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "RESULT_CHECKOUT")
    public String getResultCheckout() {
        return resultCheckout;
    }

    public void setResultCheckout(String resultCheckout) {
        this.resultCheckout = resultCheckout;
    }

    @Basic
    @Column(name = "STAFF_NAME")
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Basic
    @Column(name = "RESULT_TIME")
    public Timestamp getResultTime() {
        return resultTime;
    }

    public void setResultTime(Timestamp resultTime) {
        this.resultTime = resultTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestResult that = (TestResult) o;
        return resultId == that.resultId && Objects.equals(resultNumber, that.resultNumber) && Objects.equals(recordsNo, that.recordsNo) && Objects.equals(itemName, that.itemName) && Objects.equals(resultCheckout, that.resultCheckout) && Objects.equals(staffName, that.staffName) && Objects.equals(resultTime, that.resultTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId, resultNumber, recordsNo, itemName, resultCheckout, staffName, resultTime);
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "resultId=" + resultId +
                ", resultNumber='" + resultNumber + '\'' +
                ", recordsNo='" + recordsNo + '\'' +
                ", itemName='" + itemName + '\'' +
                ", resultCheckout='" + resultCheckout + '\'' +
                ", staffName='" + staffName + '\'' +
                ", resultTime=" + resultTime +
                '}';
    }
}
