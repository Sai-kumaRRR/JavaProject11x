package ex33_Collection_Frameworks.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab232_Linked_lit03 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // array format

        List mylist2 = new LinkedList(); // doubly  linked list

        mylist2.add("SAI");
        mylist2.add("syush");
        mylist2.add("sonu");
        mylist2.add("omkar");
        mylist2.add("shubham");
        mylist2.add("shaba");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);


        System.out.println(mylist2.isEmpty());

        System.out.println(mylist2.size());

        System.out.println(mylist2.contains("kumar"));

        System.out.println(mylist2.indexOf("kumar"));

    }
}
