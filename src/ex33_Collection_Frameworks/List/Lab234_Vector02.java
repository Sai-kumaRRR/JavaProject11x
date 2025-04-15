package ex33_Collection_Frameworks.List;

import java.util.ListIterator;
import java.util.Vector;

public class Lab234_Vector02 {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Item");
        vector.add("Item");
        vector.add("Item");
        vector.add("Item");
        vector.add("Item");

        ListIterator listIterator = vector.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());

        }
        System.out.println(listIterator.next());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());

        }

    }
}