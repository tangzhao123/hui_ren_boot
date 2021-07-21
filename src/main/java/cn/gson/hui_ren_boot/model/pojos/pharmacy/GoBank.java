package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "GO_BANK", schema = "HUIREN", catalog = "")
public class GoBank {
    private Long goId;
    private String goNum;
    private Time goDate;
    private Long goWay;
    private Long goTouching;
    private Long goHandleu;
    private String goType;
    private Long goWarehouse;


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
    public Time getGoDate() {
        return goDate;
    }

    public void setGoDate(Time goDate) {
        this.goDate = goDate;
    }

    @Basic
    @Column(name = "GO_WAY")
    public Long getGoWay() {
        return goWay;
    }

    public void setGoWay(Long goWay) {
        this.goWay = goWay;
    }

    @Basic
    @Column(name = "GO_TOUCHING")
    public Long getGoTouching() {
        return goTouching;
    }

    public void setGoTouching(Long goTouching) {
        this.goTouching = goTouching;
    }

    @Basic
    @Column(name = "GO_HANDLEU")
    public Long getGoHandleu() {
        return goHandleu;
    }

    public void setGoHandleu(Long goHandleu) {
        this.goHandleu = goHandleu;
    }

    @Basic
    @Column(name = "GO_TYPE")
    public String getGoType() {
        return goType;
    }

    public void setGoType(String goType) {
        this.goType = goType;
    }

    @Basic
    @Column(name = "GO_WAREHOUSE")
    public Long getGoWarehouse() {
        return goWarehouse;
    }

    public void setGoWarehouse(Long goWarehouse) {
        this.goWarehouse = goWarehouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoBank goBank = (GoBank) o;
        return Objects.equals(goId, goBank.goId) && Objects.equals(goNum, goBank.goNum) && Objects.equals(goDate, goBank.goDate) && Objects.equals(goWay, goBank.goWay) && Objects.equals(goTouching, goBank.goTouching) && Objects.equals(goHandleu, goBank.goHandleu) && Objects.equals(goType, goBank.goType) && Objects.equals(goWarehouse, goBank.goWarehouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goId, goNum, goDate, goWay, goTouching, goHandleu, goType, goWarehouse);
    }
}
