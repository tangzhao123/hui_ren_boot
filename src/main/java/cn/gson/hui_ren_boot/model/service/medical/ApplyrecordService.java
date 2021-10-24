package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.ApplyrecordMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgery;
import cn.gson.hui_ren_boot.model.pojos.medical.Applyrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ApplyrecordService {
    @Autowired
    ApplyrecordMapper applyrecordMapper;
    public void insertApp(Applyrecord applyrecord){

    }
    public List<Surgery> allSurgery(Register register){//查询结果表
        return applyrecordMapper.allSurgery(register);
    }
}
