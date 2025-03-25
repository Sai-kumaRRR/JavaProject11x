package ex014_Strings;

import java.util.Scanner;

public class Lab133_Palindrome_task {
    public static void main(String[] args) {
        // array of char
        // madam -> madam , Naman -> reverse(Naman) ->

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input , i will check palindrome");
        String userInput = sc.next();
        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }
        String newString = reversestring(userInput);
        if (newString.equalsIgnoreCase(userInput)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}