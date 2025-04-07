package ex024_Super_class;

public class Lab182_Super02 {
    public static void main(String[] args) {

        Car c1 = new Car(100);
        c1.display();


    }
}

class Vehicle {
    public int maxSpeed = 180;

    Vehicle() {
        System.out.println("Default const");

    }

    Vehicle(int a) {
        System.out.println("Param con");

    }

    // method overloading same, same name function with different arguments.
    void message() {
        System.out.println("no return ,no argument");

    }

    void message(int a) {
        System.out.println("pc argument");

    }

    void display() {
        System.out.println("vehicle parent");


    }
}

class Car extends Vehicle {
    private int maxSpeed = 28;

    public int getMaxSpeed() {
        return maxSpeed;

    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;


    }

    Car() {
        super(); // DC

    }

    Car(int a) {
        super(10); // pc of parent

    }
    // method overloading


    @Override
    void display() {

        System.out.println(this.maxSpeed);

        // parent
        System.out.println(super.maxSpeed);
        super.message();
        super.message(10);
        super.display();


        System.out.println("override");
    }


}
