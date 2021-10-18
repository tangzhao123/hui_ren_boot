package cn.gson.hui_ren_boot.model.pojos.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Orders {
    private long ordersSerial;//执行序号
    private String ordersUser;//执行护士
    @JsonFormat(pattern = "yyyy-MM-dd HH:ss:mm",timezone = "GMT+8")
    private Date orderWay;//执行时间
    private String orderDetails;//医嘱详情
    private String ordersId;//医嘱执行号
    private Advice advice;//医嘱
    private Details details;//医嘱详情
    private Record record;//床位使用记录
    private Long medicalId;//科室编号
    private Date date;
    private Date date1;

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
    public String getOrdersUser() {
        return ordersUser;
    }

    public void setOrdersUser(String ordersUser) {
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
    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
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

    @Transient
    public Long getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Long medicalId) {
        this.medicalId = medicalId;
    }

    @Transient
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Transient
    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    @OneToOne
    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    @OneToOne
    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    @OneToOne
    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
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

    @Override
    public String toString() {
        return "Orders{" +
                "ordersSerial=" + ordersSerial +
                ", ordersUser='" + ordersUser + '\'' +
                ", orderWay=" + orderWay +
                ", orderDetails='" + orderDetails + '\'' +
                ", ordersId='" + ordersId + '\'' +
                ", advice=" + advice +
                ", details=" + details +
                ", record=" + record +
                ", medicalId=" + medicalId +
                ", date=" + date +
                ", date1=" + date1 +
                '}';
    }
}
