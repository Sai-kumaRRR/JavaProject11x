package ex31_Exception;

public class Lab230_Jr_QA_vs_Sr_QA_2 {
    public static void main(String[] args) {

        //Jr.QA
        try{
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberformatException
            int b = 100/a; // ArithmeticException
            System.out.println(b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
