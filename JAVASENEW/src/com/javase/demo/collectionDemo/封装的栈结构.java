package com.javase.demo.collectionDemo;

import java.util.LinkedList;

public class 封装的栈结构 {

    private LinkedList liked = new LinkedList(); // 创建集合对象

    /**
     * 进栈
     * @param obj 要进入的对象
     */
    public void in(Object obj){
        liked.addLast(obj);
    }

    /**
     * 出栈
     * @return 返回出栈对象
     */
    public Object out(){

        return liked.removeLast();
    }

    /**
     * 判断栈空间是否还有值
     * @return 返回判断
     */
    public boolean isEmpty(){

        return liked.isEmpty();
    }

}
