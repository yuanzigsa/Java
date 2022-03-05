package com.yuanzi.statics;
/**
 * 静态代理
 *      目标对象 实现行为
 * **/
public class You implements RentHouse,Marry {

    @Override
    public void toRentHouse() {
        System.out.println("我要组一个两室一厅，预算2000！");
    }

    @Override
    public void toMarry() {
        System.out.println("我要结婚了");
    }
}
