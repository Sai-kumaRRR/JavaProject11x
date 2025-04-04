package ex021_Polymorphism;

public class Lab177_Method_overriding {


    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();

    }
}
class Animal{
    void sound(){
        System.out.println("Animal sound!");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Bark!");
    }
}
