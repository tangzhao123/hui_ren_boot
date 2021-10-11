package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.InspectDebitMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class InspectDebitService {
    @Autowired
    InspectDebitMapper inspectDebitMapper;
    //查询


}
