package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Arrange;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArrangeMapper {

    //查询所有排班
    public List<Arrange> allArrange(String search);

    //新增排班
    public void addArrange(Arrange arrange);

    //修改排班
//    public void updateArrange(Arrange arrange);
}
