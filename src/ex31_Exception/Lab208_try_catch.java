package ex31_Exception;

public class Lab208_try_catch {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("are you fool , divided by zero");
        }
        System.out.println("2");
    }
}
