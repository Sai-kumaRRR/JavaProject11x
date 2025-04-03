package ex019_OOPs_Inheritance_multilevel;

public class Lab173_hierarchical {

    public static <Sai, Lucky> void main(String[] args) {
        father f1 = new father();
        ruhani r1 = new ruhani();

        r1.home();
        f1.home();

        Sai s1 = new Sai();
        s1.clone()

        Lucky l1 = new Lucky();
        l1.l2();
        l1.clone();


    }
}

class father {
    void home() {
        System.out.println("3BHK");


    }
}

class sai extends father {
    void h2() {
        System.out.println("h2-Sai");

    }
}

class lucky extends father {
    void l2() {
        System.out.println("Lucky");
    }

}

class ruhani extends father {
    void r1() {
        System.out.println("ruhani!");
    }
}
