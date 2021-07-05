package cn.gson.hui_ren_boot.model.mapper;

import cn.gson.hui_ren_boot.model.pojos.OutpatientRegister;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OutRegisterMapper {
    //查询患者
    public List<OutpatientRegister> allRegister();
}
