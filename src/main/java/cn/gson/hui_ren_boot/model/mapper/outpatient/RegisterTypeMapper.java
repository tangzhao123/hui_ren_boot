package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.RegisterType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegisterTypeMapper {
    //查询挂号类型
    public List<RegisterType> selType();

    //查询挂号费，根据挂号类型
    public double selMoney(Long typeNumber);
}
