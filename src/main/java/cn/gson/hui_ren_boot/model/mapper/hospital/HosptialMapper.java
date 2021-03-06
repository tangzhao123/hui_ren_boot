package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Hospital;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HosptialMapper {
    public List<Hospital> allHosptial(Hospital inputboxt);//连表条件分页查询
    public List<Hospital> allHosptialt(Hospital inputboxt);//连表条件分页查询
    public Hospital allSptal(String idCard);
    public void addHostp(Hospital add);
    public void upHostp(Hospital up);
    public void deHostp(@Param("hospitalId") int hospitalId);
    public void upHostpState(Hospital State);
}
