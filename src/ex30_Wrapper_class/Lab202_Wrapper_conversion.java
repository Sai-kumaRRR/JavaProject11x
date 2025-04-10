package ex30_Wrapper_class;

public class Lab202_Wrapper_conversion {
    public static void main(String[] args) {
        int a=10;
        Integer b =a; // this boxing -> automatically jvm store the value
        // primitive to wrapper -> autoboxing
        System.out.println(b.intValue()); // BEHAVIOR
        System.out.println(Integer.MIN_VALUE); // behavior

        Integer a2 =42;
        int v = a2; // unboxing -> wrapper is removed, attribute , behavior is lost.
        System.out.println(v);
    }
}
