package ex33_Collection_Frameworks.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab237_User_input_Array_list {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        // multiple inputs from the user and store them in seprate
        // names , ages - store them
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y"; // control variable for input  loop

        while(continueInput.equalsIgnoreCase("Y")) {

            System.out.println("Enter the name");
            String name = scanner.next();
            names.add(name);


            System.out.println("Enter the age");
            Integer age = scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("Do you want to enter another record ? (y / N ):");
            continueInput = scanner.nextLine();

        }
        for (Object o1 : names){
            System.out.println(o1);
        }
        for(Object o2 : ages){
            System.out.println(o2);
        }

            scanner.close();





        }
    }

