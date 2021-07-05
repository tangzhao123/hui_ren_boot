package cn.gson.hui_ren_boot.model.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Roleinfo {

    private long roleinfoId;
    private String roleinfoName;
    private Long roleinfoSuperior;


    @Id
    @Column(name = "ROLEINFO_ID")
    public long getRoleinfoId() {
        return roleinfoId;
    }

    public void setRoleinfoId(long roleinfoId) {
        this.roleinfoId = roleinfoId;
    }

    @Basic
    @Column(name = "ROLEINFO_NAME")
    public String getRoleinfoName() {
        return roleinfoName;
    }

    public void setRoleinfoName(String roleinfoName) {
        this.roleinfoName = roleinfoName;
    }

    @Basic
    @Column(name = "ROLEINFO_SUPERIOR")
    public Long getRoleinfoSuperior() {
        return roleinfoSuperior;
    }

    public void setRoleinfoSuperior(Long roleinfoSuperior) {
        this.roleinfoSuperior = roleinfoSuperior;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roleinfo roleinfo = (Roleinfo) o;
        return roleinfoId == roleinfo.roleinfoId && Objects.equals(roleinfoName, roleinfo.roleinfoName) && Objects.equals(roleinfoSuperior, roleinfo.roleinfoSuperior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleinfoId, roleinfoName, roleinfoSuperior);
    }
}
