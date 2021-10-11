package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.InspectDebit;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InspectDebitMapper {
public void addinsert(InspectDebit inspectdebit ) ;
}
