package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Departure {

    private int deId;
    private String deWhy;
    private Timestamp deDate;
    private Long staffId;


    @Id
    @Column(name = "DE_ID")
    public int getDeId() {
        return deId;
    }

    public void setDeId(int deId) {
        this.deId = deId;
    }

    @Basic
    @Column(name = "DE_WHY")
    public String getDeWhy() {
        return deWhy;
    }

    public void setDeWhy(String deWhy) {
        this.deWhy = deWhy;
    }

    @Basic
    @Column(name = "DE_DATE")
    public Timestamp getDeDate() {
        return deDate;
    }

    public void setDeDate(Timestamp deDate) {
        this.deDate = deDate;
    }

    @Basic
    @Column(name = "STAFF_ID")
    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departure departure = (Departure) o;
        return deId == departure.deId && Objects.equals(deWhy, departure.deWhy) && Objects.equals(deDate, departure.deDate) && Objects.equals(staffId, departure.staffId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deId, deWhy, deDate, staffId);
    }

    @Override
    public String toString() {
        return "Departure{" +
                "deId=" + deId +
                ", deWhy='" + deWhy + '\'' +
                ", deDate=" + deDate +
                ", staffId=" + staffId +
                '}';
    }
}
