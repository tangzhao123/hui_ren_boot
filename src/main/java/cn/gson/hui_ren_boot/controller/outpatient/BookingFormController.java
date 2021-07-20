package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.BookingForm;
import cn.gson.hui_ren_boot.model.pojos.outpatient.Withdrawal;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.service.outpatient.BookingFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 挂号
 */
@RestController
@RequestMapping("/outpatient")
public class BookingFormController {
    @Autowired
    BookingFormService bookingFormService;

    //查询挂号时的科室
    @RequestMapping("/booking-medical")
    public List<Medical> allMedicals(){
        return bookingFormService.allMedicals();
    }

    //根据挂号科室和预约就诊查询挂号医生
    @RequestMapping("/out-staff")
    public List<Staff> outStaff(@RequestBody Map<String,Object> datas){
        int medicalId = (int)datas.get("medicalId");
        String bookingDate = (String) datas.get("bookingDate");
        System.out.println(bookingDate.split("T")[0]);
        return bookingFormService.outStaff(medicalId, bookingDate.split("T")[0]);
    }

    //新增挂号单，同时新增患者信息
    @RequestMapping("/add-outbooking")
    public void addOutBooking(@RequestBody BookingForm bookingForm){
        System.out.println(bookingForm);
        bookingFormService.addOutBooking(bookingForm.getOutpatient(),bookingForm);
    }

    //分页查询挂号单
    @RequestMapping("/all-booking")
    public Object allBooking(Integer pageNo,Integer size){
        return bookingFormService.allBookingByPage(pageNo, size);
    }

    //分页查询未诊挂号单
    @RequestMapping("/sel-booking")
    public Object selBooking(Integer pageNo,Integer size,String bookingNo){
        return bookingFormService.selBookingByPage(pageNo, size,bookingNo);
    }

    //退号，修改挂号单的状态，同时新增一条退号单
    @RequestMapping("/add-drawal")
    public void addDrawal(@RequestBody Withdrawal withdrawal){
        bookingFormService.addDrawal(withdrawal);
    }
}