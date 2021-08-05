package cn.gson.hui_ren_boot.model.pojos.pharmacy;



import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ORDER_DETAILS", schema = "HUIREN")
public class OrderDetails {

    private long ordersSerial;
    private String ordersId;
    private String ordersNum;
    private String ordersProduct;
    private Long ordersSum;
    private Long ordersPrice;
    private String drugName;
    private Integer drugLife;


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
    @Column(name = "ORDERS_PRICE")
    public Long getOrdersPrice() {
        return ordersPrice;
    }

    public void setOrdersPrice(Long ordersPrice) {
        this.ordersPrice = ordersPrice;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Integer getDrugLife() {
        return drugLife;
    }

    public void setDrugLife(Integer drugLife) {
        this.drugLife = drugLife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetails that = (OrderDetails) o;
        return ordersSerial == that.ordersSerial && Objects.equals(ordersId, that.ordersId) && Objects.equals(ordersNum, that.ordersNum) && Objects.equals(ordersProduct, that.ordersProduct) && Objects.equals(ordersSum, that.ordersSum)  && Objects.equals(ordersPrice, that.ordersPrice) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordersSerial, ordersId, ordersNum, ordersProduct, ordersSum, ordersPrice);
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "ordersSerial=" + ordersSerial +
                ", ordersId='" + ordersId + '\'' +
                ", ordersNum='" + ordersNum + '\'' +
                ", ordersProduct='" + ordersProduct + '\'' +
                ", ordersSum=" + ordersSum +
                ", ordersPrice=" + ordersPrice +
                '}';
    }
}
