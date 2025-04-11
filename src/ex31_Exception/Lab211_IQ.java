package ex31_Exception;

public class Lab211_IQ {
    public static void main(String[] args) {
        try {
            String input_user = args[0]; // java.ArrayIndexOutOFBoundException
            int a = Integer.parseInt(input_user); // java.lang.Number format Exception
            int output = 100 / a;

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException
                 | NumberFormatException e)
        // new NumberFormatException (); JVM is creating the object.
        System.out.println(e.getMessage());

    }
}
