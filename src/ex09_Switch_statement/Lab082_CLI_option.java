package ex09_Switch_statement;

public class Lab082_CLI_option {
    public static void main(String[] args) {
        // Scanner class
        //
         // take a user input - name , age , and salary and print them in the end
        //
        // take a user input 2 numbers from the arguments and calculation the maximum.
        System.out.println("Enter the name , age end salary");
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

