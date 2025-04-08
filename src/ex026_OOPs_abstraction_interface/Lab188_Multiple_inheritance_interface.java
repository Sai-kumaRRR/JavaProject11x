package ex026_OOPs_abstraction_interface;

import ex025_OOPs_Abstraction_class.Lab183_abstraction;

public class Lab188_Multiple_inheritance_interface {
    public static void main(String[] args) {
        Lab183_abstraction.Child c1 = new Child();
        c1.money();

    }
}
interface Mother{
    void money();

}
interface Father{
    void money();

}
class Child implements Mother,Father{

    @Override
    public void money() {

    }
    abstract class child implements Mother,Father{

        @Override
        public void money(){
            System.out.println("Child Money!!");

        }

    }
}
