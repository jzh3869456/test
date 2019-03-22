package com.javase.demo.collectionDemo;

public class 测试封装栈结构 {

    public static void main(String[] args) {

        封装的栈结构 stack = new 封装的栈结构();

        /**
         * 进栈
         */

        stack.in("aa");
        stack.in("bb");
        stack.in("cc");
        stack.in("dd");
        stack.in("ee");
        stack.in("ff");

        /**
         * 出栈
         */

        while (!stack.isEmpty()){

            System.out.println(stack.out());
        }

        System.out.println("队列结构==============");

        封装的队列结构 queue = new 封装的队列结构();

        queue.in("aa");
        queue.in("bb");
        queue.in("cc");
        queue.in("dd");
        queue.in("ee");

        while (!queue.isEmpty()){

            System.out.println(queue.out());
        }
    }
}
