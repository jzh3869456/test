package com.javase.demo.collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class List集合转数组 {
    public static void main(String[] args) {

        /**
         * 2.List集合转数组
         */

        // 方法1：使用循环转换集合至数组
        List<String> list = new ArrayList<String>();// 创建集合
        list.add("小二");// 添加元素
        list.add("小三");
        list.add("小四");

        String[] array2 = new String[list.size()] ;// 创建数组 大小为集合的长度

        for (int i = 0; i < list.size(); i++){

            array2[i] = list.get(i); // 循环添加集合元素至数组
        }

        for (int i = 0; i < array2.length; i++) {

            System.out.println(array2[i]);

        }

        System.out.println("==============分割线================");

        // 方法2：使用toArray()方法转换集合为数组

        List<String> list1 = new ArrayList<String>();// 创建集合
        list1.add("集合元素1");// 添加元素
        list1.add("集合元素2");
        list1.add("集合元素3");

        //String[] array3 = list1.toArray(new String[0]);  // 另一种方法

        String[] array3 = new String[list1.size()]; // 创建数组
        list1.toArray(array3);// 使用toArray()方法转换集合

        for (String str:array3) {

            System.out.println(str);
        }

    }
}
