package ex31_Exception;

public class Lab231_Jr_QA_vs_Sr_QA_3 {
    public static void main(String[] args) {
        // Sr.QA
        try{
            String ip = args[0]; // java.lang.ArrayIndexoutofBoundsException
            int a = Integer.parseInt(ip); // numberformatException
            int b = 100/a; // arithmeticException
            System.out.println(b);

        }catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
