package com.javase.demo.collectionDemo;

import com.javase.demo.collectionDemo.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        /**
         * 需求：ArrayList去除集合中字符串的重复(字符串的内容相同)
         * 思路：创建新集合的方式
         */

        List<Student> list = new ArrayList<>();

        list.add(new Student("jj",11));
        list.add(new Student("jj",11));
        list.add(new Student("kk",22));
        list.add(new Student("jj",22));
        list.add(new Student("jj",22));
        list.add(new Student("jp",25));

        List list1 = new ArrayList();

        Iterator it = list.iterator();
        while (it.hasNext()){

            Object obj = it.next();
            if (!list1.contains(obj)){

                list1.add(obj);
            }

        }

        System.out.println(list1);
    }
}
