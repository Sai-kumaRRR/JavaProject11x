package ex33_Collection_Frameworks.Set;

import java.util.*;


public class Lb241_HashSet_LHS {


    public static void main(String[] args) {

        Set<String> hs1 = new HashSet();
        // hashing mechanism to store the elements
        // no orders
        // no duplicates
        hs1.add("apple");
        hs1.add("Orange");
        hs1.add("watermelon");
        hs1.add("watermelon");

        // hs.add(123);

        hs1.add(null);
        // hs.add(null);
        System.out.println(hs1);
        System.out.println(" ------- ");

        for (String s : hs1) {
            System.out.println(s);
        }
        System.out.println(" ----- ");


        // Iterator
        Iterator iterator = hs1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println(" ------ ");


        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the elements
        // order will maintain , no duplicate

        lhs.add("papaya");
        lhs.add("apple");
        lhs.add("orange");
        lhs.add("WaterMelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        System.out.println(" ------ ");


        Set ts = new TreeSet();
        // black and red tree mechanism to store the element
        // order will maintain , natural sorting is done .
        // natural sorting - ASCII values.

        ts.add("Dapple");
        ts.add("apple");
        ts.add("Apple");
        ts.add("orange");
        ts.add("watermelon");
        ts.add(" ");
        ts.add(123); // java.lang.classCastException
        ts.add(null); // java.lang.Null pointerException.
        System.out.println(ts);


        System.out.println(" ----- ");

        for (Object o : ts) {
            System.out.println(o);
        }


    }

}
