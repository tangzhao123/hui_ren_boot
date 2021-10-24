package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgery;
import cn.gson.hui_ren_boot.model.pojos.medical.Applyrecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ApplyrecordMapper {
//    修改金额
    public void insertApp(Applyrecord applyrecord);//新增扣费记录
    public void uptApp( @Param("treatmentBalance")double treatmentBalance,@Param("treatmentNo") String treatmentNo);//修改
    public List<Surgery> allSurgery(Register register);//查询手术结果

}
