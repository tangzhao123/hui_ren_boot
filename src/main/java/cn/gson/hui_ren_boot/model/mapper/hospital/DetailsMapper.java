package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetailsMapper {
    public List<Details> allDetails(Details jk);
}
