package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PURCHASE_ORDER", schema = "HUIREN")
public class PurchaseOrder {

    private long orderSerial;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp orderTime;
    private String orderId;
    private Long orderTotal;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp stocksDate;
    private String orderAgent;
    private String purchaseDetails;
    private List<OrderDetails> orderDetails;



    @Id
    @Column(name = "ORDER_SERIAL")
    public long getOrderSerial() {
        return orderSerial;
    }

    public void setOrderSerial(long orderSerial) {
        this.orderSerial = orderSerial;
    }


    @Basic
    @Column(name = "ORDER_TIME")
    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    @Basic
    @Column(name = "ORDER_ID")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "ORDER_TOTAL")
    public Long getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Long orderTotal) {
        this.orderTotal = orderTotal;
    }


    @Basic
    @Column(name = "STOCKS_DATE")

    public Timestamp getStocksDate() {
        return stocksDate;
    }

    public void setStocksDate(Timestamp stocksDate) {
        this.stocksDate = stocksDate;
    }

    @Basic
    @Column(name = "ORDER_AGENT")
    public String getOrderAgent() {
        return orderAgent;
    }

    public void setOrderAgent(String orderAgent) {
        this.orderAgent = orderAgent;
    }

    @Basic
    @Column(name = "PURCHASE_DETAILS")
    public String getPurchaseDetails() {
        return purchaseDetails;
    }

    public void setPurchaseDetails(String purchaseDetails) {
        this.purchaseDetails = purchaseDetails;
    }


    @OneToMany
    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseOrder that = (PurchaseOrder) o;
        return orderSerial == that.orderSerial && Objects.equals(orderTime, that.orderTime) && Objects.equals(orderId, that.orderId) && Objects.equals(orderTotal, that.orderTotal) && Objects.equals(stocksDate, that.stocksDate) && Objects.equals(orderAgent, that.orderAgent) && Objects.equals(purchaseDetails, that.purchaseDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderSerial, orderTime, orderId, orderTotal, stocksDate, orderAgent, purchaseDetails);
    }


    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "orderSerial=" + orderSerial +
                ", orderTime=" + orderTime +
                ", orderId='" + orderId + '\'' +
                ", orderTotal=" + orderTotal +
                ", stocksDate=" + stocksDate +
                ", orderAgent='" + orderAgent + '\'' +
                ", purchaseDetails='" + purchaseDetails + '\'' +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
