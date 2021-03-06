package cn.gson.hui_ren_boot.model.pojos.hospital;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Advice{

    private long adviceSerial;//序号
    private String adviceId;//医嘱号
    private String registerId;//住院号
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date adviceStart;//开始时间
    private String adviceSickbed;//床位号
    private String staffName;//医生姓名
    private Long adviceCost;//医嘱类型
    private Long adviceType;//费用
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date adviceEnd;//停用时间
    private String adviceChinese;//中药用法
    private String adviceDoctors;//处方忌讳
    private String registerName;//患者姓名
    private Long  adviceChindose;//中药数量
    private Long  adviceState;//主表状态
    private Long  medicalId;//科室编号
    private List<Details> details;//医嘱详情


    public Advice(long adviceSerial, String adviceId, String registerId, Date adviceStart, String adviceSickbed, String staffName, Long adviceCost, Long adviceType, Date adviceEnd, String adviceChinese, String adviceDoctors, String registerName, Long adviceChindose) {
        this.adviceSerial = adviceSerial;
        this.adviceId = adviceId;
        this.registerId = registerId;
        this.adviceStart = adviceStart;
        this.adviceSickbed = adviceSickbed;
        this.staffName = staffName;
        this.adviceCost = adviceCost;
        this.adviceType = adviceType;
        this.adviceEnd = adviceEnd;
        this.adviceChinese = adviceChinese;
        this.adviceDoctors = adviceDoctors;
        this.registerName = registerName;
        this.adviceChindose = adviceChindose;
    }

    public Advice() {

    }


    @OneToMany
    public List<Details> getDetails() {
        return details;
    }

    public void setDetails(List<Details> details) {
        this.details = details;
    }



    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "ADVICE_SERIAL")
    public long getAdviceSerial() {
        return adviceSerial;
    }

    public void setAdviceSerial(long adviceSerial) {
        this.adviceSerial = adviceSerial;
    }
    @Basic
    @Column(name = "ADVICE_CHINDOSE")
    public Long getAdviceChindose() {
        return adviceChindose;
    }

    public void setAdviceChindose(Long adviceChindose) {
        this.adviceChindose = adviceChindose;
    }
    @Basic
    @Column(name = "ADVICE_STATE")
    public Long getAdviceState() {
        return adviceState;
    }

    public void setAdviceState(Long adviceState) {
        this.adviceState = adviceState;
    }
    @Basic
    @Column(name = "MEDICAL_ID")
    public Long getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Long mecicalId) {
        this.medicalId = mecicalId;
    }
    @Basic
    @Column(name = "REGISTER_NAME")
    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
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
    @Column(name = "REGISTER_ID")
    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    @Basic
    @Column(name = "ADVICE_START")
    public Date getAdviceStart() {
        return adviceStart;
    }

    public void setAdviceStart(Date adviceStart) {
        this.adviceStart = adviceStart;
    }

    @Basic
    @Column(name = "ADVICE_SICKBED")
    public String getAdviceSickbed() {
        return adviceSickbed;
    }

    public void setAdviceSickbed(String adviceSickbed) {
        this.adviceSickbed = adviceSickbed;
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
    @Column(name = "ADVICE_COST")
    public Long getAdviceCost() {
        return adviceCost;
    }

    public void setAdviceCost(Long adviceCost) {
        this.adviceCost = adviceCost;
    }

    @Basic
    @Column(name = "ADVICE_TYPE")
    public Long getAdviceType() {
        return adviceType;
    }

    public void setAdviceType(Long adviceType) {
        this.adviceType = adviceType;
    }

    @Basic
    @Column(name = "ADVICE_END")
    public Date getAdviceEnd() {
        return adviceEnd;
    }

    public void setAdviceEnd(Date adviceEnd) {
        this.adviceEnd = adviceEnd;
    }

    @Basic
    @Column(name = "ADVICE_CHINESE")
    public String getAdviceChinese() {
        return adviceChinese;
    }

    public void setAdviceChinese(String adviceChinese) {
        this.adviceChinese = adviceChinese;
    }

    @Basic
    @Column(name = "ADVICE_DOCTORS")
    public String getAdviceDoctors() {
        return adviceDoctors;
    }

    public void setAdviceDoctors(String adviceDoctors) {
        this.adviceDoctors = adviceDoctors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advice advice = (Advice) o;
        return adviceSerial == advice.adviceSerial && Objects.equals(adviceId, advice.adviceId) && Objects.equals(registerId, advice.registerId) && Objects.equals(adviceStart, advice.adviceStart) && Objects.equals(adviceSickbed, advice.adviceSickbed) && Objects.equals(staffName, advice.staffName) && Objects.equals(adviceCost, advice.adviceCost) && Objects.equals(adviceType, advice.adviceType) && Objects.equals(adviceEnd, advice.adviceEnd) && Objects.equals(adviceChinese, advice.adviceChinese) && Objects.equals(adviceDoctors, advice.adviceDoctors)&& Objects.equals(registerName, advice.registerName) && Objects.equals(adviceChindose, advice.adviceChindose)&& Objects.equals(adviceState, advice.adviceState)&& Objects.equals(medicalId, advice.medicalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adviceSerial, adviceId, registerId, adviceStart, adviceSickbed, staffName, adviceCost, adviceType, adviceEnd, adviceChinese,registerName, adviceDoctors,adviceChindose,adviceState,medicalId);
    }

    @Override
    public String toString() {
        return "Advice{" +
                "adviceSerial=" + adviceSerial +
                ", adviceId='" + adviceId + '\'' +
                ", registerId='" + registerId + '\'' +
                ", adviceStart=" + adviceStart +
                ", adviceSickbed='" + adviceSickbed + '\'' +
                ", staffName='" + staffName + '\'' +
                ", adviceCost=" + adviceCost +
                ", adviceType=" + adviceType +
                ", adviceEnd=" + adviceEnd +
                ", adviceChinese='" + adviceChinese + '\'' +
                ", adviceDoctors='" + adviceDoctors + '\'' +
                ", registerName='" + registerName + '\'' +
                ", details=" + details +
                '}';
    }
}
