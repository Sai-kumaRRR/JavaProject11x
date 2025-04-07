package ex024_Super_class;

public class Lab181_super {

}
class Animal{
    protected String color = "while";

    void sound(){
        System.out.println();
    }
}
class Dog extends Animal{

    private String color = "Black";

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
    }
}