package com.javase.demo.collectionDemo;

import java.util.*;

public class ListSetHashMap集合遍历 {
    public static void main(String[] args) {

        /**
         * 3.List Set HashMap集合遍历
         */

        //3.1 List集合 使用迭代器遍历

        List<String> list2 = new ArrayList<String>();
        list2.add("吴承阳");
        list2.add("文森");
        list2.add("小黑");

        Iterator<String> ite = list2.iterator();// 要求容器返回一个iterator
        while (ite.hasNext()){// 检查序列中是否还有元素

            System.out.println(ite.next());// next()获得序列中的下一个元素
        }

        //3.2 Set集合遍历
        System.out.println("==============分割线================");
        Set<String> set = new TreeSet<>();
        set.add("我是三");
        set.add("我是二");
        set.add("我是一");

        // 方法1：使用迭代器遍历
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){

            System.out.println(iter.next());
        }

        // 方法2：使用foreach循环遍历
        System.out.println("==============分割线================");
        for (String str:set) {
            System.out.println(str);
        }

        //3.3 map集合遍历

        Map<String,String> map = new HashMap<String,String>();
        map.put("地名一","南充");
        map.put("地名二","成都");
        map.put("地名三","绵阳");
        map.put("地名四","资阳");
        map.put("地名五","重庆");

        // 方法一
        for (String str : map.keySet()) { // 使用keySet()获取key值

            System.out.println("key: " + str  + "\t" + "value: " + map.get(str));// 使用map.get（）通过下标获取value值
        }

        System.out.println("==============分割线================");

        // 方法二
        for (Map.Entry<String,String> entry: map.entrySet()) { // 通过map.entrySet遍历key和value

            System.out.println("key:" + entry.getKey() + "\t" + "value: " + entry.getValue());
        }

    }
}
