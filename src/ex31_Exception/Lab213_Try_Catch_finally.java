package ex31_Exception;

public class Lab213_Try_Catch_finally {
    public static void main(String[] args) {
        int a = 1;
        int c = 6;
        try {
            c = 10 / 2;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println(" i will be always executed!!! ");
        }
    }
}
