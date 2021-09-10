package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Destruction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DestructionMapper {

    //批量新增销毁申请详单
    public void addDestruction(List<Destruction> disposeApplyData,String applyId);

    //查询所有的销毁申请详单
    public List<String> findAllDestruction();

    //根据销毁申请单查询详单
    public List<Destruction> allDestruction(String applyId);
}
