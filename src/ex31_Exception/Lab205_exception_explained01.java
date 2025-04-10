package ex31_Exception;

public class Lab205_exception_explained01 {
    public static void main(String[] args) {
        System.out.println("Starting the program");
        String input_user = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(input_user);
        int output = 100/a; // java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("end of the program!!!");



        // divide by zero-> ?

    }
}
