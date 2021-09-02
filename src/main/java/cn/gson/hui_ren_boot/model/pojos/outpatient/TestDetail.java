package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TEST_DETAIL", schema = "HUIREN", catalog = "")
public class TestDetail {
    private long checkId;
    private String testNumber;
    private String testName;
    private String testContent;
    private Long testCount;
    private String testUnit;
    private double testSubtotal;

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
    @Column(name = "TEST_NAME")
    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    @Basic
    @Column(name = "TEST_CONTENT")
    public String getTestContent() {
        return testContent;
    }

    public void setTestContent(String testContent) {
        this.testContent = testContent;
    }

    @Basic
    @Column(name = "TEST_COUNT")
    public Long getTestCount() {
        return testCount;
    }

    public void setTestCount(Long testCount) {
        this.testCount = testCount;
    }

    @Basic
    @Column(name = "TEST_UNIT")
    public String getTestUnit() {
        return testUnit;
    }

    public void setTestUnit(String testUnit) {
        this.testUnit = testUnit;
    }

    @Basic
    @Column(name = "TEST_SUBTOTAL")
    public double getTestSubtotal() {
        return testSubtotal;
    }

    public void setTestSubtotal(double testSubtotal) {
        this.testSubtotal = testSubtotal;
    }
}
