package com.javase.demo.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class 并发修改异常 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("dd");
        list.add("ss");
        list.add("gg");
        list.add("jj");
        list.add("world");

        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){

            String str =(String) iterator.next();
            list.add("javaee");  // 会出现并发修改异常 list不能在Iterator遍历的时候添加元素 ConcurrentModificationException

        }*/

        /**
         * 解决方法 ： 使用ListIterator调用add方法
         */

        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){

            String str = (String) lit.next();
            if ("world".equals(str)){
                lit.add("javaee");
            }

        }

        System.out.println(list);



    }
}
