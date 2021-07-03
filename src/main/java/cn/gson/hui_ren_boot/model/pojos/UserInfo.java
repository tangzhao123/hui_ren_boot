package cn.gson.hui_ren_boot.model.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "USER_INFO", schema = "HUIREN")
public class UserInfo {

    private long userId;
    private String userName;
    private String userPossword;
    private Long userStaff;



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
    @Column(name = "USER_STAFF")
    public Long getUserStaff() {
        return userStaff;
    }

    public void setUserStaff(Long userStaff) {
        this.userStaff = userStaff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return userId == userInfo.userId && Objects.equals(userName, userInfo.userName) && Objects.equals(userPossword, userInfo.userPossword) && Objects.equals(userStaff, userInfo.userStaff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPossword, userStaff);
    }

    public UserInfo(long userId, String userName, String userPossword, Long userStaff) {
        this.userId = userId;
        this.userName = userName;
        this.userPossword = userPossword;
        this.userStaff = userStaff;
    }

    public UserInfo() {
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPossword='" + userPossword + '\'' +
                ", userStaff=" + userStaff +
                '}';
    }
}
