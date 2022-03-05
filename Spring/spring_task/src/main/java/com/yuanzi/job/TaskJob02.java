package com.yuanzi.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class TaskJob02 {
    @Scheduled(cron = "0/2 * * * * ?")
    public void job1(){ System.out.println("任务一："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); }
    @Scheduled(cron = "0/5 * * * * ?")
    public void job2(){ System.out.println("任务二："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));    }
}
