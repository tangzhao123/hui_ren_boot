package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Casefile {

    private long casefileSeriald;//序号
    private String casefileId;//病例编号
    private Date casefileDays;//建档日期
    private String registerId;//住院号
    private String casefileName;//患者名
    private String casefileResults;//诊断结果
    private String casefilePlan;//处理方案
    private String casefileHpi;//现病史
    private String casefilePh;//既往史
    private String casefileFamily;//家族史
    private String casefileUps;//体检
    private String casefileAllergy;//过敏历史
    private String casefileUser;//主治医师
    private String adviceId;//医嘱号


    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "CASEFILE_SERIALD")
    public long getCasefileSeriald() {
        return casefileSeriald;
    }

    public void setCasefileSeriald(long casefileSeriald) {
        this.casefileSeriald = casefileSeriald;
    }
    @Basic
    @Column(name = "ADVICE_ID")
    public String getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(String adviceId) {
        this.adviceId = adviceId;
    }

    @Basic
    @Column(name = "CASEFILE_ID")
    public String getCasefileId() {
        return casefileId;
    }

    public void setCasefileId(String casefileId) {
        this.casefileId = casefileId;
    }

    @Basic
    @Column(name = "CASEFILE_DAYS")
    public Date getCasefileDays() {
        return casefileDays;
    }

    public void setCasefileDays(Date casefileDays) {
        this.casefileDays = casefileDays;
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
    @Column(name = "CASEFILE_NAME")
    public String getCasefileName() {
        return casefileName;
    }

    public void setCasefileName(String casefileName) {
        this.casefileName = casefileName;
    }

    @Basic
    @Column(name = "CASEFILE_RESULTS")
    public String getCasefileResults() {
        return casefileResults;
    }

    public void setCasefileResults(String casefileResults) {
        this.casefileResults = casefileResults;
    }

    @Basic
    @Column(name = "CASEFILE_PLAN")
    public String getCasefilePlan() {
        return casefilePlan;
    }

    public void setCasefilePlan(String casefilePlan) {
        this.casefilePlan = casefilePlan;
    }

    @Basic
    @Column(name = "CASEFILE_HPI")
    public String getCasefileHpi() {
        return casefileHpi;
    }

    public void setCasefileHpi(String casefileHpi) {
        this.casefileHpi = casefileHpi;
    }

    @Basic
    @Column(name = "CASEFILE_PH")
    public String getCasefilePh() {
        return casefilePh;
    }

    public void setCasefilePh(String casefilePh) {
        this.casefilePh = casefilePh;
    }

    @Basic
    @Column(name = "CASEFILE_FAMILY")
    public String getCasefileFamily() {
        return casefileFamily;
    }

    public void setCasefileFamily(String casefileFamily) {
        this.casefileFamily = casefileFamily;
    }

    @Basic
    @Column(name = "CASEFILE_UPS")
    public String getCasefileUps() {
        return casefileUps;
    }

    public void setCasefileUps(String casefileUps) {
        this.casefileUps = casefileUps;
    }

    @Basic
    @Column(name = "CASEFILE_ALLERGY")
    public String getCasefileAllergy() {
        return casefileAllergy;
    }

    public void setCasefileAllergy(String casefileAllergy) {
        this.casefileAllergy = casefileAllergy;
    }

    @Basic
    @Column(name = "CASEFILE_USER")
    public String getCasefileUser() {
        return casefileUser;
    }

    public void setCasefileUser(String casefileUser) {
        this.casefileUser = casefileUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casefile casefile = (Casefile) o;
        return casefileSeriald == casefile.casefileSeriald && Objects.equals(casefileId, casefile.casefileId) && Objects.equals(casefileDays, casefile.casefileDays) && Objects.equals(registerId, casefile.registerId) && Objects.equals(casefileName, casefile.casefileName) && Objects.equals(casefileResults, casefile.casefileResults) && Objects.equals(casefilePlan, casefile.casefilePlan) && Objects.equals(casefileHpi, casefile.casefileHpi) && Objects.equals(casefilePh, casefile.casefilePh) && Objects.equals(casefileFamily, casefile.casefileFamily) && Objects.equals(casefileUps, casefile.casefileUps) && Objects.equals(casefileAllergy, casefile.casefileAllergy) && Objects.equals(casefileUser, casefile.casefileUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(casefileSeriald, casefileId, casefileDays,registerId, casefileName, casefileResults, casefilePlan, casefileHpi, casefilePh, casefileFamily, casefileUps, casefileAllergy, casefileUser);
    }

    @Override
    public String toString() {
        return "Casefile{" +
                "casefileSeriald=" + casefileSeriald +
                ", casefileId='" + casefileId + '\'' +
                ", casefileDays=" + casefileDays +
                ", registerId='" + registerId + '\'' +
                ", casefileName='" + casefileName + '\'' +
                ", casefileResults='" + casefileResults + '\'' +
                ", casefilePlan='" + casefilePlan + '\'' +
                ", casefileHpi='" + casefileHpi + '\'' +
                ", casefilePh='" + casefilePh + '\'' +
                ", casefileFamily='" + casefileFamily + '\'' +
                ", casefileUps='" + casefileUps + '\'' +
                ", casefileAllergy='" + casefileAllergy + '\'' +
                ", casefileUser='" + casefileUser + '\'' +
                ", adviceId='" + adviceId + '\'' +
                '}';
    }
}
