package ex027_IIB;

import ex026_OOPs_abstraction_interface.A;

public class Lab194_Static {
    
    public static <A> void main(String[] args) {

        A ref1 = new A(10);
        ref1.displayValue();
        System.out.println(ref1.b);

        System.out.println("-----");

          A ref2 = new A(20);
        ref2.displayValue();
        System.out.println(ref2.b);

    }
}
class A{
    int a; // non static -> instance variable / properties / attribute / fields
    static int b = 20;
    A(int b) {
        this.a = a;
    }
}