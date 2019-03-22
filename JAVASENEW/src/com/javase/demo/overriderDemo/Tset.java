package com.javase.demo.overriderDemo;

import com.javase.demo.overriderDemo.service.impl.HorseServiceImpl;
import com.javase.demo.overriderDemo.service.impl.TigerServiceImpl;

public class Tset {
    public static void main(String[] args) {

        TigerServiceImpl tigerService = new TigerServiceImpl();
        tigerService.eat();
        tigerService.run();
        tigerService.family("大老虎","小老虎");

        HorseServiceImpl horseService = new HorseServiceImpl();
        horseService.eat();
        horseService.run();


        // 1. 分别重写马和老虎吃的方法，打印出马吃草，老虎吃肉

        // 2. 重载老虎的family方法 返回爸爸和儿子的名字


    }
}
