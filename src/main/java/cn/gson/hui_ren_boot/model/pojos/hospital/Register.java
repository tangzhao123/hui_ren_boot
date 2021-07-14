package cn.gson.hui_ren_boot.model.pojos.hospital;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Register {

    private int registerSerica;//序号
    private String registerId;//住院号
    private Date registerDate;//入院时间
    private String registerName;//姓名
    private int registerSex;//性别
    private Date registerSite;//出生日期
    private int registerCard;//婚否
    private String registerPrint;//职业
    private int registerAge;//年龄
    private String registerHome;//身份证
    private String registerAddress;//家庭住址
    private String registerPhone;//患者电话
    private String registerRelation;//病人关系
    private String registerContact;//联系人
    private String registerCall;//联系电话
    private int registerMethod;//付款方式
    private int medicalId;//科室
    private String registerRecord;//入院诊断
    private int staffId;//主治医生
    private String registerClinic;//就诊卡号
    private String  sickbedMark;//病房号
    private Medical medical;//科室
    private Staff staff;//员工
    private Sickbed sickbed;//病床
    //科室关系
    @OneToOne
    public Medical getMedical() {
        return medical;
    }
    public void setMedical(Medical medical) {
        this.medical = medical;
    }
//    //员工关系
   @OneToOne
    public Staff getStaff() {
        return staff;
    }
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
   @OneToOne
    public Sickbed getSickbed() {
        return sickbed;
    }
    public void setSickbed(Sickbed sickbed) {
        this.sickbed = sickbed;
    }
    @Id
    @Column(name = "REGISTER_SERICA")
    public int getRegisterSerica() {
        return registerSerica;
    }

    public void setRegisterSerica(int registerSerica) {
        this.registerSerica = registerSerica;
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
    @Column(name = "REGISTER_DATE")
    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
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
    @Column(name = "REGISTER_SEX")
    public int getRegisterSex() {
        return registerSex;
    }

    public void setRegisterSex(int registerSex) {
        this.registerSex = registerSex;
    }

    @Basic
    @Column(name = "REGISTER_SITE")
    public Date getRegisterSite() {
        return registerSite;
    }

    public void setRegisterSite(Date registerSite) {
        this.registerSite = registerSite;
    }

    @Basic
    @Column(name = "REGISTER_CARD")
    public int getRegisterCard() {
        return registerCard;
    }

    public void setRegisterCard(int registerCard) {
        this.registerCard = registerCard;
    }

    @Basic
    @Column(name = "REGISTER_PRINT")
    public String getRegisterPrint() {
        return registerPrint;
    }

    public void setRegisterPrint(String registerPrint) {
        this.registerPrint = registerPrint;
    }

    @Basic
    @Column(name = "REGISTER_AGE")
    public int getRegisterAge() {
        return registerAge;
    }

    public void setRegisterAge(int registerAge) {
        this.registerAge = registerAge;
    }

    @Basic
    @Column(name = "REGISTER_HOME")
    public String getRegisterHome() {
        return registerHome;
    }

    public void setRegisterHome(String registerHome) {
        this.registerHome = registerHome;
    }

    @Basic
    @Column(name = "REGISTER_ADDRESS")
    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    @Basic
    @Column(name = "REGISTER_PHONE")
    public String getRegisterPhone() {
        return registerPhone;
    }

    public void setRegisterPhone(String registerPhone) {
        this.registerPhone = registerPhone;
    }

    @Basic
    @Column(name = "REGISTER_RELATION")
    public String getRegisterRelation() {
        return registerRelation;
    }

    public void setRegisterRelation(String registerRelation) {
        this.registerRelation = registerRelation;
    }

    @Basic
    @Column(name = "REGISTER_CONTACT")
    public String getRegisterContact() {
        return registerContact;
    }

    public void setRegisterContact(String registerContact) {
        this.registerContact = registerContact;
    }

    @Basic
    @Column(name = "REGISTER_CALL")
    public String getRegisterCall() {
        return registerCall;
    }

    public void setRegisterCall(String registerCall) {
        this.registerCall = registerCall;
    }

    @Basic
    @Column(name = "REGISTER_METHOD")
    public int getRegisterMethod() {
        return registerMethod;
    }

    public void setRegisterMethod(int registerMethod) {
        this.registerMethod = registerMethod;
    }

   @Basic
    @Column(name = "MEDICAL_ID")
    public int getMedicalId() {
       return medicalId;
   }

    public void setMedicalId(int medicalId) {
       this.medicalId = medicalId;
   }

    @Basic
    @Column(name = "REGISTER_RECORD")
    public String getRegisterRecord() {
        return registerRecord;
    }

    public void setRegisterRecord(String registerRecord) {
        this.registerRecord = registerRecord;
    }

    @Basic
    @Column(name = "STAFF_ID")
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "REGISTER_CLINIC")
    public String getRegisterClinic() {
        return registerClinic;
    }

    public void setRegisterClinic(String registerClinic) {
        this.registerClinic = registerClinic;
    }

    @Basic
    @Column(name = "SICKBED_MARK")
    public String getSickbedMark() {
        return sickbedMark;
    }

    public void setSickbedMark(String sickbedMark) {
        this.sickbedMark = sickbedMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Register register = (Register) o;
        return registerSerica == register.registerSerica && Objects.equals(registerId, register.registerId) && Objects.equals(registerDate, register.registerDate) && Objects.equals(registerName, register.registerName) && Objects.equals(registerSex, register.registerSex) && Objects.equals(registerSite, register.registerSite) && Objects.equals(registerCard, register.registerCard) && Objects.equals(registerPrint, register.registerPrint) && Objects.equals(registerAge, register.registerAge) && Objects.equals(registerHome, register.registerHome) && Objects.equals(registerAddress, register.registerAddress) && Objects.equals(registerPhone, register.registerPhone) && Objects.equals(registerRelation, register.registerRelation) && Objects.equals(registerContact, register.registerContact) && Objects.equals(registerCall, register.registerCall) && Objects.equals(registerMethod, register.registerMethod)  && Objects.equals(registerRecord, register.registerRecord) && Objects.equals(staffId, register.staffId) && Objects.equals(registerClinic, register.registerClinic) && Objects.equals(sickbedMark, register.sickbedMark);
    }

    //&& Objects.equals(medicalId, register.medicalId)

    //medicalId,
    @Override
    public int hashCode() {
        return Objects.hash(registerSerica, registerId, registerDate, registerName, registerSex, registerSite, registerCard, registerPrint, registerAge, registerHome, registerAddress, registerPhone, registerRelation, registerContact, registerCall, registerMethod, registerRecord, staffId, registerClinic, sickbedMark);
    }
}
