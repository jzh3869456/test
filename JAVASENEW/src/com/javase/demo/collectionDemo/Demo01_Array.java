package com.javase.demo.collectionDemo;

import com.javase.demo.collectionDemo.bean.Student;

public class Demo01_Array {
    public static void main(String[] args) {

        //int[] arr = new int[5];  //基本数据类型数组
        Student[] arr = new Student[5];  //创建引用数据类型数组
        arr[0] = new Student("张三",12); //创建一个学生对象，存储在数组的第一个位置
        arr[1] = new Student("李四",13);
        arr[2] = new Student("王五",14);

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
