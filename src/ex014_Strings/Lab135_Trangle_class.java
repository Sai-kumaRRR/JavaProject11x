package ex014_Strings;

import java.util.Scanner;

public class Lab135_Trangle_class {
    public static void main(String[] args) {
        // Triangle classifier
        // write a program that classifier a triangle based on its side lengths.
        // given three input values representing the length of the sides.
        // determine if the triangle is equilateral (all sides are equal) .
        // isosceles (execute two sides are equals)
        // or scalene (no sides are equal) .
        // use an if else statement to classify the trangle .

       // int t1 = Integer.parseInt(args[0]);
        //int t2 = Integer.parseInt(args[1]);
         //int t3 = Integer.parseInt(args[2]);


        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if (side1 <= 0 || side2<= 0 || side3 <=0){
            System.out.println("this is not a triangle");
            System.exit(0);
        }
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <=side2){
            System.out.println(" this is not a triangle ");
            System.exit(0);


        }
        // real logic will come
        if (side1 == side2 && side2 == side3 ) {
            System.out.println("Equilateral triangle");

        }else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles triangle");

        } else{
            System.out.println("Scalene");
        }
        scanner.close();
    }
}
