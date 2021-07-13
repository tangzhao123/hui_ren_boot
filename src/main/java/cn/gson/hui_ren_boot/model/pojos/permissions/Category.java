package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Category {

    private long categoryId;
    private String categoryShift;
    private String userroleStart;
    private String userroleOver;



    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
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
    public String getUserroleStart() {
        return userroleStart;
    }

    public void setUserroleStart(String userroleStart) {
        this.userroleStart = userroleStart;
    }

    @Basic
    @Column(name = "USERROLE_OVER")
    public String getUserroleOver() {
        return userroleOver;
    }

    public void setUserroleOver(String userroleOver) {
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

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryShift='" + categoryShift + '\'' +
                ", userroleStart=" + userroleStart +
                ", userroleOver=" + userroleOver +
                '}';
    }
}
