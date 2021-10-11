package cn.gson.hui_ren_boot.model.pojos.pharmacy;

//药品规格的vo类
public class DrugInfoVo {

    private String drugName;
    private String standardName;

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    @Override
    public String toString() {
        return "DrugInfoVo{" +
                "drugName='" + drugName + '\'' +
                ", standardName='" + standardName + '\'' +
                '}';
    }
}
