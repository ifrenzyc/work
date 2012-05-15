package me.yangc.maven_test.fastjson;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.alibaba.fastjson.JSON;

public class FastJSONTest {

    public static void main (String [] args)
    {
        DemoBean demo = new DemoBean();
        demo.setId(233);
        demo.setName("张三");
        demo.setBirthdate(new Date());

        String text = JSON.toJSONString(demo);
        System.out.println(text);
    }
}
