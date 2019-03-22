package com.javase.demo.collectionDemo;

import java.util.*;

public class ListSetMap集合长度 {
    public static void main(String[] args) {

        /**
         *4.List set Map集合长度
         */

        // list集合长度
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("1");
        list.add("1");

        System.out.println("list集合的长度是：" + list.size());

        // set集合长度
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");

        System.out.println("set集合的长度是：" + set.size());

        // Map集合长度
        Map<String,String> map = new HashMap<>();
        map.put("dd","aa");
        map.put("ds","ag");
        map.put("dc","ar");
        map.put("dg","ay");

        System.out.println("map集合的长度是：" + map.size());
    }
}
