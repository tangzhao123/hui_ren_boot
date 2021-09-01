package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.DeductMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Deduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeductService {

    @Autowired
    DeductMapper deductMapper;

    //新增库存记录扣除
    public void addDeduct(Deduct deduct){
        deductMapper.addDeduct(deduct);
    }

    //根据出库单号查询库存扣除记录
    public List<Deduct> findAllDeduct(String goNum){
        return deductMapper.findAllDeduct(goNum);
    }
}
