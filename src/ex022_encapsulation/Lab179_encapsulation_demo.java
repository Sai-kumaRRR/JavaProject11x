package ex022_encapsulation;

public class Lab179_encapsulation_demo {


    public static void main(String[] args) {

        VWOLogin vwoLogin = new VWOLogin();
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(VWOLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin", "pwd123");
        //  System.out.println(vwoLogin1.password);
        // System.out.println(vwoLogin1.username);

        vwoLogin1.setUsername("sai");
        System.out.println(vwoLogin1.getUsername());

        System.out.println(vwoLogin1.getPassword());

        vwoLogin1.setPassword("12345", false);
        System.out.println(vwoLogin1.getPassword());


    }
}

class VWOLogin {
}

class GoodVWOLogin {

    private String username;
    private final String password;

    public GoodVWOLogin(String user, String password) {
        this.username = username;
        this.password = password;


    }

}
