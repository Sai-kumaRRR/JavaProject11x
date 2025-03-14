package ex06_Ternary_Operator;

public class Lab051_T_Operator_03 {
    public static void main(String[] args) {

        // find the maximum number between two numbers

        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));

        int max = x > y ? x :y;
        System.out.println(max);

    }
}
