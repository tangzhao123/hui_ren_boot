package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.SendDrug;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SendDrugsMapper {
    public List<SendDrug> send(SendDrug sendDrug);
}