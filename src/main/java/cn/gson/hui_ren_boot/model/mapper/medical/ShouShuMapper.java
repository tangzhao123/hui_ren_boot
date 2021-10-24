package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.hospital.Surgery;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface ShouShuMapper {

    //执行手术
    public void xiushoushu(@Param("surgeryFinish") Timestamp surgeryFinish, @Param("surgeryResult") String surgeryResult, @Param("registerId") String registerId);

    //安排了手术室的
    public List<Surgery> selshoushu(Surgery surgery);

    //新增手术结果
    public void addshoushu(Surgery surgery);

    public List<Staff> zhudao();

    public List<Staff> mazui();
}
