package ex33_Collection_Frameworks.Set;

import java.util.*;

public class Lb241_HashSet_LHS {
    public static void main(String[] args) {

        Set<String> hs1 = new HashSet();
        // hashing mechinse to store the elements
        // no orders
        // no duplicates

        hs.add("apple");
        hs.add("Orange");
        hs.add("watermelon");
        hs.add("watermelon");

        // hs.add(123);
        hs.add(null);
        //hs.add(null);
        System.out.println(hs);
        System.out.println(" ------- ");

        for (String s : hs) {
            System.out.println(s);
        }
        System.out.println(" ----- ");


        // Iterator
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println(" ------ ");


        Set lhs = new LinkedHashSet();
        // LinkedList mechinsm to store the elements
        // order will maintain , no duplicate

        lhs.add("papaya");
        lhs.add("apple");
        lhs.add("orange");
        lhs.add("watermelon");
        lhs.add("watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());


        System.out.println(" ------ ");
        Set ts = new TreeSet();




    }

}
