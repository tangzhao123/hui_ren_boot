package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DRUG_DEPORT", schema = "HUIREN", catalog = "")
public class DrugDeport {
    private Long id;
    private Long deportId;
    private String deportName;
    private Long deportForm;
    private Long deportStock;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "DEPORT_ID")
    public Long getDeportId() {
        return deportId;
    }

    public void setDeportId(Long deportId) {
        this.deportId = deportId;
    }

    @Basic
    @Column(name = "DEPORT_NAME")
    public String getDeportName() {
        return deportName;
    }

    public void setDeportName(String deportName) {
        this.deportName = deportName;
    }

    @Basic
    @Column(name = "DEPORT_FORM")
    public Long getDeportForm() {
        return deportForm;
    }

    public void setDeportForm(Long deportForm) {
        this.deportForm = deportForm;
    }

    @Basic
    @Column(name = "DEPORT_STOCK")
    public Long getDeportStock() {
        return deportStock;
    }

    public void setDeportStock(Long deportStock) {
        this.deportStock = deportStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugDeport that = (DrugDeport) o;
        return Objects.equals(deportId, that.deportId) && Objects.equals(deportName, that.deportName) && Objects.equals(deportForm, that.deportForm) && Objects.equals(deportStock, that.deportStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deportId, deportName, deportForm, deportStock);
    }
}
