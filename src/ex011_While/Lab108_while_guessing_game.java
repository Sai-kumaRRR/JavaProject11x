package ex011_While;

public class Lab108_while_guessing_game {
    public static void main(String[] args) {
        // guess a number between 1 and 100


        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");

        int guess;
        int attempts = 0;
    }
}
