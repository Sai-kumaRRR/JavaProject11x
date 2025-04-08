package ex025_OOPs_Abstraction_class;

public class Lab185_abstraction_real {

    private String name;
    private String address;
    private int number;

      void employee(){
        System.out.println("DC");

    }

    void employee(String name, String address, int number) {
        System.out.println("conString an employee");
        this.name = name;
        this.address = address;
        this.number = number;

    }

    double computePay() {
        return 0;
    }

    void mailCheck() {
        System.out.println("mailing a check to" + this.name + " " + this.address);
    }
}
    class C1 extends Employee{

        @Override
        double computePay() {
            return 0;
        }

    }
