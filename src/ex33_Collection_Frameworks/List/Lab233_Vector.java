package ex33_Collection_Frameworks.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class Lab233_Vector {
    public static void main(String[] args) {
        Lab233_Vector v = new Lab233_Vector();
        Lab233_Vector v1 = new Lab233_Vector(10);

        v.add("SAI");
        v.add("Amit");
        v.add("Syush");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Syush"));
        System.out.println(v);

        System.out.println("-----");

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));

        }
        System.out.println("---- for each loop");
        for (Object o : v) {
            System.out.println(o);
        }
        System.out.println("----Iterator");

        Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println(iterator.next());

        Enumeration<Object> enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());

        }
        System.out.println("---- ListIterator");

        ListIterator listIyerator = v.listIterator();
        while (listIterator.hasNext()) {

            System.out.println(listIterator.next());

        }
        System.out.println("\nBackward Direction:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.hasPrevious());
        }


    }
}
