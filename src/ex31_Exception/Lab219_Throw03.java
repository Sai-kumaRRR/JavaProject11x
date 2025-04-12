package ex31_Exception;

import java.util.Scanner;


public class Lab219_Throw03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!!!");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    private static void validateAge(int age) throws Exception {
        if (age < 18){
            throw new Exception("you can't go, else you will be out of the state");
        }
    }


}





