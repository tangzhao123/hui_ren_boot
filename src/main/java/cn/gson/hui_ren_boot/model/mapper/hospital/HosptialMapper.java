package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Hospital;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface HosptialMapper {
    public List<Hospital> allHosptial(Hospital inputboxt);//连表条件分页查询
    public Hospital allsptal(String idCard);
}
