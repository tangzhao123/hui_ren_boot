package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.RecordformMapper;
import cn.gson.hui_ren_boot.model.mapper.hospital.RegisterMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.*;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.utils.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Transactional
@Service
public class RecorFormService {
    @Autowired
    RecordformMapper recordformMapper;
    @Autowired
    RegisterMapper registerMapper;
//    public void addRecorForm(RecordForm recordForm){
//
//
//    }
    //查询科室下的病床
    public List<Sickbed> allWard( Medical medical){
      Medical jk=  registerMapper.allMedicals(medical.getMedicalName());
        return recordformMapper.allWard(jk.getMedicalId());
    }
    public void addRecorForm(@RequestBody RecordForm recordForm){


//查在病床病房
        Sickbed wardy= recordformMapper.allWards(recordForm.getSickbedStartmark());//查原病房
        System.out.println(wardy.toString());
        Sickbed wardx= recordformMapper.allWards(recordForm.getSickbedMark());//查现病房
  //新增现病房记录
        String danhao=  MyUtil.genrateNo("BTJL");//订单编号
        Record k=new Record();
        k.setRecordSerial(danhao);//病床记录
        k.setSickbedMark(recordForm.getSickbedMark());//新床位号
         k.setRegisterId(recordForm.getRegisterId());//住院号
        recordformMapper.addRecorForm2(k);
// 新增转科床位记录
        recordformMapper.addRecorForm(recordForm);
//修改以前的床位记录
        recordformMapper.upRecorForm4(recordForm.getSickbedStartmark());
//还以前的床位


        recordformMapper.upRecorForm2(wardy.getWardMark());
//修改现在病房床位数
        recordformMapper.upRecorForm3(wardx.getWardMark());
//修改病人信息表的床位号
        Register mk=new Register();
        mk.setRegisterId(recordForm.getRegisterId());
        mk.setSickbedMark(recordForm.getSickbedMark());
        recordformMapper.upRecorForm(mk);
//修改原病床状态
        recordformMapper.upRecorForm5(recordForm.getSickbedStartmark());
//修改现在病床状态
        recordformMapper.upRecorForm6(recordForm.getSickbedMark());
        //修改申请表状态
        recordformMapper.  updaChagen(recordForm.getRegisterId());//修改申请表状态

    }
    public Object allRecordFormByPage(Integer pageNo, Integer size,RecordForm recordForm){

        return recordformMapper.allRecordForm(recordForm);
    }
}
