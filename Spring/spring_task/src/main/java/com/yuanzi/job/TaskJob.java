package com.yuanzi.job;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component //将该对象交给IOC容器进行实例化
public class TaskJob {
    public void job1(){
        System.out.println("任务1："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
    public void job2(){
        System.out.println("任务2："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
