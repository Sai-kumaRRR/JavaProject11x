package ex34_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Lab243_Comparator {


    public static void main(String[] args) {

        Student1 s1 = new Student1(107, "Vijay", 54);
        Student1 s2 = new Student1(102, "Vijay", 58);
        Student1 s3 = new Student1(108, "Vijay", 56);
        Student1 s4 = new Student1(106, "Vijay", 52);


        List<Student1> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);


                Collections.sort(studentList new AgeComparator());
                 Collections.sort(studentList new AgeComparator());
        System.out.println(studentList);


    }
}

class AgeComparator implements Comparator<Student2> {


}