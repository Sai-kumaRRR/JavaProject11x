package ex07_Increment_Dement_operator;

public class Lab060_Advance_I_D_Operator {
    public static void main(String[] args) {
         int a = 10;
        System.out.println(a++ + a);
         //A+B
        // A -> a++ -> EXP A -> 10; a = 11
        // +
        // B -> a -> EXP B -> 11 , a = 11
        // A+B -> EXP A + EXP B  -> 10 + 11
         // line n0. | a | EXP
        // 5 | 10 | NA
         // 6 | 11 | 10+11 -> 21
    }
}
