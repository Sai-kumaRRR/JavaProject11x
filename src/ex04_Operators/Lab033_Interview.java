package ex04_Operators;

public class Lab033_Interview {
    public static void main(String[] args) {
        System.out.println(!(10>20));

        //and  && // only true && true retruns true

        //T  || T -> T
        //T || F -> F
        //F || T -> F
        //F || F -> F
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
