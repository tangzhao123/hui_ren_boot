package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.permissions.CheckInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckInfoMapper {

    //新增审批记录
    public void addCheckInfo(CheckInfo checkInfo);
}
