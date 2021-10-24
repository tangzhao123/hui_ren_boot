package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.ShouShuMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgery;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.List;

@Service
public class ShouSHuService {
    @Autowired
    ShouShuMapper mapper;

    //执行手术
    public void xiushoushu(Timestamp surgeryFinish, String surgeryResult, String registerId){
        mapper.xiushoushu(surgeryFinish,surgeryResult,registerId);
    }

    //安排了手术室的
    public Object selshoushuByPage(int pageNo,int size,Surgery surgery){
        return mapper.selshoushu(surgery);
    }

    //新增手术结果
    public void addshoushu(Surgery surgery){
        mapper.addshoushu(surgery);
    }

    public List<Staff> zhudao(){
        return mapper.zhudao();
    }

    public List<Staff> mazui(){
        return mapper.mazui();
    }
}
