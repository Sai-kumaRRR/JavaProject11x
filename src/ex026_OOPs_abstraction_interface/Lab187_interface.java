package ex026_OOPs_abstraction_interface;

public class Lab187_interface {

    public static void main(String[] args) {
        Car c1 = new Car1();
        c1.drive();

    }
}

class Car1 implements Engine1, Brakes {

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");

    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");

    }


}

interface Brakes {

}