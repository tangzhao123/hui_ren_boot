package cn.gson.hui_ren_boot.model.pojos.permissions;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Arrange {

    private long arrangeId;
    private Long staffId;
    private Long categoryId;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp arrangeStart;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp arrangeEnd;
    private String staffName;
    private String categoryShift;
    private String staffPhone;
    private String userroleStart;
    private String userroleOver;
    private String medicalName;
    private String color;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date start;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date end;

    @Id
    @Column(name = "ARRANGE_ID")
    public long getArrangeId() {
        return arrangeId;
    }

    public void setArrangeId(long arrangeId) {
        this.arrangeId = arrangeId;
    }



    @Basic
    @Column(name = "STAFF_ID")
    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "CATEGORY_ID")
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "ARRANGE_START")
    public Timestamp getArrangeStart() {
        return arrangeStart;
    }

    public void setArrangeStart(Timestamp arrangeStart) {
        this.arrangeStart = arrangeStart;
    }

    @Basic
    @Column(name = "ARRANGE_END")
    public Timestamp getArrangeEnd() {
        return arrangeEnd;
    }

    public void setArrangeEnd(Timestamp arrangeEnd) {
        this.arrangeEnd = arrangeEnd;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getCategoryShift() {
        return categoryShift;
    }

    public void setCategoryShift(String categoryShift) {
        this.categoryShift = categoryShift;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getUserroleStart() {
        return userroleStart;
    }

    public void setUserroleStart(String userroleStart) {
        this.userroleStart = userroleStart;
    }

    public String getUserroleOver() {
        return userroleOver;
    }

    public void setUserroleOver(String userroleOver) {
        this.userroleOver = userroleOver;
    }

    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Arrange(Long staffId, Long categoryId, Timestamp arrangeStart, Timestamp arrangeEnd) {
        this.staffId = staffId;
        this.categoryId = categoryId;
        this.arrangeStart = arrangeStart;
        this.arrangeEnd = arrangeEnd;
    }

    public Arrange() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arrange arrange = (Arrange) o;
        return arrangeId == arrange.arrangeId && Objects.equals(staffId, arrange.staffId) && Objects.equals(categoryId, arrange.categoryId) && Objects.equals(arrangeStart, arrange.arrangeStart) && Objects.equals(arrangeEnd, arrange.arrangeEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrangeId, staffId, categoryId, arrangeStart, arrangeEnd);
    }

    @Override
    public String toString() {
        return "Arrange{" +
                "arrangeId=" + arrangeId +
                ", staffId=" + staffId +
                ", categoryId=" + categoryId +
                ", arrangeStart=" + arrangeStart +
                ", arrangeEnd=" + arrangeEnd +
                ", staffName='" + staffName + '\'' +
                ", categoryShift='" + categoryShift + '\'' +
                '}';
    }
}
