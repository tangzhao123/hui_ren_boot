package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.BlockupMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Blockup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BlockupService {
    @Autowired
    BlockupMapper blockupMapper;
    public void addBlock(Blockup blockup){
        blockupMapper.addBlockup(blockup);
    }
}
