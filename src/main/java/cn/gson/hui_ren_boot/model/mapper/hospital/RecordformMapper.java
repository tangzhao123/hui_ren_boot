package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecordformMapper {
//public void addRecorForm(RecordForm recordForm);//新增
 public List<Sickbed> allWard(long medicalId);//查询科室下的病床
 public void addRecorForm(RecordForm recorForm);//新增转科记录表
 public void addRecorForm2(Record record);//新增现病房记录
 public void upRecorForm(Register register);//修改患者信息表
 public void upRecorForm2(String ward);//修改原病房病床数
 public void upRecorForm3(String ward);//修改现病房病床数
 public void upRecorForm4(String record);//修改病床使用记录

 public void upRecorForm5(String sickbed);//修改原病床状态
 public void upRecorForm6(String sickbed);//修改现病床状态
 public Sickbed allWards(String sickbedMark);//查询 病房号
 public void updaChagen(String register);//修改申请表状态
 public List<RecordForm> allRecordForm(RecordForm recordForm);//查询转科记录表
}
