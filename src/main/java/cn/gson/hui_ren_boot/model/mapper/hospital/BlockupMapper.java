package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Blockup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlockupMapper {
    public void addBlockup(Blockup block);//添加

}
