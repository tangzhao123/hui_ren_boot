package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.BreakdownMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Breakdown;
import cn.gson.hui_ren_boot.model.pojos.hospital.Hospitalcare;
import cn.gson.hui_ren_boot.model.pojos.hospital.InspectDebit;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.medical.Applyrecord;
import cn.gson.hui_ren_boot.model.pojos.medical.Combinspection;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Prndebit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BreakdownService {
    @Autowired
    BreakdownMapper breakdownMapper;
    public List<Breakdown> selectBreak(Register breakdown){

            List<Register>po=breakdownMapper.selectBreak(breakdown);

            Hospitalcare ko=new Hospitalcare();

            List<Hospitalcare>ho=new ArrayList<>();//床位扣费记录表
            List<Prndebit>pow=new ArrayList<>();// 医嘱扣费记录表
            List<InspectDebit>co=new ArrayList<>();//检验扣费

            List<Applyrecord>ao=new ArrayList<>();//手术扣费



            String zhuyuanh = null;//接收患者
            String huanzming = null;//接收患者名
            for (Register l:po) {
                ho= l.getHospitalcare();
                pow=l.getPrndebit();
                co= l.getInspectDebit();
                ao= l.getApplyrecord();

                zhuyuanh=l.getRegisterId();
                huanzming=l.getRegisterName();
            }
            // ------------------------------------------护理费床位费
            List<Breakdown> ks=new ArrayList<>();
            double huili=0.00;//护理费累加
            double huiliw=0.00;//接收护理费
            double cw=0.00;//累加
            double cws=0.00;//接收床位费


            for (Hospitalcare kn: ho) {
                huiliw = kn.getSickbedNursing().doubleValue();
                huili+= huiliw;

                cws=kn.getSickbedCost().doubleValue();
                cw+=cws;


            }
            //---------------------------------------------医嘱费
            double yiZhu=0.00;//医嘱
            double yiZhus=0.00;//医嘱接收并且转换
            for (Prndebit pt : pow) {
                yiZhus=pt.getPrndebitSum();
                yiZhu+=yiZhus;


            }
            //---------------------------------------------检验费

            double jianYan=0.00;//检验费
            double jianYanw=0.00;//接收检验费

            for (InspectDebit cox : co) {
                jianYanw=cox.getDebitMoney().doubleValue();
                jianYan+=jianYanw;
                System.out.println("检验费");
                System.out.println(jianYan);

            }
            //---------------------------------------------手术费
            double shouShu=0.00;//手术费
            double shouShuw=0.00;//手术费接收
            for (Applyrecord appl : ao) {
                shouShuw=appl.getAdditionalMoney().doubleValue();
                shouShu+=shouShuw;

            }

            ks.add(new Breakdown (huanzming,zhuyuanh,"护理费",huili));//护理费
            ks.add(new Breakdown (huanzming,zhuyuanh,"床位费",cw));//床位费
            ks.add(new Breakdown (huanzming,zhuyuanh,"医嘱费",yiZhu));//医嘱费
            ks.add(new Breakdown (huanzming,zhuyuanh,"检验费",jianYan));//检验费
            ks.add(new Breakdown (huanzming,zhuyuanh,"手术费",shouShu));//检验费

            return ks;


    }
    ///患者信息
    public List<Register> allPar(Register register){

        return  breakdownMapper.allPar(register);
    }
    //护理床位记录查询
    public List<Hospitalcare>allHospitalcare(Register register){
        Register kk=   breakdownMapper.akkRegister(register);
        return breakdownMapper.allHospitalcare(kk.getRegisterId());
    }
    //查询医嘱扣费记录表
    public List<Prndebit>allPrndebit(Register register){
        Register kk=   breakdownMapper.akkRegister(register);
        return  breakdownMapper.allPrndebit(kk.getRegisterId());
    }
    //检验扣费查询
    public  List<InspectDebit>allInsectDebit(Register register){
        Register kk=   breakdownMapper.akkRegister(register);

        return  breakdownMapper.allInspectDebit(kk.getRegisterPhone());
    }
    //手术扣费记录表查询
    public List<Applyrecord>allApplyrecord(Register register){
        Register kk=  breakdownMapper.akkRegister(register);
        return breakdownMapper.allApplyrecord(kk.getRegisterId());
    }



}
