package cn.gson.hui_ren_boot.model.pojos.medical;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Testmiddle {
    private Long testId;
    private Long itemId;

    @Id
    @Column(name = "TEST_ID")
    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    @Basic
    @Column(name = "ITEM_ID")
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Testmiddle that = (Testmiddle) o;
        return testId == that.testId && Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, itemId);
    }
}
