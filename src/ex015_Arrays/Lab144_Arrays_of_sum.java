package ex015_Arrays;

import org.w3c.dom.ls.LSOutput;

public class Lab144_Arrays_of_sum {
    public static void main(String[] args) {

        int [ ]numbers = {12 , 34 , 10 };
        int sum = 0; // -> 12 + 34 + 10 = 56

        System.out.println("-----");
        for (int i =0; i< numbers.length; i++)
            sum = sum + numbers[i];
        System.out.println(sum);


        System.out.println(" for each---"); // enchance for loop
        for (int n : numbers){
            sum = sum + n;

            System.out.println(sum);
        }
    }


}
