package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
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
    private List<Stockout> storageData;//出库详单集合

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
