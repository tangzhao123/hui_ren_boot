package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

@Entity
public class Transfers {
    private Long transfersId;//调拨编号
    private Time transfersDate;//调拨时间
    private Time transfersTime;//申请时间
    private String transfersOrder;//调拨单号
    private UserInfo users;//执行人外键,审核人外键
    private DrugDeport deports;//仓库外键
    private Pharmacy pharmacys;//调拨药房外键
    private GoBank banks;//出库单号外键

    @OneToOne
    public UserInfo getUsers() {
        return users;
    }

    public void setUsers(UserInfo users) {
        this.users = users;
    }


    @OneToOne
    public DrugDeport getDeports() {
        return deports;
    }

    public void setDeports(DrugDeport deports) {
        this.deports = deports;
    }

    @OneToOne
    public Pharmacy getPharmacys() {
        return pharmacys;
    }

    public void setPharmacys(Pharmacy pharmacys) {
        this.pharmacys = pharmacys;
    }

    @OneToOne
    public GoBank getBanks() {
        return banks;
    }

    public void setBanks(GoBank banks) {
        this.banks = banks;
    }

    @Id
    @Column(name = "TRANSFERS_ID")
    public Long getTransfersId() {
        return transfersId;
    }

    public void setTransfersId(Long transfersId) {
        this.transfersId = transfersId;
    }

    @Basic
    @Column(name = "TRANSFERS_DATE")
    public Time getTransfersDate() {
        return transfersDate;
    }

    public void setTransfersDate(Time transfersDate) {
        this.transfersDate = transfersDate;
    }

    @Basic
    @Column(name = "TRANSFERS_TIME")
    public Time getTransfersTime() {
        return transfersTime;
    }

    public void setTransfersTime(Time transfersTime) {
        this.transfersTime = transfersTime;
    }

    @Basic
    @Column(name = "TRANSFERS_ORDER")
    public String getTransfersOrder() {
        return transfersOrder;
    }

    public void setTransfersOrder(String transfersOrder) {
        this.transfersOrder = transfersOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transfers transfers = (Transfers) o;
        return Objects.equals(transfersId, transfers.transfersId)&& Objects.equals(transfersOrder, transfers.transfersOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transfersId, transfersDate, transfersTime, transfersOrder);
    }
}
