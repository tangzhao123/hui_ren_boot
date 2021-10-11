package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.GoBank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoBanksMapper {

    public List<GoBank> goBank(GoBank goBank);

}
