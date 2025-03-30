package ex015_Arrays;

import java.util.Scanner;

public class Lab152_2D_multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size_of_the_table = scanner.nextInt();

        for (int i = 0; i < Size_of_the_Table; i++) {


            //             System.out.print(i + "x" + j + " =" + (i * j) + "\t\t");
            for (int j = 0; j < size_of_the_table; j++)
                System.out.print((i * j) + "\t");
            System.out.println();
        }
    }
}
