package ex017_OOPs_Constructor;

public class Lab166_DC02 {
    public static void main(String[] args) {
        Car c1 = new Car();
   //     c1 . name = "Telsa";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println(" -----");


        Car c2 = new Car();
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);


    }
}
 class Car{
    String name;
    int year;
    String model;

    // DC
     Car(){
         name = "know Car";
         year = 1999;
         model = "2025";

     }
 }