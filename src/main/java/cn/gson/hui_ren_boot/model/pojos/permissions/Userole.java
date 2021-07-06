package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Userole {
    private Long id;
    private Long userId;
    private Long roleinfoId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USER_ID")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ROLEINFO_ID")
    public Long getRoleinfoId() {
        return roleinfoId;
    }

    public void setRoleinfoId(Long roleinfoId) {
        this.roleinfoId = roleinfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userole userole = (Userole) o;
        return Objects.equals(userId, userole.userId) && Objects.equals(roleinfoId, userole.roleinfoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, roleinfoId);
    }
}
