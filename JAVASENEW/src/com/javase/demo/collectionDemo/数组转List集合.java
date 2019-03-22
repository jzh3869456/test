package com.javase.demo.collectionDemo;

import java.util.*;

public class 数组转List集合 {
    public static void main(String[] args) {

        /**
         * 1.数组转List集合
         */

        // 方法1: 使用循环添加数组元素到List集合
        List<String> mlist = new ArrayList<String>();// 创建集合
        String[] array = new String[] {"小王","老王","八戒","猴哥","佛祖"};// 创建数组 并且添加元素


        for (int i = 0; i < array.length; i++){

            mlist.add(array[i]);// 循环添加所有数组元素至集合
        }

        for (String str : mlist) {// 使用foreach遍历集合

            System.out.println(str);

        }

        System.out.println("==============分割线================");

        // 方法2：使用ArrayList集合自带的[ asList()方法 ]进行转换
        String[] array1 = new String[]{"齐天大圣","斗战胜佛","弼马温"};// 创建数组分配空间
        List<String> mlist1 = Arrays.asList(array1);// 使用asList方法来转换数组 创建集合对象来接收

        for (int i = 0;i<mlist1.size();i++){

            System.out.println(mlist1.get(i));
        }

    }
}
