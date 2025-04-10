package ex30_Wrapper_class;

public class Lab200_primitive_wrapper {
    public static void main(String[] args) {
        int a = 10; // primitive
        // this is not object
        // it will not attribute & behaviour

        // char,short ,long,float,byte,double ,- we will avoid them now

        // we will use the wrapper classes.
        // Character, Boolean ,Short,Long,Double,Float.

        Integer age = 65;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
    }

}
