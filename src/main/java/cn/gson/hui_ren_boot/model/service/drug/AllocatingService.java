package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.AllocatingMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Allocating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AllocatingService {

    @Autowired
    AllocatingMapper allocatingMapper;

    //根据调拨单号查询详单
    public List<Allocating> findAllAllocating(String transfersId){
        return allocatingMapper.findAllAllocating(transfersId);
    }
}
