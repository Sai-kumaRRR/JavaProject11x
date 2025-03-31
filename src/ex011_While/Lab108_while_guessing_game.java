package ex011_While;


import java.util.Random;
import java.util.Scanner;

public class Lab108_while_guessing_game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100


        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int guess;
        int attempts = 0;
    }


}

