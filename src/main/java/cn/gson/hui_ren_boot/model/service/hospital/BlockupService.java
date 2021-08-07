package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.BlockupMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Blockup;
import cn.gson.hui_ren_boot.model.pojos.medical.Combinspection;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlockupService {
    @Autowired
    BlockupMapper blockupMapper;
    public void addBlock(Blockup blockup){
        blockupMapper.addBlockup(blockup);
    }
    public void addTest(Test test){//添加提体检表
        blockupMapper.addTest(test);
    }
    public List<Test> selText(Test test){//查询体检单
        return blockupMapper.selText(test);
    }
    public List<Combinspection>allResults(Combinspection combinspection){//查询检验结果
        return blockupMapper.allResults(combinspection);
    }
}
