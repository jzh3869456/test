import javaUtil.JsonUtil;
import net.sf.json.JSONObject;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
       // System.out.println("不慌 不慌 重头再来");

        /*List<String> list = new ArrayList<String>();
        String[] array = new String[] {"1","2","3"};

        for (int i = 0; i < array.length; i++){
            list.add(array[i]);
        }

        for (String str : list) {
            System.out.print(str);
        }*/


        /*String[] array = new String[]{"1","2","3"};
        List<String> list = Arrays.asList(array);

        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }*/


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id","2280");
        jsonObject.put("name","成都市");
        jsonObject.put("fullName","四川省成都市");

        JsonUtil.map2json(jsonObject);
        System.out.println(jsonObject);



    }
}
