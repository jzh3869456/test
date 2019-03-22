package com.javase.demo.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class List集合反转 {
    public static void main(String[] args) {


        /**
         *6.List集合反转
         */

        List<String> list = new ArrayList<>();
        list.add("张飞");
        list.add("关羽");
        list.add("刘备");
        list.add("卢布");
        list.add("赵子龙");

        System.out.println("反转集合前：" + list);

        Collections.reverse(list);// 反转集合

        System.out.println("反转集合后：" + list);

    }
}
