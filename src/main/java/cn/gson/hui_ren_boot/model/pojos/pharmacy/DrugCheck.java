package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "DRUG_CHECK", schema = "HUIREN")
public class DrugCheck {

    private long checkId;//序号
    private String checkNo;//盘点号
    private String checkPeople;//盘点人
    private String checkAuditor;//审核人
    private Long checkType;//盘点状态
    private Long checkKnum;//盈亏数量
    private Long checkWarehouse;//盘点仓库
    private String checkNote;//盘点备注
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp checkDate;//盘点日期
    private String checkGo;//销毁单号
    private List<Inventory> inventoryData;//盘点详情集合


    @Id
    @Column(name = "CHECK_ID")
    public long getCheckId() {
        return checkId;
    }

    public void setCheckId(long checkId) {
        this.checkId = checkId;
    }

    @Basic
    @Column(name = "CHECK_NO")
    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    @Basic
    @Column(name = "CHECK_PEOPLE")
    public String getCheckPeople() {
        return checkPeople;
    }

    public void setCheckPeople(String checkPeople) {
        this.checkPeople = checkPeople;
    }

    @Basic
    @Column(name = "CHECK_AUDITOR")
    public String getCheckAuditor() {
        return checkAuditor;
    }

    public void setCheckAuditor(String checkAuditor) {
        this.checkAuditor = checkAuditor;
    }

    @Basic
    @Column(name = "CHECK_TYPE")
    public Long getCheckType() {
        return checkType;
    }

    public void setCheckType(Long checkType) {
        this.checkType = checkType;
    }

    @Basic
    @Column(name = "CHECK_KNUM")
    public Long getCheckKnum() {
        return checkKnum;
    }

    public void setCheckKnum(Long checkKnum) {
        this.checkKnum = checkKnum;
    }

    @Basic
    @Column(name = "CHECK_WAREHOUSE")
    public Long getCheckWarehouse() {
        return checkWarehouse;
    }

    public void setCheckWarehouse(Long checkWarehouse) {
        this.checkWarehouse = checkWarehouse;
    }

    @Basic
    @Column(name = "CHECK_NOTE")
    public String getCheckNote() {
        return checkNote;
    }

    public void setCheckNote(String checkNote) {
        this.checkNote = checkNote;
    }

    @Basic
    @Column(name = "CHECK_DATE")
    public Timestamp getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Timestamp checkDate) {
        this.checkDate = checkDate;
    }

    @Basic
    @Column(name = "CHECK_GO")
    public String getCheckGo() {
        return checkGo;
    }

    public void setCheckGo(String checkGo) {
        this.checkGo = checkGo;
    }


    @OneToMany
    public List<Inventory> getInventoryData() {
        return inventoryData;
    }

    public void setInventoryData(List<Inventory> inventoryData) {
        this.inventoryData = inventoryData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugCheck drugCheck = (DrugCheck) o;
        return checkId == drugCheck.checkId && Objects.equals(checkNo, drugCheck.checkNo) && Objects.equals(checkPeople, drugCheck.checkPeople) && Objects.equals(checkAuditor, drugCheck.checkAuditor) && Objects.equals(checkType, drugCheck.checkType) && Objects.equals(checkKnum, drugCheck.checkKnum) && Objects.equals(checkWarehouse, drugCheck.checkWarehouse) && Objects.equals(checkNote, drugCheck.checkNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkId, checkNo, checkPeople, checkAuditor, checkType, checkKnum, checkWarehouse, checkNote);
    }

    @Override
    public String toString() {
        return "DrugCheck{" +
                "checkId=" + checkId +
                ", checkNo='" + checkNo + '\'' +
                ", checkPeople='" + checkPeople + '\'' +
                ", checkAuditor='" + checkAuditor + '\'' +
                ", checkType=" + checkType +
                ", checkKnum=" + checkKnum +
                ", checkWarehouse=" + checkWarehouse +
                ", checkNote='" + checkNote + '\'' +
                ", checkDate=" + checkDate +
                ", inventoryData=" + inventoryData +
                '}';
    }
}
