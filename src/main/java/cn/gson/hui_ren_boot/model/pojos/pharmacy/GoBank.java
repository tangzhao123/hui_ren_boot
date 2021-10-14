package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "GO_BANK", schema = "HUIREN")
public class GoBank {

    private Long goId;
    private String goNum;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp goDate;
    private Long goTouching;
    private Long goWarehouse;
    private String goBatch;
    private String applyNum; //销毁单号
    private String transfersId;//调拨单号
    private List<Stockout> storageData;//出库详单集合
    private UserInfo userInfos;
    private DrugDeport deports;
    private List<Stockout> stockouts;
    private String staffName;
    private String deportName;
    private Date str;
    private Date str1;
    private String search;

    @OneToOne
    public DrugDeport getDeports() {
        return deports;
    }

    public void setDeports(DrugDeport deports) {
        this.deports = deports;
    }

    @OneToMany
    public List<Stockout> getStockouts() {
        return stockouts;
    }

    public void setStockouts(List<Stockout> stockouts) {
        this.stockouts = stockouts;
    }

    @OneToOne
    public UserInfo getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(UserInfo userInfos) {
        this.userInfos = userInfos;
    }

    @Id
    @Column(name = "GO_ID")
    public Long getGoId() {
        return goId;
    }

    public void setGoId(Long goId) {
        this.goId = goId;
    }

    @Basic
    @Column(name = "GO_NUM")
    public String getGoNum() {
        return goNum;
    }

    public void setGoNum(String goNum) {
        this.goNum = goNum;
    }

    @Basic
    @Column(name = "GO_DATE")
    public Timestamp getGoDate() {
        return goDate;
    }

    public void setGoDate(Timestamp goDate) {
        this.goDate = goDate;
    }



    @Basic
    @Column(name = "GO_TOUCHING")
    public Long getGoTouching() {
        return goTouching;
    }

    public void setGoTouching(Long goTouching) {
        this.goTouching = goTouching;
    }


    @OneToMany
    public List<Stockout> getStorageData() {
        return storageData;
    }

    public void setStorageData(List<Stockout> storageData) {
        this.storageData = storageData;
    }

    @Basic
    @Column(name = "GO_WAREHOUSE")
    public Long getGoWarehouse() {
        return goWarehouse;
    }

    public void setGoWarehouse(Long goWarehouse) {
        this.goWarehouse = goWarehouse;
    }

    @Basic
    @Column(name = "GO_BATCH")
    public String getGoBatch() {
        return goBatch;
    }

    public void setGoBatch(String goBatch) {
        this.goBatch = goBatch;
    }

    @Transient
    public String getApplyNum() {
        return applyNum;
    }

    @Transient
    public void setApplyNum(String applyNum) {
        this.applyNum = applyNum;
    }

    public String getTransfersId() {
        return transfersId;
    }

    public void setTransfersId(String transfersId) {
        this.transfersId = transfersId;
    }

    @Transient
    public String getStaffName() {
        return staffName;
    }


    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Transient
    public String getDeportName() {
        return deportName;
    }

    public void setDeportName(String deportName) {
        this.deportName = deportName;
    }

    @Transient
    public Date getStr() {
        return str;
    }

    public void setStr(Date str) {
        this.str = str;
    }

    @Transient
    public Date getStr1() {
        return str1;
    }

    public void setStr1(Date str1) {
        this.str1 = str1;
    }

    @Transient
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoBank goBank = (GoBank) o;
        return Objects.equals(goId, goBank.goId) && Objects.equals(goNum, goBank.goNum) && Objects.equals(goDate, goBank.goDate) && Objects.equals(goTouching, goBank.goTouching) && Objects.equals(goWarehouse, goBank.goWarehouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goId, goNum, goDate, goTouching, goWarehouse);
    }

    @Override
    public String toString() {
        return "GoBank{" +
                "goId=" + goId +
                ", goNum='" + goNum + '\'' +
                ", goDate=" + goDate +
                ", goTouching=" + goTouching +
                ", goWarehouse=" + goWarehouse +
                ", goBatch='" + goBatch + '\'' +
                ", storageData=" + storageData +
                '}';
    }
}
