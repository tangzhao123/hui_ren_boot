package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalsMapper {
    public List<Medical>allMedica();
}
