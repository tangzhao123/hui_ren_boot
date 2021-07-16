package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.OutpatientRegister;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 门诊患者库
 */
@Mapper
public interface OutRegisterMapper {
    //多条件查询患者
    public List<OutpatientRegister> allRegister(OutpatientRegister outpatientRegister);

    //新增患者信息
    public void addOutregister(OutpatientRegister outpatientRegister);

    //根据身份证号查询是否存在某患者
    public OutpatientRegister selRegister(String outpatientCard);
}
