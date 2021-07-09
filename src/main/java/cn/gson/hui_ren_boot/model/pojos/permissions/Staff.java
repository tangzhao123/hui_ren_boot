package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Staff {

    private long staffId;
    private String staffName;
    private Long staffPhone;
    private Long sectionId;
    private Long medicalId;
    private Long rankId;
    private Long staffState;
    private String staffCard;
    private String userName;
    private String sectionName;
    private String medicalName;
    private String rankName;
    private String passWord;
    private Long userId;


    @Id
    @Column(name = "STAFF_ID")
    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "STAFF_NAME")
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Basic
    @Column(name = "STAFF_PHONE")
    public Long getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(Long staffPhone) {
        this.staffPhone = staffPhone;
    }

    @Basic
    @Column(name = "SECTION_ID")
    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    @Basic
    @Column(name = "MEDICAL_ID")
    public Long getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Long medicalId) {
        this.medicalId = medicalId;
    }

    @Basic
    @Column(name = "RANK_ID")
    public Long getRankId() {
        return rankId;
    }

    public void setRankId(Long rankId) {
        this.rankId = rankId;
    }

    @Basic
    @Column(name = "STAFF_STATE")
    public Long getStaffState() {
        return staffState;
    }

    public void setStaffState(Long staffState) {
        this.staffState = staffState;
    }

    @Basic
    @Column(name = "STAFF_CARD")
    public String getStaffCard() {
        return staffCard;
    }

    public void setStaffCard(String staffCard) {
        this.staffCard = staffCard;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return staffId == staff.staffId && Objects.equals(staffName, staff.staffName) && Objects.equals(staffPhone, staff.staffPhone) && Objects.equals(sectionId, staff.sectionId) && Objects.equals(medicalId, staff.medicalId) && Objects.equals(rankId, staff.rankId) && Objects.equals(staffState, staff.staffState) && Objects.equals(staffCard, staff.staffCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, staffName, staffPhone, sectionId, medicalId, rankId, staffState, staffCard);
    }



    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", staffPhone=" + staffPhone +
                ", sectionId=" + sectionId +
                ", medicalId=" + medicalId +
                ", rankId=" + rankId +
                ", staffState=" + staffState +
                ", staffCard='" + staffCard + '\'' +
                ", userName='" + userName + '\'' +
                ", sectionName='" + sectionName + '\'' +
                ", medicalName='" + medicalName + '\'' +
                ", rankName='" + rankName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
