package ex05_Type_Casting;

public class Lab047_Typecasting_used {
    public static void main(String[] args) {
         int course = 100;
         float GST = 18.65f;

         // int total = course+gst; // narrow - implicit
        int total1 = course+(int)GST;  //narrow - explicit
        System.out.println( total1);

        float total2 = course+GST; // widening - auto - implicit
        float total3 = (float)course+GST; //Widening -auto - implicit
        System.out.println(total2);
        System.out.println(total3);
    }
}
