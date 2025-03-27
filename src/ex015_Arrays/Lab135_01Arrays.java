package ex015_Arrays;

public class Lab135_01Arrays {
    public static void main(String[] args) {
        int a =10;
        int [] marks = {91 , 90 , 51 , 100 ,  91 ,92 ,89};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);
        System.out.println(marks[2]);
        System.out.println(marks[-1]);  // arrayIndexOutBoundException
        // system.out.println(marks[10]);  // arrayIndexOutOFBoundsException

        char c = 'A';
        String name = "Sai";
    }
}
