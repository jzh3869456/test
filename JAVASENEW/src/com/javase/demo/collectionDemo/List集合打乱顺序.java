package com.javase.demo.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List集合打乱顺序 {
    public static void main(String[] args) {

        /**
         *5.List集合打乱顺序
         */

        List<String> list1 = new ArrayList<String>();// 创建集合
        list1.add("集合元素1");// 添加元素
        list1.add("集合元素2");
        list1.add("集合元素3");
        list1.add("集合元素4");
        list1.add("集合元素5");

        System.out.println("打乱顺序前：" + list1);

        Collections.shuffle(list1); // 打乱顺序

        System.out.println("打乱顺序后：" + list1);


    }
}
