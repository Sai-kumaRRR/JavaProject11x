package ex019_OOPs_Inheritance_multilevel;

public class Lab171_Multi_Level {
    public static void main(String[] args) {

        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();

        GrandFather gf = new GrandFather();
        gf.gf();

        System.out.println("---");

        Father f1 = new Father();
        f1.f();
        f1.gf();

        System.out.println("----");


        s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();

    }
}
