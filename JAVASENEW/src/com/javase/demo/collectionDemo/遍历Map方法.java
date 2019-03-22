package com.javase.demo.collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 遍历Map方法 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<String,String>();
        map.put("1","value1"); // put() 将指定的值与此映射中的指定键关联
        map.put("2","value2");
        map.put("3","value3");
        map.put("4","value4");

        map.remove("4");// 删除方法 remove()
        // 第一种：普遍使用，二次取值

        System.out.println("通过Map.keySet遍历key和value: ");
        for (String key : map.keySet()){
            System.out.println("key= " + key + "and value=" + map.get(key));// get() 返回指定键所映射的值
        }

        // 第二种

        System.out.println("-------------------------");
        System.out.println("通过Map.entrySet使用iterator遍历key和value: ");

        Iterator<Map.Entry<String,String>> it= map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println("key= " + entry.getKey() + "and value= " + entry.getValue());
        }

        System.out.println("-------------------------");
        // 第三种： 推荐，尤其是容量大时

        System.out.println("通过map.entrySet遍历key和value");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("key= " + entry.getKey() + "and value=" + entry.getValue());
        }

        System.out.println("-------------------------");
        System.out.println("通过Map.values()遍历所有的value,但不能遍历key");
        for (String v : map.values()){
            System.out.println("value= " + v);
        }


    }
}














































