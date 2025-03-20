package ex09_Switch_statement;

public class Lab069_switch_statement {
    public static void main(String[] args) {
        // switch

        // take a user input and tell time the day which they have told.
        // 1 to 7 -> 1 -> mon , 5 -> friday
        // 8 ? - not allowed or error

        //int day = Integer . parseInt(args[0];  - cli option

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day num(1 to 7)");
        int day = scanner.nextInt();
        switch (day) {

            case 1:

                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thru");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid , day number");
                break;
        }
    }

}