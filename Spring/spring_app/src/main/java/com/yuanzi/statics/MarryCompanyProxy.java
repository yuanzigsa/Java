package com.yuanzi.statics;

public class MarryCompanyProxy implements Marry {


    private Marry target;

    public MarryCompanyProxy(Marry target) {
        this.target = target;
    }

    @Override
    public void toMarry() {
        System.out.println("结婚前.....");
        target.toMarry();
        System.out.println("结婚后.....");
    }
}
