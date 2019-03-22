package com.javase.demo.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 遍历ArrayList方法 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("dadfa");

        //第一种方法使用 foreach遍历List

        for (String str : list){

            System.out.println(str);
        }
        // 也可以写成以下形式
        System.out.println("-----------------------------");
        for (int i = 0; i < list.size(); i++){

            System.out.println(list.get(i));
        }
        System.out.println("-----------------------------");

        // 第二种遍历，把链表变为数组相关的内容进行遍历

        String[] strArray=new String[list.size()];
        list.toArray(strArray); // toArray()方法是返回此列表的所有元素的数组 也就是说把参数重新分配成数组
        for (int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }
        System.out.println("-----------------------------");
        // 也可以写成foreach形式
        for (String str: list) {
            System.out.println(str);
        }

        // 第三种遍历方式 使用迭代器进行相关遍历

        System.out.println("-----------------------------");
        Iterator<String> ite=list.iterator();// 使用iterator()方法要求容器返回一个iterator，
        while (ite.hasNext()){// hasNext()检查序列中是否还有元素
            System.out.println(ite.next());// next()获得序列中的下一个元素
        }
        // 第三种方法可以不用担心在遍历的过程中会超出集合的长度



    }
}










































