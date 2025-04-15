package ex33_Collection_Frameworks.List;

import java.util.ArrayList;
import java.util.List;

public class Lab229_Array_List02 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("1"); // o
        list.add("2"); // 1
        list.add("3"); // 2
        list.add("3"); // 3
        list.add("4"); // 4
        list.add("true"); // 5


        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));

        // returns the index of the first occurrence of the specific.
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));


        System.out.println(list);

        System.out.println("------");


        System.out.println("--------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.clear();
        System.out.println(list);
    }
}