package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.SendDrugsMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.SendDrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SendDrugsService {
    @Autowired
    SendDrugsMapper sendDrugsMapper;
    public Object sendByPage(Integer pageNo, Integer size, String sendNum,String drugName){
        return sendDrugsMapper.send(sendNum, drugName);
    }
}
