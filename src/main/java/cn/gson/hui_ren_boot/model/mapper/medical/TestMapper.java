package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.hospital.InspectDebit;
import cn.gson.hui_ren_boot.model.pojos.medical.Combinspection;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.pojos.medical.Testmiddle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestMapper {
    //查看检验结果
    public List<Combinspection> lookresult(@Param("inspectionPhone") String inspectionPhone);

    //修改检验后的状态
    public void payitem(String testAccount);

    //修改预约的状态
    public void updateDebit(String testPhone);

    //预约缴费
    public void addDebit(InspectDebit debit);

    //删除修改预约的状态
    public void updateYuyue(String testAccount);

    //删除
    public void dels (Long testId);

    //新增体检人员
    public void insertTest(Test test);

    //查询体检套餐（表格内）
    public List<Test> selectCmobo(Test test);

    //新增体检中间表
    public void addMiddle(Testmiddle testmiddle);
    public void addMiddles(Testmiddle testmiddle);
}
