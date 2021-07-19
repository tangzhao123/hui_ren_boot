package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "WITHDRAWAL", schema = "HUIREN", catalog = "")
public class Withdrawal {
    private long withdrawalId;
    private String bookingNo;
    private Date withdrawalDate;
    private String cause;

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "WITHDRAWAL_ID")
    public long getWithdrawalId() {
        return withdrawalId;
    }

    public void setWithdrawalId(long withdrawalId) {
        this.withdrawalId = withdrawalId;
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
    @Column(name = "WITHDRAWAL_DATE")
    public Date getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(Date withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    @Basic
    @Column(name = "CAUSE")
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

}
