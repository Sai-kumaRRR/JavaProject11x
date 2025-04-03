package ex019_OOPs_Inheritance_multilevel;

public class Lab172_Multi_Level02 {
    public static void main(String[] args) {


        // son s1 = new GrandFather();
        // son s1 = new father();

        Son amit = new Son();

        GrandFather g2 = new GrandFather();
        g2.home();


        Father f2 = new Son();
        f2.home();

        // Father f3 = new GrandFather();

        // webDriver driver = new ChromeDriver();


    }
}
