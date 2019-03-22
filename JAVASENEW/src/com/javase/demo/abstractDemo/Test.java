package com.javase.demo.abstractDemo;
/*
    动物叫测试类
 */

public class Test {
    public static void main(String[] args) {

        /*
            测试猫叫
         */
        Animal cat = new Cat();
        System.out.println(cat.called());

        /*
            测试狗叫
         */
        Animal dog = new Dog();
        System.out.println(dog.called());

    }
}
