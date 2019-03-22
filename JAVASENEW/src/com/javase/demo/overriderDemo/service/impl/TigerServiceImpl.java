package com.javase.demo.overriderDemo.service.impl;

import com.javase.demo.overriderDemo.service.TigerService;

public class TigerServiceImpl extends AnimalServiceImpl implements TigerService {

    public void family(String mother){

        System.out.println("这是老虎妈妈: " + mother);
    }


     public void family(String father,String son){

        System.out.println("这是老虎爸爸: " + father + "\t" + "这是老虎的儿子：" + son);
    }


    @Override
    public void eat() {
        System.out.println("老虎吃肉");
    }
}
