package cn.gson.hui_ren_boot.utils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class PageAspect {
    //ByPage是分页查询的业务方法的后缀，用来区分其他增删改查的方法
    @Pointcut("execution(* cn.gson.hui_ren_boot.model.service.*.*Service.*ByPage(..))")
    public void pc(){}

    @Around("pc()")
    public Object rowMap(ProceedingJoinPoint jp) throws Throwable{
        //获取连接点参数，我要知道当前页码和页大小
        Object[] args = jp.getArgs();
        //获取连接点的方法签名对象
        Signature signature = jp.getSignature();
        //获取目标对象
        Object target = jp.getTarget();
        //设置当前页码和页大小
        Integer pageNo = Integer.parseInt(args[0].toString());
        Integer pageSize = Integer.parseInt(args[1].toString());
        //开始执行分页
        Page<Object> pageObj = PageHelper.startPage(pageNo, pageSize);
        //执行业务方法，分页查询，返回Object
        System.out.println(signature.getName()+"，开始执行");
        Object object = jp.proceed();
        System.out.println(signature.getName()+"，执行结束");
        if(object instanceof List){
            //把上面业务方法的返回值，转到切面方法进行return
            List list = (List) object;
            MyPage pageInfo = new MyPage(pageObj.getTotal(),list);
            return pageInfo;//返回封装的page对象
        }
        return object;//如果不是集合，不管
    }
}
