package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Arrange {
    private long arrangeId;
    private Long staffId;
    private Long categoryId;
    private Timestamp arrangeStart;
    private Timestamp arrangeEnd;


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
}
