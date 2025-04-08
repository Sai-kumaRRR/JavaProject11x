package ex025_OOPs_Abstraction_class;

public class Lab184_Abstraction_example01 {
    public static void main(String[] args) {
        WagonR car = new WagonR();





    }
}

abstract class Engine{

    abstract void startEngine();

    abstract void stopEngine();

    void normal(){
        System.out.println("normal function!");

    }
}

 class WagonR extends Engine{
     @Override
     void startEngine() {

     }

     @Override
     void stopEngine() {

     }...} // complete class - no abstract method

