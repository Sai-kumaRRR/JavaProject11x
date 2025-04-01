package ex017_OOPs_Constructor;

public class Lab163_OOPs_constructor {
    public static <Baby> void main(String[] args) {

        var b1 = new Baby();
        new Baby();
        Baby b2;

    }

    void eat() {
        System.out.println("Eat!!!");
    }

    // Default constructor
    Baby(){
        System.out.println("I am called , Default constructor!");
        // Fetch data from the mysql database.....

    }

}