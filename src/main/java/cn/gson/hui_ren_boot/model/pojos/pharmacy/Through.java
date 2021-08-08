package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Through {

    private long throughId;
    private Long throughDeport;
    private String throughEntry;



    @Id
    @Column(name = "THROUGH_ID")
    public long getThroughId() {
        return throughId;
    }

    public void setThroughId(long throughId) {
        this.throughId = throughId;
    }

    @Basic
    @Column(name = "THROUGH_DEPORT")
    public Long getThroughDeport() {
        return throughDeport;
    }

    public void setThroughDeport(Long throughDeport) {
        this.throughDeport = throughDeport;
    }

    @Basic
    @Column(name = "THROUGH_ENTRY")
    public String getThroughEntry() {
        return throughEntry;
    }

    public void setThroughEntry(String throughEntry) {
        this.throughEntry = throughEntry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Through through = (Through) o;
        return throughId == through.throughId && Objects.equals(throughDeport, through.throughDeport) && Objects.equals(throughEntry, through.throughEntry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(throughId, throughDeport, throughEntry);
    }
}
