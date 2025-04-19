package ex33_Collection_Frameworks.Map;

import java.util.Enumeration;
import java.util.HashMap;

public class Lab_252_HashTable {
    public static void main(String[] args) {


        HashMap<Integer, String> ht2 = new HashMap<>();


        // not thread safe , or not synchronised
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(3, null);
        ht2.put(null, null);
        System.out.println(ht2);

        System.out.println(" ------ ");

        Enumeration<Integer> e = ht2.Key();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());


        }


    }   }