package cn.gson.hui_ren_boot.model.pojos.medical;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Test {
    private long testId;
    private String testName;
    private Long testSex;
    private String testPhone;
    private Long testCombo;
    private String testGenre;
    private Time testTime;
    private Long testMoney;

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
    @Column(name = "TEST_NAME")
    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    @Basic
    @Column(name = "TEST_SEX")
    public Long getTestSex() {
        return testSex;
    }

    public void setTestSex(Long testSex) {
        this.testSex = testSex;
    }

    @Basic
    @Column(name = "TEST_PHONE")
    public String getTestPhone() {
        return testPhone;
    }

    public void setTestPhone(String testPhone) {
        this.testPhone = testPhone;
    }

    @Basic
    @Column(name = "TEST_COMBO")
    public Long getTestCombo() {
        return testCombo;
    }

    public void setTestCombo(Long testCombo) {
        this.testCombo = testCombo;
    }

    @Basic
    @Column(name = "TEST_GENRE")
    public String getTestGenre() {
        return testGenre;
    }

    public void setTestGenre(String testGenre) {
        this.testGenre = testGenre;
    }

    @Basic
    @Column(name = "TEST_TIME")
    public Time getTestTime() {
        return testTime;
    }

    public void setTestTime(Time testTime) {
        this.testTime = testTime;
    }

    @Basic
    @Column(name = "TEST_MONEY")
    public Long getTestMoney() {
        return testMoney;
    }

    public void setTestMoney(Long testMoney) {
        this.testMoney = testMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return testId == test.testId && Objects.equals(testName, test.testName) && Objects.equals(testSex, test.testSex) && Objects.equals(testPhone, test.testPhone) && Objects.equals(testCombo, test.testCombo) && Objects.equals(testGenre, test.testGenre) && Objects.equals(testTime, test.testTime) && Objects.equals(testMoney, test.testMoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, testName, testSex, testPhone, testCombo, testGenre, testTime, testMoney);
    }
}
