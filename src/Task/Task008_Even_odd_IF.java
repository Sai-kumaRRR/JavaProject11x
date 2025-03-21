package Task;

import java.util.Scanner;

public class Task008_Even_odd_IF {


        // create a program
        // take user input &
        // check weather the input is even or odd number

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            // int number2 = Integer.parseInt(args[0];
            if (number % 2 == 0) {
                System.out.println("even");

            } else {
                System.out.println("odd");
            }

        }
    }

