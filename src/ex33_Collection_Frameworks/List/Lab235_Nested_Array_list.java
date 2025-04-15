package ex33_Collection_Frameworks.List;

import java.util.ArrayList;
import java.util.List;

public class Lab235_Nested_Array_list {

    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("graphs");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List vegatables = new ArrayList();
        vegatables.add("tamotao");
        vegatables.add("onion");
        vegatables.add("patato");
        System.out.println(vegatables);

        List sll_fruits = new ArrayList();

        sll_fruits.add(fruits1);
        sll_fruits.add(fruits2);
        sll_fruits.add(vegatables);
        System.out.println(sll_fruits);
        System.out.println(sll_fruits.get(2));

    }
}
