package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Deduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeductMapper {

    //新增库存扣除详情
    public void addDeduct(Deduct deduct);

    //根据出库单号查询库存扣除记录
    public List<Deduct> findAllDeduct(String goNum);
}
