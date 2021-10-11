package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Scattered;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScatteredMapper {
    //新增拆零记录表
    public void addScattered(Scattered scattered);

    //查询所有的药品拆零记录
    public List<Scattered> allScattered();

    //根据批号修改拆零数量（减）
    public void scNumber(long scNumber,String drugBatch);

    //根据批号修改拆零数量（加）
    public void scNumbers(long scNumber,String drugBatch);
}
