package com.javase.demo.interfaceDemo.impl;

import com.javase.demo.interfaceDemo.service.CatService;

/*
    猫接口实现类
 */
public class CatServiceImpl implements CatService {
    @Override
    /**
     * 重写动物接口吃东西方法
     */
    public String eat() {

        return "猫吃小鱼干";
    }

    @Override
    /**
     * 重写动物接口跑步方法
     */
    public String run() {

        return "猫跑十圈";
    }
}
