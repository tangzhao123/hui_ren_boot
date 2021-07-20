package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "WITHDRAWAL", schema = "HUIREN", catalog = "")
public class Withdrawal {
    private long withdrawalId;
    private String bookingNo;
    private Time withdrawalDate;

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
    public Time getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(Time withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Withdrawal that = (Withdrawal) o;
        return withdrawalId == that.withdrawalId && Objects.equals(bookingNo, that.bookingNo) && Objects.equals(withdrawalDate, that.withdrawalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withdrawalId, bookingNo, withdrawalDate);
    }
}
