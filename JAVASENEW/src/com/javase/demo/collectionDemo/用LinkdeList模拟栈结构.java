package com.javase.demo.collectionDemo;

import java.util.LinkedList;

public class 用LinkdeList模拟栈结构 {

    public static void main(String[] args) {

        LinkedList lik  = new LinkedList();

        lik.addLast("jzh"); // 先进后出
        lik.addLast("ja");
        lik.addLast("bb");
        lik.addLast("cc");
        lik.addLast("dd");

        while (!lik.isEmpty()){
            System.out.println(lik.removeLast());
        }
    }
}
