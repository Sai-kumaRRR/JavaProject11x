package ex04_Operators;

public class Lab030_Concatination_plus2 {
    public static void main(String[] args) {
        String first_name = "sai";
        String last_name ="kumar";
        int a= 10;
        int b=10;
        System.out.println(first_name +last_name +a +b);
//first operator +performed as concatination

        System.out.println( a+b +first_name+last_name);

        System.out.println( first_name + last_name+(a+b));
        //BODMAS -bracketbof div,mul,add,sub
    }
}
