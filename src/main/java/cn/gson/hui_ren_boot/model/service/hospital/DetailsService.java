package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.DetailsMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DetailsService {
    @Autowired
    DetailsMapper detailsMapper;
    public List<Details> allDetails(Details jk){
        return detailsMapper.allDetails(jk);
    }
}
