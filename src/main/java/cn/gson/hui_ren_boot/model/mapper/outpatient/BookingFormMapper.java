package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.BookingForm;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 挂号
 */
@Mapper
public interface BookingFormMapper {
    //查询挂号时的科室
    public List<Medical> allMedicals();

    //根据挂号科室查询挂号医生
    public List<Staff> outStaff(@Param("medicalId") int medicalId,@Param("bookingOrder")String bookingOrder);

    //新增挂号单
    public void addBooking(BookingForm bookingForm);

    //查询当天未退号挂号单
    public List<BookingForm> allBooking();

    //查询当天退号挂号单
    public List<BookingForm> backBooking();

    //退号，查询当天未诊的挂号单
    public List<BookingForm> selBooking(String bookingNo);

    //修改挂号单为退号状态
    public void editState(String bookingNo);
}
