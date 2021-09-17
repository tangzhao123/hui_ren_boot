package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.hospital.Operation;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgeryfor;
import cn.gson.hui_ren_boot.model.pojos.medical.Applyrecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SurgeryforMapper {
//    查询状态为0的手术项目，为没有安排手术室的
    public List<Surgeryfor> selectFor();

//    查询手术室，0为未使用的，根据科室名称
    public List<Operation> selectOperation(String medicalName);

//    新增手术室使用记录
    public void addApply(Applyrecord applyrecord);

//    修改手术室的状态，（安排了手术后，手术室的状态改为1，已安排）
    public void updateOperation(String operationId);

//    修改病人手术状态为1，已安排手术室，根据住院号进行修改
    public void updateFor(String registerId);

//    查询已经安排了手术室的手术项目,手术室为0的为没有被执行的
    public List<Applyrecord> selectRecord();
}
