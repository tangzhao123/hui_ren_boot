package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "INSPECT_DEBIT", schema = "HUIREN")
public class InspectDebit {//检验扣费记录表

    private long debitId;//主键
    private Date debitDate;//时间
    private Long debitMoney;//扣费金额
    private String debitExecutor;//执行人
    private String debitProject;//扣费项目
    private String testPhone;//电话号码
    private Long debitType;//缴费类型（1.微信支付，2.支付宝，3.刷卡，4.现金）

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "DEBIT_ID")
    public long getDebitId() {
        return debitId;
    }

    public void setDebitId(long debitId) {
        this.debitId = debitId;
    }

    @Basic
    @Column(name = "DEBIT_DATE")
    public Date getDebitDate() {
        return debitDate;
    }

    public void setDebitDate(Date debitDate) {
        this.debitDate = debitDate;
    }

    @Basic
    @Column(name = "DEBIT_MONEY")
    public Long getDebitMoney() {
        return debitMoney;
    }

    public void setDebitMoney(Long debitMoney) {
        this.debitMoney = debitMoney;
    }

    @Basic
    @Column(name = "DEBIT_EXECUTOR")
    public String getDebitExecutor() {
        return debitExecutor;
    }

    public void setDebitExecutor(String debitExecutor) {
        this.debitExecutor = debitExecutor;
    }

    @Basic
    @Column(name = "DEBIT_PROJECT")
    public String getDebitProject() {
        return debitProject;
    }

    public void setDebitProject(String debitProject) {
        this.debitProject = debitProject;
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
    @Column(name = "DEBIT_TYPE")
    public Long getDebitType() {
        return debitType;
    }

    public void setDebitType(Long debitType) {
        this.debitType = debitType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InspectDebit that = (InspectDebit) o;
        return debitId == that.debitId && Objects.equals(debitDate, that.debitDate) && Objects.equals(debitMoney, that.debitMoney) && Objects.equals(debitExecutor, that.debitExecutor) && Objects.equals(debitProject, that.debitProject) && Objects.equals(testPhone, that.testPhone) && Objects.equals(debitType, that.debitType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debitId, debitDate, debitMoney, debitExecutor, debitProject, testPhone,debitType);
    }
}
