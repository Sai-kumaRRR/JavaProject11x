package ex33_Collection_Frameworks.List;

public class Student {


    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;


    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;

    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;

    }

    public void printDetails() {
        System.out.println("Student Name : " + this.name);
        System.out.println("Student rollNo : " + this.rollNo);

    }

    @Override
    public String toString() {
        return "student{" +
                "name=" + name + '\'' +
                ",rollNo='" + rollNo + '\'' +
                '}';


    }
}