package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Pharmacy {
    private Long pharmacyId;
    private String pharmacyName;


    @Id
    @Column(name = "PHARMACY_ID")
    public Long getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(Long pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    @Basic
    @Column(name = "PHARMACY_NAME")
    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(pharmacyId, pharmacy.pharmacyId) && Objects.equals(pharmacyName, pharmacy.pharmacyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pharmacyId, pharmacyName);
    }
}
