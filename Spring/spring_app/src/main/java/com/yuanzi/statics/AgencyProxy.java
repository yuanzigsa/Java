package com.yuanzi.statics;
/**
 * 静态代理
 *  代理对象
 *      1.实现行为
 *      2，增强目标对象的行为
 * **/
public class AgencyProxy implements RentHouse{
    //目标对象
    private RentHouse target;

    //通过构造器的形参传递目标对象
    public AgencyProxy(RentHouse target){
        this.target = target;
    }

    @Override
    public void toRentHouse() {
        //增强行为
        System.out.println("发布租房信息...寻找房源....");
        //调用目标对象中的方法
        target.toRentHouse();
        //增强行为
        System.out.println("准备合同...");
    }
}
