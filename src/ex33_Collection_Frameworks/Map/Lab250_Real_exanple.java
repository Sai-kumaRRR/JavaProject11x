package ex33_Collection_Frameworks.Map;

import java.util.*;

public class Lab250_Real_exanple {
    public static void main(String[] args) {
        Map<String, Object> student1 = new HashMap();
        student1.put("name","SONU");
        student1.put("phone","98765432");
        student1.put("address","pune");
        student1.put("address",123);


        Map<String, Object> student2 = new HashMap();
        student1.put("name","Suyash");
        student1.put("phone","98765432");
        student1.put("address","vskp");
        student1.put("address",654);



        Map<String, Object> student3 = new HashMap();
        student1.put("name","OMKAR");
        student1.put("phone","98765432");
        student1.put("address","delhi");
        student1.put("address",123);


        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
        System.out.println(student1);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad poor Dad");
        book_read_items.add("sapaiens");
        book_read_items.add("secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit2");
        book_read_items.add("Eat the Frog");







    }
}
