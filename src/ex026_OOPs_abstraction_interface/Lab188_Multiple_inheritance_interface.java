package ex026_OOPs_abstraction_interface;



public class Lab188_Multiple_inheritance_interface {
    public static void main(String[] args) {
        Child c1 = new Child();
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
