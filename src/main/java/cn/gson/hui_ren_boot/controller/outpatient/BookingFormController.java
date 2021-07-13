package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.service.outpatient.BookingFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping("/out-staff")
    public List<Staff> outStaff(@RequestBody int medicalId, String bookingOrder){
        return bookingFormService.outStaff(medicalId,bookingOrder);
    }
}
