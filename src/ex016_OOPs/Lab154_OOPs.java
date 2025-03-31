package ex016_OOPs;

public class Lab154_OOPs {
    public static void main(String[] args) {


        class person {
            // Attribute | properties | data members | Instance variables
            String name;
            String phone;
            String color_eyes;

            int legs;
            double salary;
            byte age;
            double weight;
            boolean ismale;


            // Behaviour / function methods
            void sleep() {
                System.out.println("I am sleeping");
            }

            String greet(String name) {
                return "Hello + name";


            }

            void talk() {
                System.out.println("Talking");

            }

            int remaining_amount_sal(int salary, int tax) {
                return salary - tax;


            }
        }

    }

}