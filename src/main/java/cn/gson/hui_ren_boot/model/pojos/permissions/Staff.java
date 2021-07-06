package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Staff {

    private long staffId;
    private String staffName;
    private Long staffPhone;
    private Long staffSection;
    private Long staffMedical;
    private Long staffRank;


    @Id
    @Column(name = "STAFF_ID")
    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "STAFF_NAME")
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Basic
    @Column(name = "STAFF_PHONE")
    public Long getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(Long staffPhone) {
        this.staffPhone = staffPhone;
    }

    @Basic
    @Column(name = "STAFF_SECTION")
    public Long getStaffSection() {
        return staffSection;
    }

    public void setStaffSection(Long staffSection) {
        this.staffSection = staffSection;
    }

    @Basic
    @Column(name = "STAFF_MEDICAL")
    public Long getStaffMedical() {
        return staffMedical;
    }

    public void setStaffMedical(Long staffMedical) {
        this.staffMedical = staffMedical;
    }

    @Basic
    @Column(name = "STAFF_RANK")
    public Long getStaffRank() {
        return staffRank;
    }

    public void setStaffRank(Long staffRank) {
        this.staffRank = staffRank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return staffId == staff.staffId && Objects.equals(staffName, staff.staffName) && Objects.equals(staffPhone, staff.staffPhone) && Objects.equals(staffSection, staff.staffSection) && Objects.equals(staffMedical, staff.staffMedical) && Objects.equals(staffRank, staff.staffRank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, staffName, staffPhone, staffSection, staffMedical, staffRank);
    }
}
