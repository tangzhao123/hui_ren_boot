package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.SurgeryforMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Operation;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgeryfor;
import cn.gson.hui_ren_boot.model.pojos.medical.Applyrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SurgeryforService {
    @Autowired
    SurgeryforMapper surygeryforMapper;


    //修改手术室的位置和所属科室
    public void xiugaiOperation(String address,String name,String id){
        surygeryforMapper.xiugaiOperation(address,name,id);
    }

    //查询手术室
    public Object selOperationByPage(int pageNo,int size,Operation oper){
        return surygeryforMapper.selOperation(oper);
    }

    //新增手术室
    public void insertOpeart(Operation operation){
        surygeryforMapper.insertOpeart(operation);
    }

    //    查询状态为0的手术项目，为没有安排手术室的
    public Object selectForByPage(int pageNo,int size,Surgeryfor surgeryfor){
        return surygeryforMapper.selectFor(surgeryfor);
    }

    //    查询手术室，0为未使用的，根据科室名称
    public List<Operation> selectOperation(String medicalName){
        return surygeryforMapper.selectOperation(medicalName);
    }

    //    修改手术室的状态，（安排了手术后，手术室的状态改为1，已安排）
    public void updateOperation(String operationId){
        surygeryforMapper.updateOperation(operationId);
    }

    //    修改病人手术状态为1，已安排手术室，根据住院号进行修改
    public void updateFor(String registerId){
        surygeryforMapper.updateFor(registerId);
    }

    //    查询已经安排了手术室的手术项目,手术室为0的为没有被执行的
    public List<Applyrecord> selectRecord(){
        return surygeryforMapper.selectRecord();
    }
}
