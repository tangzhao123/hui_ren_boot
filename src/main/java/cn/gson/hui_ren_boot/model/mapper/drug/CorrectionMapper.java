package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Correction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CorrectionMapper {

    //新增库存修正记录
    public void addCorrection(Correction correction);

    //查询所有的库存修正记录
    public List<Correction> findAllCorrection(String start,String end,String search);
}
