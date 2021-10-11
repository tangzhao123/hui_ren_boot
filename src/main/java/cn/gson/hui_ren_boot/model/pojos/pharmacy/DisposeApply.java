package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "DISPOSE_APPLY", schema = "HUIREN")
public class DisposeApply {

    private String applyId; //销毁编号
    private String applyNum; //销毁单号
    private String applyBatch; //批号
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp applyDate; //申请日期
    private String applyOpinion; //销毁原因
    private Long applyPeople; //承办人
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp applyTime; //销毁日期
    private Long applyApproval; //审批负责人
    private String applyGo; //出库单号
    private List<Destruction> disposeApplyData; //销毁详情集合
    private String staffName;//制单人名称
    private String staffNames;//审批人名称
    private String checkNo;//盘点单号
    private Long applyState;//审核状态

    @Id
    @Column(name = "APPLY_ID")
    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    @Basic
    @Column(name = "APPLY_NUM")
    public String getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(String applyNum) {
        this.applyNum = applyNum;
    }

    @Basic
    @Column(name = "APPLY_BATCH")
    public String getApplyBatch() {
        return applyBatch;
    }

    public void setApplyBatch(String applyBatch) {
        this.applyBatch = applyBatch;
    }

    @Basic
    @Column(name = "APPLY_DATE")
    public Timestamp getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Timestamp applyDate) {
        this.applyDate = applyDate;
    }

    @Basic
    @Column(name = "APPLY_OPINION")
    public String getApplyOpinion() {
        return applyOpinion;
    }

    public void setApplyOpinion(String applyOpinion) {
        this.applyOpinion = applyOpinion;
    }

    @Basic
    @Column(name = "APPLY_PEOPLE")
    public Long getApplyPeople() {
        return applyPeople;
    }

    public void setApplyPeople(Long applyPeople) {
        this.applyPeople = applyPeople;
    }

    @Basic
    @Column(name = "APPLY_TIME")
    public Timestamp getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Timestamp applyTime) {
        this.applyTime = applyTime;
    }

    @Basic
    @Column(name = "APPLY_APPROVAL")
    public Long getApplyApproval() {
        return applyApproval;
    }

    public void setApplyApproval(Long applyApproval) {
        this.applyApproval = applyApproval;
    }

    @Basic
    @Column(name = "APPLY_GO")
    public String getApplyGo() {
        return applyGo;
    }

    public void setApplyGo(String applyGo) {
        this.applyGo = applyGo;
    }

    @Basic
    @Column(name = "APPLY_STATE")
    public Long getApplyState() {
        return applyState;
    }

    public void setApplyState(Long applyState) {
        this.applyState = applyState;
    }

    @Transient
    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    @Transient
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Transient
    public String getStaffNames() {
        return staffNames;
    }

    public void setStaffNames(String staffNames) {
        this.staffNames = staffNames;
    }

    @OneToMany
    public List<Destruction> getDisposeApplyData() {
        return disposeApplyData;
    }

    public void setDisposeApplyData(List<Destruction> disposeApplyData) {
        this.disposeApplyData = disposeApplyData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisposeApply that = (DisposeApply) o;
        return Objects.equals(applyId, that.applyId) && Objects.equals(applyNum, that.applyNum) && Objects.equals(applyBatch, that.applyBatch) && Objects.equals(applyDate, that.applyDate) && Objects.equals(applyOpinion, that.applyOpinion) && Objects.equals(applyPeople, that.applyPeople) && Objects.equals(applyTime, that.applyTime) && Objects.equals(applyApproval, that.applyApproval) && Objects.equals(applyGo, that.applyGo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyId, applyNum, applyBatch, applyDate, applyOpinion, applyPeople, applyTime, applyApproval, applyGo);
    }

    public DisposeApply() {
    }

    public DisposeApply(String applyId, String applyNum, String applyBatch, Timestamp applyDate, String applyOpinion, Long applyPeople, Timestamp applyTime, Long applyApproval, String applyGo) {
        this.applyId = applyId;
        this.applyNum = applyNum;
        this.applyBatch = applyBatch;
        this.applyDate = applyDate;
        this.applyOpinion = applyOpinion;
        this.applyPeople = applyPeople;
        this.applyTime = applyTime;
        this.applyApproval = applyApproval;
        this.applyGo = applyGo;
    }

    @Override
    public String toString() {
        return "DisposeApply{" +
                "applyId='" + applyId + '\'' +
                ", applyNum='" + applyNum + '\'' +
                ", applyBatch='" + applyBatch + '\'' +
                ", applyDate=" + applyDate +
                ", applyOpinion='" + applyOpinion + '\'' +
                ", applyPeople=" + applyPeople +
                ", applyTime='" + applyTime + '\'' +
                ", applyApproval=" + applyApproval +
                ", applyGo='" + applyGo + '\'' +
                ", disposeApplyData=" + disposeApplyData +
                ", staffName='" + staffName + '\'' +
                ", staffNames='" + staffNames + '\'' +
                ", checkNo='" + checkNo + '\'' +
                '}';
    }
}
