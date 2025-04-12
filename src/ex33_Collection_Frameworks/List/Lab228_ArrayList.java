package ex33_Collection_Frameworks.List;

import java.util.ArrayList;
import java.util.List;

public class Lab228_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sai");
        arrayList.add(null);
        arrayList.add("kumar");
        arrayList.add("kumar"); // duplicate is allowed
        arrayList.add(123);  // different data types is allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList(); // dynamic dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
