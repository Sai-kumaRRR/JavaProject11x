package ex33_Collection_Frameworks.Queue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab248_Map {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        // map is key and value pair
        // name -> sai
        m1.put("name", "sai");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        System.out.println(m1);


        Map m2 = new LinkedHashMap();
        m1.put("name", "sai");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        System.out.println(m2);


        Map m3 = new TreeMap();

        // Map is key - value
        // name: sai,
        //rollno : 1
        // phone : 987654321
        m1.put("name", "sai");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        System.out.println(m3);


    }
}
