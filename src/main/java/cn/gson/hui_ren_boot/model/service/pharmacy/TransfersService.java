package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.TransfersMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Transfers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class TransfersService {
    @Autowired
    TransfersMapper transfersMapper;
    public Object allTransfersByPage(Integer pageNo, Integer size,Transfers transfers){
        return transfersMapper.allTransfers(transfers);
    }
}
