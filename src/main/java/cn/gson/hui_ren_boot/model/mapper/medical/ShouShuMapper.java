package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShouShuMapper {

    public List<Staff> zhudao();

    public List<Staff> mazui();
}
