package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Transfers {
    private Long transfersId;
    private Time transfersDate;
    private Time transfersTime;
    private Long transfersExecutor;
    private Long transfersReviewer;
    private Long transfersDeport;
    private Long transfersPharmacy;
    private String transfersGo;
    private String transfersOrder;


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
    @Column(name = "TRANSFERS_EXECUTOR")
    public Long getTransfersExecutor() {
        return transfersExecutor;
    }

    public void setTransfersExecutor(Long transfersExecutor) {
        this.transfersExecutor = transfersExecutor;
    }

    @Basic
    @Column(name = "TRANSFERS_REVIEWER")
    public Long getTransfersReviewer() {
        return transfersReviewer;
    }

    public void setTransfersReviewer(Long transfersReviewer) {
        this.transfersReviewer = transfersReviewer;
    }

    @Basic
    @Column(name = "TRANSFERS_DEPORT")
    public Long getTransfersDeport() {
        return transfersDeport;
    }

    public void setTransfersDeport(Long transfersDeport) {
        this.transfersDeport = transfersDeport;
    }

    @Basic
    @Column(name = "TRANSFERS_PHARMACY")
    public Long getTransfersPharmacy() {
        return transfersPharmacy;
    }

    public void setTransfersPharmacy(Long transfersPharmacy) {
        this.transfersPharmacy = transfersPharmacy;
    }

    @Basic
    @Column(name = "TRANSFERS_GO")
    public String getTransfersGo() {
        return transfersGo;
    }

    public void setTransfersGo(String transfersGo) {
        this.transfersGo = transfersGo;
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
        return Objects.equals(transfersId, transfers.transfersId) && Objects.equals(transfersDate, transfers.transfersDate) && Objects.equals(transfersTime, transfers.transfersTime) && Objects.equals(transfersExecutor, transfers.transfersExecutor) && Objects.equals(transfersReviewer, transfers.transfersReviewer) && Objects.equals(transfersDeport, transfers.transfersDeport) && Objects.equals(transfersPharmacy, transfers.transfersPharmacy) && Objects.equals(transfersGo, transfers.transfersGo) && Objects.equals(transfersOrder, transfers.transfersOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transfersId, transfersDate, transfersTime, transfersExecutor, transfersReviewer, transfersDeport, transfersPharmacy, transfersGo, transfersOrder);
    }
}
