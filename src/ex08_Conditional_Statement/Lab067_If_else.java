package ex08_Conditional_Statement;

import java.util.Scanner;

public class Lab067_If_else {
    public static void main(String[] args) {
        //  How to take the user Input
        //  1. CLI options
        //
        //    int age = Integer.parseInt(args[0])
        // 2. Scanner Class
        Object system;
        scanner scanner = new scanner(System.in);
        System.out.println("Enter your age!");
        int age = Scanner.parseInt(System.in);
        System.out.println(age);


        if (age > 18) {
            System.out.println("Allowed to vote!");
        } else {
            System.out.println("Not Allowed!");
        }


    }
}
