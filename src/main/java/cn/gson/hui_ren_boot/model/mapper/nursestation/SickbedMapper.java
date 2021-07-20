package cn.gson.hui_ren_boot.model.mapper.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Sickbed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SickbedMapper{

    //查询病床
    public List<Sickbed> selSickbed();
}
