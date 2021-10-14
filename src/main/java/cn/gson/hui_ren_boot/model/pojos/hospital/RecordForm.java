package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "RECORD_FORM", schema = "HUIREN", catalog = "")
public class RecordForm {

    private long formId;//主键
    private String registerId;//住院号
    private Date formDate;//执行时间
    private String formStart;//原先科室
    private String formEnd;//转科科室
    private String formName;//执行人
    private String formStaff;//新医生
    private String formStartstaff;//原医生



    @Id
    @Column(name = "FORM_ID")
    public long getFormId() {
        return formId;
    }

    public void setFormId(long formId) {
        this.formId = formId;
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
    @Column(name = "FORM_DATE")
    public Date getFormDate() {
        return formDate;
    }

    public void setFormDate(Date formDate) {
        this.formDate = formDate;
    }

    @Basic
    @Column(name = "FORM_START")
    public String getFormStart() {
        return formStart;
    }

    public void setFormStart(String formStart) {
        this.formStart = formStart;
    }

    @Basic
    @Column(name = "FORM_END")
    public String getFormEnd() {
        return formEnd;
    }

    public void setFormEnd(String formEnd) {
        this.formEnd = formEnd;
    }

    @Basic
    @Column(name = "FORM_NAME")
    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    @Basic
    @Column(name = "FORM_STAFF")
    public String getFormStaff() {
        return formStaff;
    }

    public void setFormStaff(String formStaff) {
        this.formStaff = formStaff;
    }

    @Basic
    @Column(name = "FORM_STARTSTAFF")
    public String getFormStartstaff() {
        return formStartstaff;
    }

    public void setFormStartstaff(String formStartstaff) {
        this.formStartstaff = formStartstaff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordForm that = (RecordForm) o;
        return formId == that.formId && Objects.equals(registerId, that.registerId) && Objects.equals(formDate, that.formDate) && Objects.equals(formStart, that.formStart) && Objects.equals(formEnd, that.formEnd) && Objects.equals(formName, that.formName) && Objects.equals(formStaff, that.formStaff) && Objects.equals(formStartstaff, that.formStartstaff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formId, registerId, formDate, formStart, formEnd, formName, formStaff, formStartstaff);
    }
}
