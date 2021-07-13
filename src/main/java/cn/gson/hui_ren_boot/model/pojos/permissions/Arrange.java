package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Arrange {

    private long arrangeId;
    private Long arrangeUser;
    private Long arrangeCategory;



    @Id
    @Column(name = "ARRANGE_ID")
    public long getArrangeId() {
        return arrangeId;
    }

    public void setArrangeId(long arrangeId) {
        this.arrangeId = arrangeId;
    }

    @Basic
    @Column(name = "ARRANGE_USER")
    public Long getArrangeUser() {
        return arrangeUser;
    }

    public void setArrangeUser(Long arrangeUser) {
        this.arrangeUser = arrangeUser;
    }

    @Basic
    @Column(name = "ARRANGE_CATEGORY")
    public Long getArrangeCategory() {
        return arrangeCategory;
    }

    public void setArrangeCategory(Long arrangeCategory) {
        this.arrangeCategory = arrangeCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arrange arrange = (Arrange) o;
        return arrangeId == arrange.arrangeId && Objects.equals(arrangeUser, arrange.arrangeUser) && Objects.equals(arrangeCategory, arrange.arrangeCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrangeId, arrangeUser, arrangeCategory);
    }
}
