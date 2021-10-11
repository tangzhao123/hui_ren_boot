package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "CHECK_INFO", schema = "HUIREN")
public class CheckInfo {

    private long checkId;//编号
    private Time checkDate;//审核时间
    private String checkContent;//审核意见
    private String checkPerson;//审核人
    private String checkAudit;//审核单号
    private String purchaseId;//采购计划单号
    private String applyNum;//销毁单号
    private String checkNo;//库存盘点单号

    @Id
    @Column(name = "CHECK_ID")
    public long getCheckId() {
        return checkId;
    }

    public void setCheckId(long checkId) {
        this.checkId = checkId;
    }

    @Basic
    @Column(name = "CHECK_DATE")
    public Time getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Time checkDate) {
        this.checkDate = checkDate;
    }

    @Basic
    @Column(name = "CHECK_CONTENT")
    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    @Basic
    @Column(name = "CHECK_PERSON")
    public String getCheckPerson() {
        return checkPerson;
    }

    public void setCheckPerson(String checkPerson) {
        this.checkPerson = checkPerson;
    }

    @Basic
    @Column(name = "CHECK_AUDIT")
    public String getCheckAudit() {
        return checkAudit;
    }

    public void setCheckAudit(String checkAudit) {
        this.checkAudit = checkAudit;
    }

    @Transient
    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    @Transient
    public String getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(String applyNum) {
        this.applyNum = applyNum;
    }

    @Transient
    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckInfo checkInfo = (CheckInfo) o;
        return checkId == checkInfo.checkId && Objects.equals(checkDate, checkInfo.checkDate) && Objects.equals(checkContent, checkInfo.checkContent) && Objects.equals(checkPerson, checkInfo.checkPerson) && Objects.equals(checkAudit, checkInfo.checkAudit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkId, checkDate, checkContent, checkPerson, checkAudit);
    }

    @Override
    public String toString() {
        return "CheckInfo{" +
                "checkId=" + checkId +
                ", checkDate=" + checkDate +
                ", checkContent='" + checkContent + '\'' +
                ", checkPerson='" + checkPerson + '\'' +
                ", checkAudit='" + checkAudit + '\'' +
                ", purchaseId='" + purchaseId + '\'' +
                ", applyNum='" + applyNum + '\'' +
                ", checkNo='" + checkNo + '\'' +
                '}';
    }
}
