package com.javase.demo.collectionDemo;

import java.util.LinkedList;

public class 封装的队列结构 {

    private LinkedList liked = new LinkedList(); // 创建集合对象
/**
 *  模拟队列   队列结构特点：先进先出
 */

    /**
     * 进队列
     * @param obj 要进入的对象
     */
    public void in(Object obj){
        liked.addLast(obj);
    }

    /**
     * 出队列
     * @return 返回出队列对象
     */
    public Object out(){

        return liked.removeFirst();
    }

    /**
     * 判断队列空间是否还有值
     * @return 返回判断
     */
    public boolean isEmpty(){

        return liked.isEmpty();
    }
}
