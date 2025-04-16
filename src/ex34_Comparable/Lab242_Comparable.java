import ex33_Collection_Frameworks.List.Student;

import java.util.ArrayList;
import java.util.List;

public class Lab242_Comparable {


    public static void main(String[] args) {


        Student s1 = new Student(108, "Sonu", 25);
        Student s2 = new Student(104, "Sai", 24);
        Student s3 = new Student(109, "amit", 28);


        List<Student> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

      //  List marks = new ArrayList();
        //marks.add(91);
       // marks.add(95);
       // marks.add(98);
       // marks.add(99);
       // marks.add(96);

      //  Collections.sort(marks);


        //   @Override
        // public int compareTo(Student o){
        //   return this.rollNo-o.rollNo;

        //  }

        // @Override
        //   public int compareTo(Student o) {
        //      return this.age-o.age;

        //  }

        @Override
        public int compareTo(Student o) {
              return this.name.compareTo(o.name);
        }

    }
}
