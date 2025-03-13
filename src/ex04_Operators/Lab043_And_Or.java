package ex04_Operators;

public class Lab043_And_Or {
    public static void main(String[] args) {


        // AND && //only true && true retruns true
        // T ||t -> T
        //T||F -> F
        // F||F -> F
        // F ||T ->F
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
