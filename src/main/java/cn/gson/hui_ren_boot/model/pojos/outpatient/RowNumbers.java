package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ROW_NUMBERS", schema = "HUIREN", catalog = "")
public class RowNumbers {
    private long rowId;
    private BookingForm bookingForm;

    @Id
    @SequenceGenerator(sequenceName = "seq_hr",name = "seq6",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq6",strategy = GenerationType.SEQUENCE)
    @Column(name = "ROW_ID")
    public long getRowId() {
        return rowId;
    }

    public void setRowId(long rowId) {
        this.rowId = rowId;
    }

    @OneToOne
    public BookingForm getBookingForm() {
        return bookingForm;
    }

    public void setBookingForm(BookingForm bookingForm) {
        this.bookingForm = bookingForm;
    }

    @Override
    public String toString() {
        return "RowNumbers{" +
                "rowId=" + rowId +
                ", bookingForm=" + bookingForm +
                '}';
    }
}
