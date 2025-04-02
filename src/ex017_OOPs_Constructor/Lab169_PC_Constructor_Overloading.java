package ex017_OOPs_Constructor;

public class Lab169_PC_Constructor_Overloading {
    public static void main(String[] args) {

        Person p1 = new Person("AMIT", 97654321, "Raipur");
        Person p2 = new Person("SONU", 97654378, "Bilaspur");


        Person p3 = new Lab168_PC_Real.Person();
        p3.name = "shikha";
        System.out.println(p3.name);

        Person p4 = new Person("LUCKY", 6547896);
        System.out.println(p4.name);

        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}

class Person1 {
    Person1(String name_arg, long phone_arg, String address_arg) {
        this.name = name_arg;
        this.address = address_arg;
        this.phone = phone_arg;

    }

    Person1(String name_arg, long phone_arg) {
        this.name = name_arg;
        this.phone = phone_arg;

    }

    void eat() {
        System.out.println(this.name + "is eating!");
    }

}
