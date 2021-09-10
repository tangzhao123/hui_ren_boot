package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
public class Transfers {
    private Long transfersId;//调拨编号
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp transfersDate;//调拨时间
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp transfersTime;//申请时间
    private String transfersOrder;//调拨单号
    private String transfersGo;//出库单号
    private Staff staff;//审核人外键
    private String users;//执行人外键,审核人外键
    private String transfersDeport;//仓库外键
    private String transfersPharmacy;//调拨药房外键
    private GoBank banks;//出库单号外键
    private List<Allocating> allocatings;//详情外键

    @OneToMany
    public List<Allocating> getAllocatings() {
        return allocatings;
    }

    public void setAllocatings(List<Allocating> allocatings) {
        this.allocatings = allocatings;
    }


    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    @Basic
    @Column(name = "TRANSFERS_DEPORT")
    public String getTransfersDeport() {
        return transfersDeport;
    }

    public void setTransfersDeport(String transfersDeport) {
        this.transfersDeport = transfersDeport;
    }

    @Basic
    @Column(name = "TRANSFERS_PHARMACY")
    public String getTransfersPharmacy() {
        return transfersPharmacy;
    }

    public void setTransfersPharmacy(String transfersPharmacy) {
        this.transfersPharmacy = transfersPharmacy;
    }

    @OneToOne
    public GoBank getBanks() {
        return banks;
    }

    public void setBanks(GoBank banks) {
        this.banks = banks;
    }

    @OneToOne
    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "TRANSFERS_ID")
    public Long getTransfersId() {
        return transfersId;
    }

    public void setTransfersId(Long transfersId) {
        this.transfersId = transfersId;
    }

    @Basic
    @Column(name = "TRANSFERS_DATE")
    public Timestamp getTransfersDate() {
        return transfersDate;
    }

    public void setTransfersDate(Timestamp transfersDate) {
        this.transfersDate = transfersDate;
    }

    @Basic
    @Column(name = "TRANSFERS_TIME")
    public Timestamp getTransfersTime() {
        return transfersTime;
    }

    public void setTransfersTime(Timestamp transfersTime) {
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

    @Basic
    @Column(name = "TRANSFERS_GO")
    public String getTransfersGo() {
        return transfersGo;
    }

    public void setTransfersGo(String transfersGo) {
        this.transfersGo = transfersGo;
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

    @Override
    public String toString() {
        return "Transfers{" +
                "transfersId=" + transfersId +
                ", transfersDate=" + transfersDate +
                ", transfersTime=" + transfersTime +
                ", transfersOrder='" + transfersOrder + '\'' +
                ", transfersGo='" + transfersGo + '\'' +
                ", staff=" + staff +
                ", users='" + users + '\'' +
                ", transfersDeport='" + transfersDeport + '\'' +
                ", transfersPharmacy='" + transfersPharmacy + '\'' +
                ", banks=" + banks +
                ", allocatings=" + allocatings +
                '}';
    }
}
