package ex015_Arrays;

import java.util.Scanner;

public class Lab151_Right_Triangle2D {
    public static void main(String[] args) {
        // how the pattern we want

        // n= 3
        // *
        //* *
        //* * *

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number e.g n=3");
        int n = scanner.nextIn();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
        }


    }
}
