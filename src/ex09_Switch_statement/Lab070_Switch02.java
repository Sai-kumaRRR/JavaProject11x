package ex09_Switch_statement;

public class Lab070_Switch02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day){

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }

    }
}
