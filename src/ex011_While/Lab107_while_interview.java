package ex011_While;

public class Lab107_while_interview {
    public static void main(String[] args) {
        // factorial series
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the  factorial program \nenter  the no  whose fact");
        int number = scanner.nextInt(); // Read an integer input from the user

        int factorial = 1; // initialize the factorial variable to 1
        if (number <= 0) {  // check if the number is less then or equal to 0
            System.out.println(factorial); // if true , print the factorial
        } else {
            // if the number is integer than 0 , calculate the factorial
            for (int i = 1; i <= number; i++) { // loop from 1 to the  number
                factorial = factorial * i; // multiply the current factorial value by
            }
        }

        System.out.println("factorial is -> " + factorial); // print the calculate .
    }

}