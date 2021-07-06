package cn.gson.hui_ren_boot.model.mapper.csp;

import cn.gson.hui_ren_boot.model.pojos.csp.OutpatientRegister;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OutRegisterMapper {
    //查询患者
    public List<OutpatientRegister> allRegister();
}
