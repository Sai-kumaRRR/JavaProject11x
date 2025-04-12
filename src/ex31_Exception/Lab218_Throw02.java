package ex31_Exception;

public class Lab218_Throw02 {
    public static void main(String[] args) {

    }
    static void dividedByZero(int a){
        // check some
        if(a ==0){
            throw new ArithmeticException();
        }

    }
}
