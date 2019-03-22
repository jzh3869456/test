package com.javase.demo.collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class 删除list集合中的指定元素 {
    public static void main(String[] args) {



        /**
         *7.删除list集合中的指定元素
         */

        List<String> list = new ArrayList<>();
        list.add("张飞");
        list.add("关羽");
        list.add("刘备");
        list.add("卢布");
        list.add("赵子龙");

        System.out.println("删除前： " + list);

        list.remove(0); // 通过下标删除指定位置元素
        list.remove("关羽");// 通过对象删除元素


        System.out.println("删除后： " + list);
    }
}
