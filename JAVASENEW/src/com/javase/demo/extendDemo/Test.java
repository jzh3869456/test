package com.javase.demo.extendDemo;

/*
    测试类
 */
public class Test {
    public static void main(String[] args) {

        Goods god = new Phone();

        System.out.println("手机的编号是 " + god.getNumber() + "手机的颜色是：" + ((Phone) god).getColour());
    }
}
