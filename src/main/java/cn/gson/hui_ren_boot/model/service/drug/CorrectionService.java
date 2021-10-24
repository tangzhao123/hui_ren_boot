package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.CorrectionMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Correction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CorrectionService {

    @Autowired
    CorrectionMapper correctionMapper;

    //查询所有的库存修正记录
    public List<Correction> findAllCorrection(String start,String end,String search){
        return correctionMapper.findAllCorrection(start, end, search);
    }
}
