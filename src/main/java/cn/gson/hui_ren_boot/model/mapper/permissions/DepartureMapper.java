package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Departure;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartureMapper {

    //新增离职记录表
    public void addDeparture(Departure departure);
}
