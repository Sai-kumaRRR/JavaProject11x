package ex33_Collection_Frameworks.List;

import java.util.ArrayList;
import java.util.List;

public class Lab239_Array_list03 {
    public static void main(String[] args) {
        Student s1 = new Student("amit","1");
        Student s2 = new Student("amit","4");
        Student s3 = new Student("amit","6");

        List<Student> myStudents = new ArrayList();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
