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
}
