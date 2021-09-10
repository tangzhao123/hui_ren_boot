package cn.gson.hui_ren_boot.model.pojos.medical;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Testmiddle {
    private String testAccount;
    private Long itemId;
    @Id
    @Column(name = "TEST_ACCOUNT")
    public String getTestAccount() {
        return testAccount;
    }

    public void setTestAccount(String testAccount) {
        this.testAccount = testAccount;
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
        return testAccount == that.testAccount && Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testAccount, itemId);
    }
}
