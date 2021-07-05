package cn.gson.hui_ren_boot.model.pojos;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Function {

    private long authityId;
    private String authitySuperior;
    private String authityPath;
    private String authityIcon;
    private Long authityLeadaers;
    private Long aurhityState;
    private String aurhityGrade;
    private List<Function> children;


    @OneToMany
    public List<Function> getChildren() {
        return children;
    }

    public void setChildren(List<Function> children) {
        this.children = children;
    }



    @Id
    @Column(name = "AUTHITY_ID")
    public long getAuthityId() {
        return authityId;
    }

    public void setAuthityId(long authityId) {
        this.authityId = authityId;
    }

    @Basic
    @Column(name = "AUTHITY_SUPERIOR")
    public String getAuthitySuperior() {
        return authitySuperior;
    }

    public void setAuthitySuperior(String authitySuperior) {
        this.authitySuperior = authitySuperior;
    }

    @Basic
    @Column(name = "AUTHITY_PATH")
    public String getAuthityPath() {
        return authityPath;
    }

    public void setAuthityPath(String authityPath) {
        this.authityPath = authityPath;
    }

    @Basic
    @Column(name = "AUTHITY_ICON")
    public String getAuthityIcon() {
        return authityIcon;
    }

    public void setAuthityIcon(String authityIcon) {
        this.authityIcon = authityIcon;
    }

    @Basic
    @Column(name = "AUTHITY_LEADAERS")
    public Long getAuthityLeadaers() {
        return authityLeadaers;
    }

    public void setAuthityLeadaers(Long authityLeadaers) {
        this.authityLeadaers = authityLeadaers;
    }

    @Basic
    @Column(name = "AURHITY_STATE")
    public Long getAurhityState() {
        return aurhityState;
    }

    public void setAurhityState(Long aurhityState) {
        this.aurhityState = aurhityState;
    }

    @Basic
    @Column(name = "AURHITY_GRADE")
    public String getAurhityGrade() {
        return aurhityGrade;
    }

    public void setAurhityGrade(String aurhityGrade) {
        this.aurhityGrade = aurhityGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Function function = (Function) o;
        return authityId == function.authityId && Objects.equals(authitySuperior, function.authitySuperior) && Objects.equals(authityPath, function.authityPath) && Objects.equals(authityIcon, function.authityIcon) && Objects.equals(authityLeadaers, function.authityLeadaers) && Objects.equals(aurhityState, function.aurhityState) && Objects.equals(aurhityGrade, function.aurhityGrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authityId, authitySuperior, authityPath, authityIcon, authityLeadaers, aurhityState, aurhityGrade);
    }
}
