package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DRUG_SUPPLIER", schema = "HUIREN")
public class DrugSupplier {
    private Long supplierId;
    private String supplierName;
    private String supplierAddress;
    private Long supplierPhone;

    @Id
    @Column(name = "SUPPLIER_ID")
    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "SUPPLIER_NAME")
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Basic
    @Column(name = "SUPPLIER_ADDRESS")
    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    @Basic
    @Column(name = "SUPPLIER_PHONE")
    public Long getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(Long supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugSupplier that = (DrugSupplier) o;
        return Objects.equals(supplierId, that.supplierId) && Objects.equals(supplierName, that.supplierName) && Objects.equals(supplierAddress, that.supplierAddress) && Objects.equals(supplierPhone, that.supplierPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId, supplierName, supplierAddress, supplierPhone);
    }
}
