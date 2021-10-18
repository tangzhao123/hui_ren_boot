package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "REFUND", schema = "HUIREN", catalog = "")
public class Refund {
    private long refundId;
    private String bookingNo;
    private double refundFee;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date refundDate;
    private long staffId;
    private Staff staff;
    private String staffName;
    private Date start;
    private Date end;

    @OneToOne
    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "REFUND_ID")
    public long getRefundId() {
        return refundId;
    }

    public void setRefundId(long refundId) {
        this.refundId = refundId;
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
    @Column(name = "REFUND_FEE")
    public double getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(double refundFee) {
        this.refundFee = refundFee;
    }

    @Basic
    @Column(name = "REFUND_DATE")
    public Date getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }

    @Basic
    @Column(name = "STAFF_ID")
    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Refund() {
    }

    public Refund(String bookingNo, double refundFee, long staffId) {
        this.bookingNo = bookingNo;
        this.refundFee = refundFee;
        this.staffId = staffId;
    }
}
