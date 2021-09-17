package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.RowNumbers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RowNumbersMapper {

    //新增排号
    public void addNumber(String bookingNo);

    //查询排号
    public List<RowNumbers> allNumber(@Param("medicalId") int medicalId,@Param("staffId") int staffId,@Param("rankId") int rankId);

    //过号，根据挂号单修改id为最后一位
    public void editRow(String bookingNo);

    //接诊，删除当前接诊的排号
    public void delRow(String bookingNo);
}
