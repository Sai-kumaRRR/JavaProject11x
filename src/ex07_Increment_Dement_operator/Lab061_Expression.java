package ex07_Increment_Dement_operator;

public class Lab061_Expression {
    public static void main(String[] args) {
        int a = 10;
        System.out.println( a++ + ++a);
        System.out.println(a);

        // a++ -> A -> EXP a ->10, a -> 11
        //+
        // ++a -> B -> 12 , a-> 12
        // A+B -> EXP A + EXP B-> 12 , a -> 12
         // A + B -> EXP A + EXP B -> 12 , a -> 12
    }
}
