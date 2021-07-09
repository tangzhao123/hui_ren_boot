package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.OutpatientRegister;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface RegisterMapper {
    public List<Register> allRegis(Register inputboxs);
}
