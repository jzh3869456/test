package com.javase.demo.overriderDemo.service.impl;

import com.javase.demo.overriderDemo.service.HorseService;

public class HorseServiceImpl extends AnimalServiceImpl implements HorseService {

    public void family(String mother){

        System.out.println("这是马妈妈: " + mother);
    }

    @Override
    public void eat() {
        System.out.println("马吃草");
    }
}
