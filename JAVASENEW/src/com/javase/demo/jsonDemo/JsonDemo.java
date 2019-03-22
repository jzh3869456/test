package com.javase.demo.jsonDemo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonDemo {
    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();
        Map<String,Object> map = new HashMap<String, Object>();

        jsonObject.put("id","2280");
        jsonObject.put("name","成都市");
        jsonObject.put("fullName","四川省成都市");

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("id","2321");
        jsonObject1.put("name","德阳市");
        jsonObject1.put("fullName","四川省德阳市");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("id","2328");
        jsonObject2.put("name","绵阳市");
        jsonObject2.put("fullName","四川省绵阳市");


        JSONArray array = new JSONArray();
        array.add(jsonObject);
        array.add(jsonObject1);
        array.add(jsonObject2);


        map.put("body",array);
        JSONObject jsonObject3 = JSONObject.fromObject(map);

        System.out.println(jsonObject3);

    }
}
