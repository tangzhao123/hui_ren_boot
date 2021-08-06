package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "USER_INFO", schema = "HUIREN")
public class UserInfo {

    private long userId;
    private String userName;
    private String userPossword;
    private Long staffId;
    private Long medicalId;
    private String staffName;
    private String medicalName;
    private Long rankId;
    private List<Roleinfo> roleinfos;


    @ManyToMany
    @JoinTable(name = "userole",
            joinColumns = {
                    @JoinColumn(name = "USER_ID"),
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLEINFO_ID"),
            })
    public List<Roleinfo> getRoleinfos() {
        return roleinfos;
    }

    public void setRoleinfos(List<Roleinfo> roleinfos) {
        this.roleinfos = roleinfos;
    }

    @Id
    @Column(name = "USER_ID")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "USER_POSSWORD")
    public String getUserPossword() {
        return userPossword;
    }

    public void setUserPossword(String userPossword) {
        this.userPossword = userPossword;
    }

    @Basic
    @Column(name = "STAFF_ID")
    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Long getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Long medicalId) {
        this.medicalId = medicalId;
    }

    public Long getRankId() {
        return rankId;
    }

    public void setRankId(Long rankId) {
        this.rankId = rankId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return userId == userInfo.userId && Objects.equals(userName, userInfo.userName) && Objects.equals(userPossword, userInfo.userPossword) && Objects.equals(staffId, userInfo.staffId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPossword, staffId);
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public UserInfo() {
    }

    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPossword='" + userPossword + '\'' +
                ", userStaff=" + staffId +
                '}';
    }}
