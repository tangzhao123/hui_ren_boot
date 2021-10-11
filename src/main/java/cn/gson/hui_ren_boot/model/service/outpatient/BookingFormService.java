package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.*;
import cn.gson.hui_ren_boot.model.pojos.outpatient.BookingForm;
import cn.gson.hui_ren_boot.model.pojos.outpatient.OutpatientRegister;
import cn.gson.hui_ren_boot.model.pojos.outpatient.RegisterType;
import cn.gson.hui_ren_boot.model.pojos.outpatient.Withdrawal;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 挂号
 */
@Service
@Transactional
public class BookingFormService {
    @Autowired
    BookingFormMapper bookingFormMapper;

    @Autowired
    OutRegisterMapper outRegisterMapper;

    @Autowired
    WithdrawalMapper withdrawalMapper;

    @Autowired
    RowNumbersMapper rowNumbersMapper;

    @Autowired
    RegisterTypeMapper registerTypeMapper;

    //查询挂号类型
    public List<RegisterType> selType(){
        return registerTypeMapper.selType();
    }

    //查询挂号费，根据挂号类型
    public double selMoney(Long typeNumber){
        return registerTypeMapper.selMoney(typeNumber);
    }

    //查询挂号时的科室
    public List<Medical> allMedicals(){
        return bookingFormMapper.allMedicals();
    }

    //根据挂号科室查询挂号医生
    public List<Staff> outStaff(int medicalId,String bookingOrder){
        return bookingFormMapper.outStaff(medicalId,bookingOrder);
    }

    //新增挂号单，同时新增患者表,同时新增排号表
    public void addOutBooking(OutpatientRegister outPatient, BookingForm bookingForm){
        OutpatientRegister register = outRegisterMapper.selRegister(outPatient.getOutpatientCard());
        if(register == null){
            outRegisterMapper.addOutregister(outPatient);
            bookingForm.setOutpatientId(outPatient.getOutpatientId());
            bookingFormMapper.addBooking(bookingForm);
        }else{
            bookingForm.setOutpatientId(register.getOutpatientId());
            bookingFormMapper.addBooking(bookingForm);
        }
        rowNumbersMapper.addNumber(bookingForm.getBookingNo());
    }

    //分页查询当天未退号挂号单
    public Object allBookingByPage(Integer pageNo,Integer size){
        return bookingFormMapper.allBooking();
    }

    //分页查询当天退号挂号单
    public Object selBackByPage(Integer pageNo,Integer size){
        return withdrawalMapper.selBack();
    }

    //退号，分页查询当天未诊的挂号单
    public Object selBooking(String bookingNo,String outpatientName,String outpatientCard){
        return bookingFormMapper.selBooking(bookingNo,outpatientName,outpatientCard);
    }

    //退号，修改挂号单的状态，同时新增一条退号单
    public void addDrawal(Withdrawal withdrawal){
        bookingFormMapper.editState(withdrawal.getBookingNo());
        withdrawalMapper.addDrawal(withdrawal);
    }
}
