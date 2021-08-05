package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.EntryDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EntryDetailsMapper {

        //新增入库详单
        public void addEntryDetails(List<EntryDetails> entryDetailsData,String detailsEntry);
}
