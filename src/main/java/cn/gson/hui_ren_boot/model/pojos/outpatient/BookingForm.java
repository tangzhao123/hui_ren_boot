package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

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
    private OutpatientRegister outpatientId;
    private Medical officeId;
    private Staff outdoctorId;


    @OneToOne
    public OutpatientRegister getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(OutpatientRegister outpatientId) {
        this.outpatientId = outpatientId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingForm that = (BookingForm) o;
        return bookingId == that.bookingId && officeId == that.officeId && outdoctorId == that.outdoctorId && Objects.equals(bookingNo, that.bookingNo) && Objects.equals(outpatientId, that.outpatientId) && Objects.equals(bookingDate, that.bookingDate) && Objects.equals(bookingType, that.bookingType) && Objects.equals(treatmentNo, that.treatmentNo) && Objects.equals(bookingFee, that.bookingFee) && Objects.equals(bookingOther, that.bookingOther) && Objects.equals(bookingOrder, that.bookingOrder) && Objects.equals(bookingReturn, that.bookingReturn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, bookingNo, outpatientId, officeId, outdoctorId, bookingDate, bookingType, treatmentNo, bookingFee, bookingOther, bookingOrder, bookingReturn);
    }

}
