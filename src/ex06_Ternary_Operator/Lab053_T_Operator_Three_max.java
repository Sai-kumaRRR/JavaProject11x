package ex06_Ternary_Operator;

public class Lab053_T_Operator_Three_max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 =-11;

        // logic Building formula

        //step 1 : find inputs / outputs
        // I/o -> n1,n2,n3 - int
        //o/p  -> String -> max number

        // step2 - rough logic , think about it.
        // n1 > n2 and n1 > n3 -> n1
        //n2 > n3 and n2> n1 -> n2

        int max = (n1 > n2) ?  (n1 > n3) ? n1 : n3 : ((n2 > n3) ? (n2 : n3);
        System.out.println( "Max ix " + max);
        //a -> (n1 >n3) ? n1 : n3


    }
}
