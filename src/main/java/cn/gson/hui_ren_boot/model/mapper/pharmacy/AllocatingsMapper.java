package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Allocating;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AllocatingsMapper {
    //新增
    public void AddAllocating(Allocating drugTransfers);
}
