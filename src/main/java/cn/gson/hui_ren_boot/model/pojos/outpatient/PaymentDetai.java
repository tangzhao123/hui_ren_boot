package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.util.Objects;

/**
 * 缴费详表
 */
@Entity
@Table(name = "PAYMENT_DETAI", schema = "HUIREN", catalog = "")
public class PaymentDetai {
    private long detailId;
    private String detailNo;
    private String paymentNo;
    private String entryName;
    private Long paymentNumber;
    private double amount;
    private double paymentPrice;

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "DETAIL_ID")
    public long getDetailId() {
        return detailId;
    }

    public void setDetailId(long detailId) {
        this.detailId = detailId;
    }

    @Basic
    @Column(name = "DETAIL_NO")
    public String getDetailNo() {
        return detailNo;
    }

    public void setDetailNo(String detailNo) {
        this.detailNo = detailNo;
    }

    @Basic
    @Column(name = "PAYMENT_NO")
    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    @Basic
    @Column(name = "ENTRY_NAME")
    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    @Basic
    @Column(name = "PAYMENT_NUMBER")
    public Long getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(Long paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    @Basic
    @Column(name = "AMOUNT")
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "PAYMENT_PRICE")
    public double getPaymentPrice() {
        return paymentPrice;
    }

    public void setPaymentPrice(double paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentDetai that = (PaymentDetai) o;
        return detailId == that.detailId && Objects.equals(detailNo, that.detailNo) && Objects.equals(paymentNo, that.paymentNo) && Objects.equals(entryName, that.entryName) && Objects.equals(paymentNumber, that.paymentNumber) && Objects.equals(amount, that.amount) && Objects.equals(paymentPrice, that.paymentPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailId, detailNo, paymentNo, entryName, paymentNumber, amount, paymentPrice);
    }
}
