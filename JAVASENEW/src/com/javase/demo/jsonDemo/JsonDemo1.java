package com.javase.demo.jsonDemo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JsonDemo1 {

    public static void main(String[] args) {


        Map<String,Object> map = new TreeMap<>();

        Rejion re = new Rejion();
        re.setId("2280");
        re.setName("成都市");
        re.setFullName("四川省成都市");

        Rejion re1 = new Rejion();
        re1.setId("2321");
        re1.setName("德阳市");
        re1.setFullName("四川省德阳市");

        Rejion re2 = new Rejion();
        re2.setId("2328");
        re2.setName("绵阳市");
        re2.setFullName("四川绵阳市");

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(re);
        jsonArray.add(re1);
        jsonArray.add(re2);

        map.put("body",jsonArray);

        JSONObject json = JSONObject.fromObject(map);


        System.out.println(json);






    }
}
