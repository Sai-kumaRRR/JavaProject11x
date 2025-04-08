package ex025_OOPs_Abstraction_class;


import ex019_OOPs_Inheritance_multilevel.Father;

public class Lab183_abstraction {

    Child c = new Child();
    c.loan50k();
    c.loan25k();
    // father f1 = new father();
    father f2 = new Child();


    abstract class father {
    }

    class Child extends Father {
    }


}


