package cn.gson.hui_ren_boot.model.pojos.hospital;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Hospital {
    private long hospitalId;//申请编号
    private String hospitalCause;//住院原因
    private String hospitalName;//姓名
    private Date hospitalDate;//日期
    private String hospitalSite;//地址
    private String hospitalCard;//身份证
    private String hospitalDoctor;//医生姓名
    private Long hospitalMedical;//科室编号
    private String  hospitalClinic;//诊疗卡
    private long hospitalState;//申请状态
    private Medical medicals;//科室

   @OneToOne
   public Medical getMedical() {
       return medicals;
    }

   public void setMedical(Medical medicals) {
       this.medicals = medicals;
    }

    public Hospital() {
    }

    public Hospital(long hospitalId, String hospitalCause, String hospitalName, Date hospitalDate, String hospitalSite, String hospitalCard, String hospitalDoctor, Long hospitalMedical, String hospitalClinic, long hospitalState) {
        this.hospitalId = hospitalId;
        this.hospitalCause = hospitalCause;
        this.hospitalName = hospitalName;
        this.hospitalDate = hospitalDate;
        this.hospitalSite = hospitalSite;
        this.hospitalCard = hospitalCard;
        this.hospitalDoctor = hospitalDoctor;
        this.hospitalMedical = hospitalMedical;
        this.hospitalClinic = hospitalClinic;
        this.hospitalState = hospitalState;
    }

    public Hospital(long hospitalId, String hospitalCause, String hospitalName, Date hospitalDate, String hospitalSite, String hospitalCard, String hospitalDoctor, Long hospitalMedical) {
        this.hospitalId = hospitalId;
        this.hospitalCause = hospitalCause;
        this.hospitalName = hospitalName;
        this.hospitalDate = hospitalDate;
        this.hospitalSite = hospitalSite;
        this.hospitalCard = hospitalCard;
        this.hospitalDoctor = hospitalDoctor;
        this.hospitalMedical = hospitalMedical;
    }

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "HOSPITAL_ID")
    public long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(long hospitalId) {
        this.hospitalId = hospitalId;
    }
    @Basic
    @Column(name="HOSPITAL_STATE")
    public long getHospitalState() {
        return hospitalState;
    }

    public void setHospitalState(long hospitalState) {
        this.hospitalState = hospitalState;
    }
    @Basic
    @Column(name="HOSPITAL_CLINIC")
    public String getHospitalClinic() {
        return hospitalClinic;
    }

    public void setHospitalClinic(String hospitalClinic) {
        this.hospitalClinic = hospitalClinic;
    }




    @Basic
    @Column(name = "HOSPITAL_CAUSE")
    public String getHospitalCause() {
        return hospitalCause;
    }

    public void setHospitalCause(String hospitalCause) {
        this.hospitalCause = hospitalCause;
    }

    @Basic
    @Column(name = "HOSPITAL_NAME")
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Basic
    @Column(name = "HOSPITAL_DATE")
    public Date getHospitalDate() {
        return hospitalDate;
    }

    public void setHospitalDate(Date hospitalDate) {
        this.hospitalDate = hospitalDate;
    }

    @Basic
    @Column(name = "HOSPITAL_SITE")
    public String getHospitalSite() {
        return hospitalSite;
    }

    public void setHospitalSite(String hospitalSite) {
        this.hospitalSite = hospitalSite;
    }

    @Basic
    @Column(name = "HOSPITAL_CARD")
    public String getHospitalCard() {
        return hospitalCard;
    }

    public void setHospitalCard(String hospitalCard) {
        this.hospitalCard = hospitalCard;
    }

    @Basic
    @Column(name = "HOSPITAL_DOCTOR")
    public String getHospitalDoctor() {
        return hospitalDoctor;
    }

    public void setHospitalDoctor(String hospitalDoctor) {
        this.hospitalDoctor = hospitalDoctor;
    }

    @Basic
    @Column(name = "HOSPITAL_MEDICAL")
    public Long getHospitalMedical() {
        return hospitalMedical;
    }

    public void setHospitalMedical(Long hospitalMedical) {
        this.hospitalMedical = hospitalMedical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return hospitalId == hospital.hospitalId && Objects.equals(hospitalCause, hospital.hospitalCause) && Objects.equals(hospitalName, hospital.hospitalName) && Objects.equals(hospitalDate, hospital.hospitalDate) && Objects.equals(hospitalSite, hospital.hospitalSite) && Objects.equals(hospitalCard, hospital.hospitalCard) && Objects.equals(hospitalDoctor, hospital.hospitalDoctor) && Objects.equals(hospitalMedical, hospital.hospitalMedical);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hospitalId, hospitalCause, hospitalName, hospitalDate, hospitalSite, hospitalCard, hospitalDoctor, hospitalMedical);
    }
}
