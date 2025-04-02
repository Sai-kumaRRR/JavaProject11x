package ex017_OOPs_Constructor;

public class Lab168_PC_Real {
    public static void main(String[] args) {
        Person p1 = new Person("AMIT", 987654321 , "raipur");
        Person p2 = new Person("SONU", 987654321 , "bilaspur");

        Person p3 = new Person();
        p3.name = "Sheba";
        System.out.println(p3.name);

        p1.eat();
        p2.eat();
        p3.eat();

    }

    class Person{
        String name;
        long phone;
        String address;

        Person(){

        }
        Person(String name_arg,long phone_arg, String address_arg){
            this.name = name_arg;
            this.address = address_arg;
            this.phone = phone_arg;

        }
        Person(String name_arg , long phone_arg){
            this.name = name_arg;
            this.phone = phone_arg;
        }

        void eat(){
            System.out.println(this.name +" is eating! ");
        }

    }
}
