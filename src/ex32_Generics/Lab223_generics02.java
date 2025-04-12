package ex32_Generics;

import static ex32_Generics.Lab222_generics_fix.temp_sum;

public class Lab223_generics02 {
    public static void main(String[] args) {

        temp_sum(3 ,4);
        temp_sum(3 ,4);
        temp_sum("SAI" ,"kumar");

    }
    static int temp_sum(int a, int b){
        return a+b;
    }
    static double temp_sum(double a, double b){
        return a+b;
    }
    static String temp_sum(String a, String b){
        return a+b;
    }
}
