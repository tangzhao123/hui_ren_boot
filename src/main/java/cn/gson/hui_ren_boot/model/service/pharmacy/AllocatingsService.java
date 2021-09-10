package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.AllocatingsMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Allocating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AllocatingsService {
    @Autowired
    AllocatingsMapper allocatingsMapper;


    public void AddAllocating(Allocating allocating){
        allocatingsMapper.AddAllocating(allocating);
    }
}
