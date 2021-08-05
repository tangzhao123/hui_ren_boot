package cn.gson.hui_ren_boot.model.service.drug;


import cn.gson.hui_ren_boot.model.mapper.drug.Transfers1Mapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Transfers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Transfers1Service {

    @Autowired
    Transfers1Mapper transfers1Mapper;

    //查询所有的调拨申请
    public Object findAllTransfersByPage(Integer pageNo,Integer size){
        return transfers1Mapper.findAllTransfers();
    }
}
