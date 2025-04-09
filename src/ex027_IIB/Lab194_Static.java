package ex027_IIB;

import ex026_OOPs_abstraction_interface.A;

public class Lab194_Static {
    
    public static <A> void main(String[] args) {
        A.b = 45;
        A ref1 = new A(10);
        ref1.displayValue();
        A ref2 = new A(20);
        ref2.displayValue();
        //  System.out.println(ref2.b);
        System.out.println(A.b);

        System.out.println("-----");

        ref2 = new A(20);
        ref2.displayValue();
        //  System.out.println(ref2.b);
        System.out.println(A.b);

        A ref3 = new A(20);
        System.out.println(A.b);

    }
}
