package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Roleinfo {

    private long roleinfoId;
    private String roleinfoName;
    private Long roleinfoSuperior;
    private List<Function> func;
    private List<Roleinfo> roleinfos;

    @OneToMany
    public List<Roleinfo> getRoleinfos() {
        return roleinfos;
    }

    public void setRoleinfos(List<Roleinfo> roleinfos) {
        this.roleinfos = roleinfos;
    }

    @ManyToMany
    @JoinTable(name = "permission",
            joinColumns = {
                    @JoinColumn(name = "ROLEINFO_ID"),
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "AUTHITY_ID"),
            })
    public List<Function> getFunc() {
        return func;
    }

    public void setFunc(List<Function> func) {
        this.func = func;
    }

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
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

    public Roleinfo(String roleinfoName, Long roleinfoSuperior) {
        this.roleinfoName = roleinfoName;
        this.roleinfoSuperior = roleinfoSuperior;
    }


    public Roleinfo() {
    }

    @Override
    public String toString() {
        return "Roleinfo{" +
                "roleinfoId=" + roleinfoId +
                ", roleinfoName='" + roleinfoName + '\'' +
                ", roleinfoSuperior=" + roleinfoSuperior +
                '}';
    }
}
