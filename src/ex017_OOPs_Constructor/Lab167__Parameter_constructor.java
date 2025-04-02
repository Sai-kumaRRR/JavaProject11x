package ex017_OOPs_Constructor;

public class Lab167__Parameter_constructor {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2();

        System.out.println(c1.name);
        System.out.println(c2.name);

        Car2 c3 = new Car2("model 3", "Tesla", 2015);
        System.out.println(c3.name);


        Car2 c4 = new Car2("Mahindra", "Scorpoio", 2015);
        System.out.println(c4.name);


        Car2 c5 = new Car2("CURVV", "TATA", 2024);
        System.out.println(c5.name);


        class Car2 {
            final String name;
            final String model;
            final int year;


            // DC
            Car2() {
                model = "xxx";
                year = 2025;
                name = "Unkown Car";
                System.out.println("DC");


            }

            // para - constructor
            Car2(String model_oc_arg, String name_oc_arg, int year_oc_arg) {
                this.name = name_oc_arg;
                this.model = model_oc_arg;
                this.year = year_oc_arg;

            }

        }
    }

}

