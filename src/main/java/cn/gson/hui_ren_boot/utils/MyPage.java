package cn.gson.hui_ren_boot.utils;

import java.io.Serializable;
import java.util.List;

public class MyPage<T> implements Serializable {
    //总记录数
    private long total;
    //结果集
    private List<T> list;

    public MyPage() {
    }

    public MyPage(long total, List<T> list) {
        this.total = total;
        this.list = list;
    }

    public MyPage(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
