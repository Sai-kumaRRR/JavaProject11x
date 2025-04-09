package ex027_IIB;

public class Lab192_IIB03 {
    public static void main(String[] args) {
        P p1 = new P();
        P p2 = new P();
        P p3 = new P();


        // IIB -> 3 -> objects
        // SIB -> 1 -> Class

    }
}
class P{
    static {
        System.out.println("SIB");


    }
    {
        System.out.println("IIB");

    }
    P(){
        System.out.println("DC");

        }
    }

