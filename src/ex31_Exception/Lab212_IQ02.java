package ex31_Exception;

public class Lab212_IQ02 {
    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            b=10/c; // Vulnerable code that should be try and catch.Try_Catch_finally

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
