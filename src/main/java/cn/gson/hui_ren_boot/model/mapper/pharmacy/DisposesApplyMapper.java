package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DisposeApply;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DisposesApplyMapper {
    public List<DisposeApply> dispose(DisposeApply disposeApply);
}
