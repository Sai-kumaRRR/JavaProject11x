package ex028_Static;

public class Lab197_static_web_automation {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(Automation.driver);

        Automation t2 = new Automation();
        Automation t3 = new Automation();

        System.out.println(t2.driver);
        System.out.println(t3.driver);

    }
}
class Automation{
    static String driver = "chrome";

}
