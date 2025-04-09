package ex026_OOPs_abstraction_interface;

public class Lab190_abstraction {

    }
class ConcreateClass implements Incomplete_Interface{
    @Override
    public void display(){
        System.out.println("hii");
    }

}
interface Incomplete_Interface {
    int a = 10;

    void display();

    default void display2() {
        System.out.println("Default is allowed!!");
    }


    static void display3(){
    System.out.println("Default is allowed!!");
}

}
abstract class Incomplete_abstract{
    abstract void display1();
    void display2(){

    }
}




