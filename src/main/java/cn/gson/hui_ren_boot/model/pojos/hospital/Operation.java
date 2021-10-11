package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Operation {

    private long operationSeriald;//序号
    private String operationId;//手术编号
    private String operationAddress;//地址
    private Long operationSite;//状态
    private String medicalName;//科室名称


    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "OPERATION_SERIALD")
    public long getOperationSeriald() {
        return operationSeriald;
    }

    public void setOperationSeriald(long operationSeriald) {
        this.operationSeriald = operationSeriald;
    }
    @Basic
    @Column(name = "MEDICAL_NAME")
    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
            this.medicalName = medicalName;
        }
    @Basic
    @Column(name = "OPERATION_ID")
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @Basic
    @Column(name = "OPERATION_ADDRESS")
    public String getOperationAddress() {
        return operationAddress;
    }

    public void setOperationAddress(String operationAddress) {
        this.operationAddress = operationAddress;
    }

    @Basic
    @Column(name = "OPERATION_SITE")
    public Long getOperationSite() {
        return operationSite;
    }

    public void setOperationSite(Long operationSite) {
        this.operationSite = operationSite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation = (Operation) o;
        return operationSeriald == operation.operationSeriald && Objects.equals(operationId, operation.operationId) && Objects.equals(operationAddress, operation.operationAddress) && Objects.equals(operationSite, operation.operationSite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationSeriald, operationId, operationAddress, operationSite);
    }

    @Override
    public String toString() {
        return "Operation{" +
                "operationSeriald=" + operationSeriald +
                ", operationId='" + operationId + '\'' +
                ", operationAddress='" + operationAddress + '\'' +
                ", operationSite=" + operationSite +
                ", medicalName='" + medicalName + '\'' +
                '}';
    }
}
