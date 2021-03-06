package cn.gson.hui_ren_boot.model.pojos.medical;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Test {
    private long testId;
    private String testName;
    private Long testSex;
    private String testPhone;
    private String testGenre;
    //将数据库的类型返回成指定类型
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="Asia/Shanghai")
    private Date testTime;
    private Double testMoney;
    private Long testState;
    private String testAccount;

    private List<Comboitem> inspector;
    @OneToMany
    public List<Comboitem> getInspector() {
        return inspector;
    }

    public void setInspector(List<Comboitem> inspector) {
        this.inspector = inspector;
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
    @Column(name = "TEST_GENRE")
    public String getTestGenre() {
        return testGenre;
    }

    public void setTestGenre(String testGenre) {
        this.testGenre = testGenre;
    }


    @Basic
    @Column(name = "TEST_TIME")
    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }


    @Basic
    @Column(name = "TEST_MONEY")
    public Double getTestMoney() {
        return testMoney;
    }

    public void setTestMoney(Double testMoney) {
        this.testMoney = testMoney;
    }

    @Basic
    @Column(name = "TEST_STATE")
    public Long getTestState() {
        return testState;
    }

    public void setTestState(Long testState) {
        this.testState = testState;
    }

    @Basic
    @Column(name = "TEST_ACCOUNT")
    public String getTestAccount() {
        return testAccount;
    }

    public void setTestAccount(String testAccount) {
        this.testAccount = testAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return testId == test.testId && Objects.equals(testName, test.testName) && Objects.equals(testSex, test.testSex) && Objects.equals(testPhone, test.testPhone) && Objects.equals(testGenre, test.testGenre) && Objects.equals(testTime, test.testTime) && Objects.equals(testMoney, test.testMoney) && Objects.equals(testState, test.testState) && Objects.equals(testAccount, test.testAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, testName, testSex, testPhone, testGenre, testTime, testMoney, testState, testAccount);
    }

    @Override
    public String toString() {
        return "Test{" +
                "testId=" + testId +
                ", testName='" + testName + '\'' +
                ", testSex=" + testSex +
                ", testPhone='" + testPhone + '\'' +
                ", testGenre='" + testGenre + '\'' +
                ", testTime=" + testTime +
                ", testMoney=" + testMoney +
                ", testState=" + testState +
                ", testAccount='" + testAccount + '\'' +
                ", inspector=" + inspector +
                '}';
    }
}
