package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ORDER_DETAILS", schema = "HUIREN")
public class OrderDetails {

    private long ordersSerial;
    private String ordersId;
    private String ordersNum;
    private String ordersProduct;
    private Long ordersSum;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp ordersDate;
    private Long ordersPrice;
    private String ordersBatch;
    private String orderIndate;



    @Id
    @Column(name = "ORDERS_SERIAL")
    public long getOrdersSerial() {
        return ordersSerial;
    }

    public void setOrdersSerial(long ordersSerial) {
        this.ordersSerial = ordersSerial;
    }

    @Basic
    @Column(name = "ORDERS_ID")
    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    @Basic
    @Column(name = "ORDERS_NUM")
    public String getOrdersNum() {
        return ordersNum;
    }

    public void setOrdersNum(String ordersNum) {
        this.ordersNum = ordersNum;
    }

    @Basic
    @Column(name = "ORDERS_PRODUCT")
    public String getOrdersProduct() {
        return ordersProduct;
    }

    public void setOrdersProduct(String ordersProduct) {
        this.ordersProduct = ordersProduct;
    }

    @Basic
    @Column(name = "ORDERS_SUM")
    public Long getOrdersSum() {
        return ordersSum;
    }

    public void setOrdersSum(Long ordersSum) {
        this.ordersSum = ordersSum;
    }


    @Basic
    @Column(name = "ORDERS_DATE")
    public Timestamp getOrdersDate() {
        return ordersDate;
    }

    public void setOrdersDate(Timestamp ordersDate) {
        this.ordersDate = ordersDate;
    }

    @Basic
    @Column(name = "ORDERS_PRICE")
    public Long getOrdersPrice() {
        return ordersPrice;
    }

    public void setOrdersPrice(Long ordersPrice) {
        this.ordersPrice = ordersPrice;
    }

    @Basic
    @Column(name = "ORDERS_BATCH")
    public String getOrdersBatch() {
        return ordersBatch;
    }

    public void setOrdersBatch(String ordersBatch) {
        this.ordersBatch = ordersBatch;
    }

    @Basic
    @Column(name = "ORDER_INDATE")
    public String getOrderIndate() {
        return orderIndate;
    }

    public void setOrderIndate(String orderIndate) {
        this.orderIndate = orderIndate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetails that = (OrderDetails) o;
        return ordersSerial == that.ordersSerial && Objects.equals(ordersId, that.ordersId) && Objects.equals(ordersNum, that.ordersNum) && Objects.equals(ordersProduct, that.ordersProduct) && Objects.equals(ordersSum, that.ordersSum) && Objects.equals(ordersDate, that.ordersDate) && Objects.equals(ordersPrice, that.ordersPrice) && Objects.equals(ordersBatch, that.ordersBatch) && Objects.equals(orderIndate, that.orderIndate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordersSerial, ordersId, ordersNum, ordersProduct, ordersSum, ordersDate, ordersPrice, ordersBatch, orderIndate);
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "ordersSerial=" + ordersSerial +
                ", ordersId='" + ordersId + '\'' +
                ", ordersNum='" + ordersNum + '\'' +
                ", ordersProduct='" + ordersProduct + '\'' +
                ", ordersSum=" + ordersSum +
                ", ordersDate=" + ordersDate +
                ", ordersPrice=" + ordersPrice +
                ", ordersBatch='" + ordersBatch + '\'' +
                ", orderIndate='" + orderIndate + '\'' +
                '}';
    }
}
