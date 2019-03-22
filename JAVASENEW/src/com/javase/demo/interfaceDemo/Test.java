package com.javase.demo.interfaceDemo;
/*
    接口继承测试类
 */
import com.javase.demo.interfaceDemo.impl.CatServiceImpl;
import com.javase.demo.interfaceDemo.impl.DogServiceImpl;
import com.javase.demo.interfaceDemo.service.AnimalService;

public class Test {
    public static void main(String[] args) {

        /**
         * 猫猫吃东西 跑步测试 |  实例化猫实现类
         */
        AnimalService cat = new CatServiceImpl();
        System.out.println(cat.eat() + cat.run());

        /**
         * 狗狗吃东西 跑步测试 |  实例化狗实现类
         */
        AnimalService dog = new DogServiceImpl();
        System.out.println(dog.eat() + dog.run());

    }
}
