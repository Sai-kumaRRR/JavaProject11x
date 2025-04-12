package ex33_Collection_Frameworks.List;

import java.util.ArrayList;
import java.util.List;

public class lab227_List_01 {
    public static void main(String[] args) {

        //List fruits = new List();
        List fruits = List.of("orange","apple","graphics","watermelon");
        System.out.println(fruits);
        // fruits.add("chiku"); // java.lang.unsupportedOperationException
        //fruits.remove("apple"); // not possible

        List l = new ArrayList(); // dynamic diapatch
        ArrayList l2 = new ArrayList();
        l .add("hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");
    }
}
