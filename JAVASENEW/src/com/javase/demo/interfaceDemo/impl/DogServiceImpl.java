package com.javase.demo.interfaceDemo.impl;

import com.javase.demo.interfaceDemo.service.DogService;

/*
    狗接口实现类
 */
public class DogServiceImpl implements DogService {
    @Override
    /**
     * 重写动物接口吃东西方法
     */
    public String eat() {

        return "狗吃骨头";
    }

    @Override
    /**
     * 重写动物接口跑步方法
     */
    public String run() {

        return "狗跑圈圈";
    }
}
