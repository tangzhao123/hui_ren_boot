package cn.gson.hui_ren_boot.model.pojos.nursestation;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Orders {
    private long ordersSerial;//执行序号
    private Long ordersUser;//执行护士
    private Date orderWay;//执行时间
    private Long orderDetails;//医嘱详情
    private String ordersId;//医嘱执行号

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "ORDERS_SERIAL")
    public long getOrdersSerial() {
        return ordersSerial;
    }

    public void setOrdersSerial(long ordersSerial) {
        this.ordersSerial = ordersSerial;
    }

    @Basic
    @Column(name = "ORDERS_USER")
    public Long getOrdersUser() {
        return ordersUser;
    }

    public void setOrdersUser(Long ordersUser) {
        this.ordersUser = ordersUser;
    }

    @Basic
    @Column(name = "ORDER_WAY")
    public Date getOrderWay() {
        return orderWay;
    }

    public void setOrderWay(Date orderWay) {
        this.orderWay = orderWay;
    }

    @Basic
    @Column(name = "ORDER_DETAILS")
    public Long getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Long orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Basic
    @Column(name = "ORDERS_ID")
    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return ordersSerial == orders.ordersSerial && Objects.equals(ordersUser, orders.ordersUser) && Objects.equals(orderWay, orders.orderWay) && Objects.equals(orderDetails, orders.orderDetails) && Objects.equals(ordersId, orders.ordersId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordersSerial, ordersUser, orderWay, orderDetails, ordersId);
    }
}
