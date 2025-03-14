package ex07_Increment_Dement_operator;

public class Lab062_Expression_02 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);



        //++a -> A -> EXPA -> , a-> 11
        //+
        //++a -> EXPB -> 12, a -> 12
        //expA + EXPB -> 11 +12 -> 23, a -> 12
    }
}
