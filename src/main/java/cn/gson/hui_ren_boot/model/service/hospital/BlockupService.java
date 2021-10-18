package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.BlockupMapper;
import cn.gson.hui_ren_boot.model.mapper.hospital.InspectDebitMapper;
import cn.gson.hui_ren_boot.model.mapper.medical.ApplyrecordMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Blockup;
import cn.gson.hui_ren_boot.model.pojos.hospital.InspectDebit;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.medical.Combinspection;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.pojos.medical.Testmiddle;
import cn.gson.hui_ren_boot.utils.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlockupService {
    @Autowired
    BlockupMapper blockupMapper;
    @Autowired
    ApplyrecordMapper applyrecordmapper;
    @Autowired
    InspectDebitMapper inspectDebitMapper;
    public void addBlock(Blockup blockup){

        blockupMapper.addBlockup(blockup);

    }
    public void addTest(Test test){//添加提体检表
        String danhao=  MyUtil.genrateNo("TJDH");//订单编号
        test.setTestAccount(danhao);//赋值给体检单号

        List<Comboitem>bv=test.getInspector();
        double km=0;
        Register jh= blockupMapper.akkRegister(test.getTestPhone()); //查询患者表里的就诊卡号

        for (Comboitem k:bv ) {
            Testmiddle n=new Testmiddle();
            InspectDebit inspectDebit=new InspectDebit();
            n.setTestAccount(test.getTestAccount());//赋值中间表体检单号
            n.setItemId(k.getItemId());//赋值体检表项目号
            blockupMapper.addTestmiddle(n);//体检单和项目的中间表
            km+=k.getItemMoney();
            //新增体检扣费记录
            inspectDebit.setDebitMoney(k.getItemMoney());//项目金额
            inspectDebit.setDebitProject(k.getItemName());//扣费的项目名
            inspectDebit.setTestPhone(test.getTestPhone());//扣费的手机号
            inspectDebitMapper.addinsert(inspectDebit);
            applyrecordmapper.uptApp(k.getItemMoney(),jh.getRegisterClinic()); //诊疗卡余额
        }
        test.setTestMoney(km);
        blockupMapper.addTest(test);//新增体检单


        //修改诊疗卡
    }
    public List<Test> selText(Test test){//查询体检单
        return blockupMapper.selText(test);
    }
    public List<Combinspection>allResults(Combinspection combinspection){//查询检验结果
        return blockupMapper.allResults(combinspection);
    }
}
