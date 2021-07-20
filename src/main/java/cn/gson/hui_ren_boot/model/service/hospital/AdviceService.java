package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.AdviceMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdviceService {
    @Autowired
    AdviceMapper adviceMapper;
    public List<Advice> allDispensing(){
        return adviceMapper.allDispensing();
    }
}
