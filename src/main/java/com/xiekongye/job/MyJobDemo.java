package com.xiekongye.job;

import java.util.Date;

/**
 * Created by You on 2017/5/23.
 */
public class MyJobDemo {

    public void printDate(){
        System.out.println(String.format("Task trigger : %s",new Date(System.currentTimeMillis())));
    }
}
