package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Category {

    private long categoryId;
    private String categoryShift;
    private Time userroleStart;
    private Time userroleOver;



    @Id
    @Column(name = "CATEGORY_ID")
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "CATEGORY_SHIFT")
    public String getCategoryShift() {
        return categoryShift;
    }

    public void setCategoryShift(String categoryShift) {
        this.categoryShift = categoryShift;
    }

    @Basic
    @Column(name = "USERROLE_START")
    public Time getUserroleStart() {
        return userroleStart;
    }

    public void setUserroleStart(Time userroleStart) {
        this.userroleStart = userroleStart;
    }

    @Basic
    @Column(name = "USERROLE_OVER")
    public Time getUserroleOver() {
        return userroleOver;
    }

    public void setUserroleOver(Time userroleOver) {
        this.userroleOver = userroleOver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return categoryId == category.categoryId && Objects.equals(categoryShift, category.categoryShift) && Objects.equals(userroleStart, category.userroleStart) && Objects.equals(userroleOver, category.userroleOver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryShift, userroleStart, userroleOver);
    }
}
