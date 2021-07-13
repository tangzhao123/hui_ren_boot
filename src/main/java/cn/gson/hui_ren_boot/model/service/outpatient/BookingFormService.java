package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.BookingFormMapper;
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

    //查询挂号时的科室
    public List<Medical> allMedicals(){
        return bookingFormMapper.allMedicals();
    }

    //根据挂号科室查询挂号医生
    public List<Staff> outStaff(int medicalId,String bookingOrder){
        return bookingFormMapper.outStaff(medicalId,bookingOrder);
    }
}
