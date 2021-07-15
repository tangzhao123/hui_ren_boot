package cn.gson.hui_ren_boot.model.pojos.hospital;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Register {

    private int registerSerica;//序号1
    private String registerId;//住院号2
    private Date registerDate;//入院时间3
    private String registerName;//姓名4
    private int registerSex;//性别5
    private Date registerSite;//出生日期6
    private int registerCard;//婚否7
    private String registerPrint;//职业8
    private int registerAge;//年龄9
    private String registerHome;//身份证10
    private String registerAddress;//家庭住址11
    private String registerPhone;//患者电话12
    private String registerRelation;//病人关系13
    private String registerContact;//联系人14
    private String registerCall;//联系电话15
    private int registerMethod;//付款方式
    private int medicalId;//科室
    private String registerRecord;//入院诊断16
    private int staffId;//主治医生
    private String registerClinic;//就诊卡号17
    private String  sickbedMark;//病床号
    private Medical medical;//科室
    private Staff staff;//员工
    private Sickbed sickbed;//病床

    public Register() {
    }

    public Register(int registerSerica, String registerId, String registerName, int registerSex, Date registerSite, int registerCard, String registerPrint, int registerAge, String registerHome, String registerAddress, String registerPhone, String registerRelation, String registerContact, String registerCall, int medicalId, String registerRecord, String registerClinic) {
        this.registerSerica = registerSerica;
        this.registerId = registerId;
        this.registerName = registerName;
        this.registerSex = registerSex;
        this.registerSite = registerSite;
        this.registerCard = registerCard;
        this.registerPrint = registerPrint;
        this.registerAge = registerAge;
        this.registerHome = registerHome;
        this.registerAddress = registerAddress;
        this.registerPhone = registerPhone;
        this.registerRelation = registerRelation;
        this.registerContact = registerContact;
        this.registerCall = registerCall;
        this.medicalId = medicalId;
        this.registerRecord = registerRecord;
        this.registerClinic = registerClinic;
    }

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

    @Override
    public String toString() {
        return "Register{" +
                "registerSerica=" + registerSerica +
                ", registerId='" + registerId + '\'' +
                ", registerDate=" + registerDate +
                ", registerName='" + registerName + '\'' +
                ", registerSex=" + registerSex +
                ", registerSite=" + registerSite +
                ", registerCard=" + registerCard +
                ", registerPrint='" + registerPrint + '\'' +
                ", registerAge=" + registerAge +
                ", registerHome='" + registerHome + '\'' +
                ", registerAddress='" + registerAddress + '\'' +
                ", registerPhone='" + registerPhone + '\'' +
                ", registerRelation='" + registerRelation + '\'' +
                ", registerContact='" + registerContact + '\'' +
                ", registerCall='" + registerCall + '\'' +
                ", registerMethod=" + registerMethod +
                ", medicalId=" + medicalId +
                ", registerRecord='" + registerRecord + '\'' +
                ", staffId=" + staffId +
                ", registerClinic='" + registerClinic + '\'' +
                ", sickbedMark='" + sickbedMark + '\'' +
                ", medical=" + medical +
                ", staff=" + staff +
                ", sickbed=" + sickbed +
                '}';
    }
}
