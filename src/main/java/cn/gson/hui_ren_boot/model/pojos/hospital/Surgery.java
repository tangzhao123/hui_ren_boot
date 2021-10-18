package cn.gson.hui_ren_boot.model.pojos.hospital;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.exception.DataException;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
public class Surgery {

    private long surgeryId;//序号主键
    private String surgeryDoctor;//医生姓名
    private String surgeryName;//手术名称
    private Date surgerysStart;//开始时间
    //将数据库的类型返回成指定类型
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    private Timestamp surgeryFinish;//结束时间
    private String registerId;//住院号
    private String surgeryUser;//操作员
    private Long surgeryCost;//手术费
    private String surgeryOper;//手术编号
    private String surgeryLogist;//麻醉师
    private String surgeryResult;//手术结果



    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "SURGERY_ID")
    public long getSurgeryId() {
        return surgeryId;
    }

    public void setSurgeryId(long surgeryId) {
        this.surgeryId = surgeryId;
    }

    @Basic
    @Column(name = "SURGERY_DOCTOR")
    public String getSurgeryDoctor() {
        return surgeryDoctor;
    }

    public void setSurgeryDoctor(String surgeryDoctor) {
        this.surgeryDoctor = surgeryDoctor;
    }

    @Basic
    @Column(name = "SURGERY_NAME")
    public String getSurgeryName() {
        return surgeryName;
    }

    public void setSurgeryName(String surgeryName) {
        this.surgeryName = surgeryName;
    }

    @Basic
    @Column(name = "SURGERYS_START")
    public Date getSurgerysStart() {
        return surgerysStart;
    }

    public void setSurgerysStart(Date surgerysStart) {
        this.surgerysStart = surgerysStart;
    }

    @Basic
    @Column(name = "SURGERY_FINISH")
    public Timestamp getSurgeryFinish() {
        return surgeryFinish;
    }

    public void setSurgeryFinish(Timestamp surgeryFinish) {
        this.surgeryFinish = surgeryFinish;
    }

    @Basic
    @Column(name = "REGISTER_ID")
    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    @Basic
    @Column(name = "SURGERY_USER")
    public String getSurgeryUser() {
        return surgeryUser;
    }

    public void setSurgeryUser(String surgeryUser) {
        this.surgeryUser = surgeryUser;
    }

    @Basic
    @Column(name = "SURGERY_COST")
    public Long getSurgeryCost() {
        return surgeryCost;
    }

    public void setSurgeryCost(Long surgeryCost) {
        this.surgeryCost = surgeryCost;
    }

    @Basic
    @Column(name = "SURGERY_OPER")
    public String getSurgeryOper() {
        return surgeryOper;
    }

    public void setSurgeryOper(String surgeryOper) {
        this.surgeryOper = surgeryOper;
    }

    @Basic
    @Column(name = "SURGERY_LOGIST")
    public String getSurgeryLogist() {
        return surgeryLogist;
    }

    public void setSurgeryLogist(String surgeryLogist) {
        this.surgeryLogist = surgeryLogist;
    }

    @Basic
    @Column(name = "SURGERY_RESULT")
    public String getSurgeryResult() {
        return surgeryResult;
    }

    public void setSurgeryResult(String surgeryResult) {
        this.surgeryResult = surgeryResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Surgery surgery = (Surgery) o;
        return surgeryId == surgery.surgeryId && Objects.equals(surgeryDoctor, surgery.surgeryDoctor) && Objects.equals(surgeryName, surgery.surgeryName) && Objects.equals(surgerysStart, surgery.surgerysStart) && Objects.equals(surgeryFinish, surgery.surgeryFinish) && Objects.equals(registerId, surgery.registerId) && Objects.equals(surgeryUser, surgery.surgeryUser) && Objects.equals(surgeryCost, surgery.surgeryCost) && Objects.equals(surgeryOper, surgery.surgeryOper) && Objects.equals(surgeryLogist, surgery.surgeryLogist) && Objects.equals(surgeryResult, surgery.surgeryResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surgeryId, surgeryDoctor, surgeryName, surgerysStart, surgeryFinish, registerId, surgeryUser, surgeryCost, surgeryOper, surgeryLogist, surgeryResult);
    }

    @Override
    public String toString() {
        return "Surgery{" +
                "surgeryId=" + surgeryId +
                ", surgeryDoctor='" + surgeryDoctor + '\'' +
                ", surgeryName='" + surgeryName + '\'' +
                ", surgerysStart=" + surgerysStart +
                ", surgeryFinish=" + surgeryFinish +
                ", registerId='" + registerId + '\'' +
                ", surgeryUser='" + surgeryUser + '\'' +
                ", surgeryCost=" + surgeryCost +
                ", surgeryOper='" + surgeryOper + '\'' +
                ", surgeryLogist='" + surgeryLogist + '\'' +
                ", surgeryResult='" + surgeryResult + '\'' +
                '}';
    }
}
