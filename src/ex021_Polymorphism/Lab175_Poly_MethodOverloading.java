package ex021_Polymorphism;

public class Lab175_Poly_MethodOverloading {

    public static void main(String[] args) {


      MathOperations m1 = new MathOperations();
        int r1 = m1.add (3 , 4);
        int r2 = m1.add(3 , 4 ,5);
        double r3 = m1.add(3.14,5.46);


    }
}
class MathOperations {
    // In the same class , when you have a method with same,
    // name but different arguments and different return type.

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }




}

