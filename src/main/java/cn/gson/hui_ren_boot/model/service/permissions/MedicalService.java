package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.dao.permissions.MedicalDao;
import cn.gson.hui_ren_boot.model.mapper.permissions.MedicalMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicalService {

    @Autowired
    MedicalMapper medicalMapper;
    @Autowired
    MedicalDao medicalDao;

    //查询所有的科室
    public List<Medical> allMedical(){
        return  medicalMapper.allMedical();
    }

    //根据名称查询编号
    public int byMedicalId(String medicalName){
        return medicalMapper.byMedicalId(medicalName);
    }

    //分页查询所有科室加模糊查询科室
    public Object byNameByPage(Integer  pageNo,Integer size,String medicalName){
        return medicalMapper.byName(medicalName);
    }

    //新增或修改科室
    public void addMedical(Medical medical){
        medicalDao.save(medical);
    }
}
