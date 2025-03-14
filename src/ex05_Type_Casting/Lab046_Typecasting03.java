package ex05_Type_Casting;

public class Lab046_Typecasting03 {
    public static void main(String[] args) {

        long phone_no = 8827719076l;
        // short s = phone_no ; // implicit ?
        short s = (short) phone_no; // explicit casting - narrowing
        System.out.println(s);
    }
}
