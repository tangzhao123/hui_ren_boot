package cn.gson.hui_ren_boot.model.service.nursestation;

import cn.gson.hui_ren_boot.model.mapper.nursestation.PlanMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.hospital.Sickbed;
import cn.gson.hui_ren_boot.utils.MyUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlanService {
    @Autowired
    PlanMapper mapper;

//    查询病床使用记录
    public void chaRecords(String registerId,String bed,String sickbedMark1){
        ObjectMapper mapper2 = new ObjectMapper();
        List<Record> list = mapper.chaRecords(registerId);
        for (Record r : list) {
            Record records = mapper2.convertValue(r,Record.class);
                if (records.getRecordSerial() != null){
                    mapper.xinRecordupdate(bed,records.getRegisterId());//修改病床的使用记录
                    mapper.xinupdateRegister(bed, records.getRegisterId());//修改病人的病床位
                    mapper.xinupdateOne(sickbedMark1);//修改病床使用记录，改为未使用
                    mapper.xinupdateTwo(bed);//修改病床状态,1已使用
                }
            }
    }

    //新增病床使用记录
    public void xinRecord(Record record){
        Record record1 = record;
        if (record1.getRecordSerial() == null){
            String s = MyUtil.genrateNo("BCJL");
            record.setRecordSerial(s);
            mapper.xinupdateRegister(record1.getSickbedMark(), record1.getRegisterId());//修改病人的病床
            mapper.xinupdateTwo(record1.getSickbedMark());//修改病床状态,1已使用
            mapper.xinRecord(record1);//新增使用记录
        }

    }

    //    根据病人所在的科室查询病床
    public List<Sickbed> chabedss(Long medicalId){
        return mapper.chabedss(medicalId);
    }

    public Object chabingByPage(Integer pageNo, Integer size,Register register){
        return mapper.chabing(register);
    }
}
