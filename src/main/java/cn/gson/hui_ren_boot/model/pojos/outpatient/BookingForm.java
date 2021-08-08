package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BOOKING_FORM", schema = "HUIREN", catalog = "")
public class BookingForm {
    private long bookingId;
    private String bookingNo;
    private Date bookingDate;
    private Long bookingType;
    private String treatmentNo;
    private Long bookingFee;
    private Long bookingOther;
    private Date bookingOrder;
    private String bookingReturn;
    private Long bookingState;
    private int outpatientId;
    private int medicalId;
    private int staffId;
    private OutpatientRegister outpatient;
    private Medical officeId;
    private Staff outdoctorId;


    @OneToOne
    public OutpatientRegister getOutpatient() {
        return outpatient;
    }

    public void setOutpatient(OutpatientRegister outpatient) {
        this.outpatient = outpatient;
    }


    @OneToOne
    public Medical getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Medical officeId) {
        this.officeId = officeId;
    }

    @OneToOne
    public Staff getOutdoctorId() {
        return outdoctorId;
    }

    public void setOutdoctorId(Staff outdoctorId) {
        this.outdoctorId = outdoctorId;
    }

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "BOOKING_ID")
    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    @Basic
    @Column(name = "BOOKING_NO")
    public String getBookingNo() {
        return bookingNo;
    }

    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }

    @Basic
    @Column(name = "BOOKING_DATE")
    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Basic
    @Column(name = "BOOKING_TYPE")
    public Long getBookingType() {
        return bookingType;
    }

    public void setBookingType(Long bookingType) {
        this.bookingType = bookingType;
    }

    @Basic
    @Column(name = "TREATMENT_NO")
    public String getTreatmentNo() {
        return treatmentNo;
    }

    public void setTreatmentNo(String treatmentNo) {
        this.treatmentNo = treatmentNo;
    }

    @Basic
    @Column(name = "BOOKING_FEE")
    public Long getBookingFee() {
        return bookingFee;
    }

    public void setBookingFee(Long bookingFee) {
        this.bookingFee = bookingFee;
    }

    @Basic
    @Column(name = "BOOKING_OTHER")
    public Long getBookingOther() {
        return bookingOther;
    }

    public void setBookingOther(Long bookingOther) {
        this.bookingOther = bookingOther;
    }

    @Basic
    @Column(name = "BOOKING_ORDER")
    public Date getBookingOrder() {
        return bookingOrder;
    }

    public void setBookingOrder(Date bookingOrder) {
        this.bookingOrder = bookingOrder;
    }

    @Basic
    @Column(name = "BOOKING_RETURN")
    public String getBookingReturn() {
        return bookingReturn;
    }

    public void setBookingReturn(String bookingReturn) {
        this.bookingReturn = bookingReturn;
    }

    @Basic
    @Column(name = "BOOKING_STATE")
    public Long getBookingState() {
        return bookingState;
    }

    public void setBookingState(Long bookingState) {
        this.bookingState = bookingState;
    }

    @Basic
    @Column(name = "OUTPATIENT_ID")
    public int getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(int outpatientId) {
        this.outpatientId = outpatientId;
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
    @Column(name = "STAFF_ID")
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "BookingForm{" +
                "bookingId=" + bookingId +
                ", bookingNo='" + bookingNo + '\'' +
                ", bookingDate=" + bookingDate +
                ", bookingType=" + bookingType +
                ", treatmentNo='" + treatmentNo + '\'' +
                ", bookingFee=" + bookingFee +
                ", bookingOther=" + bookingOther +
                ", bookingOrder=" + bookingOrder +
                ", bookingReturn='" + bookingReturn + '\'' +
                ", outpatient=" + outpatient +
                ", officeId=" + officeId +
                ", outdoctorId=" + outdoctorId +
                '}';
    }
}
