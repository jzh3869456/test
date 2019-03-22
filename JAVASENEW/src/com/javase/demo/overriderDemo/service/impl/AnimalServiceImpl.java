package com.javase.demo.overriderDemo.service.impl;

import com.javase.demo.overriderDemo.service.AnimalService;

public class AnimalServiceImpl implements AnimalService {
    @Override
    public void eat() {

        System.out.println("动物吃东西");
    }

    @Override
    public void run() {

        System.out.println("动物跑步");

    }
}
