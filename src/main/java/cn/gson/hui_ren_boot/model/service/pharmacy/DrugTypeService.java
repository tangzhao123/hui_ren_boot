package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.DrugtypeMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrugTypeService {
    @Autowired
    DrugtypeMapper drugtypeMapper;
    public List<DrugType> allType(){
        return drugtypeMapper.allType();
    }
}
