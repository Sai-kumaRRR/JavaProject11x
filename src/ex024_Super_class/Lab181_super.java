package ex024_Super_class;

public class Lab181_super {

}

class GOD {
    void sound() {
        System.out.println("GOD!");
    }
}

class Animal {
    protected String color = "while";

    void sound() {
        System.out.println("Animal sound!!!");

    }
}

class Dog extends Animal {

    private final String color = "Black";

    Dog(){
        // super();
    }

    void display() {
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}