package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DRUG_STANDARD", schema = "HUIREN")
public class DrugStandard {
    private Long standardId;//规格编号
    private String standardName;//规格名称


    @Id
    @Column(name = "STANDARD_ID")
    public Long getStandardId() {
         return standardId;
    }

    public void setStandardId(Long standardId) {
        this.standardId = standardId;
    }

    @Basic
    @Column(name = "STANDARD_NAME")
    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    @Override
    public String toString() {
        return "DrugStandard{" +
                "standardId=" + standardId +
                ", standardName='" + standardName + '\'' +
                '}';
    }
}
