package com.atguigu;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadsDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(
                3,5,1L, TimeUnit.MICROSECONDS,
                new ArrayBlockingQueue<Runnable>(3), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        for(int i=0;i<15;i++){
            threadPoolExecutor.execute(
                    ()->{
                        System.out.println(Thread.currentThread().getName()+"办理业务");
                    });
        }
        threadPoolExecutor.shutdown();
    }
}
