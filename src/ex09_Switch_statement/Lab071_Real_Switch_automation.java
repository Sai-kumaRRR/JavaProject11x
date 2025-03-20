package ex09_Switch_statement;

public class Lab071_Real_Switch_automation {
    public static void main(String[] args) {
        // web automation

        // i will to will start the automation in that browser which he wants to
        //use to i will start the automation in that browser .

        // string browser = args[0};
        // System.out.println(browser);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch (browser) {
            case"chrome":
                System.out.println("starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                // further code to start the firefox
                // Web  driver = new firefox (); // selenium code
                break;
            case "edge":
                System.out.println("execute the edge  code");
            default:
                System.out.println("i have no idea which browser is this ");
                break;

        }
    }

}
