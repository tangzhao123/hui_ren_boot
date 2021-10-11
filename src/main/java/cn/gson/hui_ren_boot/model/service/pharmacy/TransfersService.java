package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.AllocatingsMapper;
import cn.gson.hui_ren_boot.model.mapper.pharmacy.TransfersMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Allocating;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Transfers;
import cn.gson.hui_ren_boot.utils.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class TransfersService {
    @Autowired
    TransfersMapper transfersMapper;
    @Autowired
    AllocatingsMapper allocatingsMapper;
    public Object allTransfersByPage(Integer pageNo, Integer size,Transfers transfers){
        return transfersMapper.allTransfers(transfers);
    }

    public void addTransfers(Transfers drugTransfers){
        transfersMapper.addTransfers(drugTransfers);//新增主表
        List<Allocating>allocatings=drugTransfers.getAllocatings();//接受前台来的集合放入
        for (Allocating k:allocatings) {
            String danhao=  MyUtil.genrateNo("DBXD");//详单编号
            Allocating  hj =new Allocating();
            hj.setAllId(danhao);//详单编号
            hj.setAllSum(k.getAllSum());//数量
            hj.setAllDrug(k.getAllDrug());//药品id
            hj.setTransfersId(drugTransfers.getTransfersOrder());//调拨单号
            allocatingsMapper.AddAllocating(hj);//新增详单
        }
    }
}
