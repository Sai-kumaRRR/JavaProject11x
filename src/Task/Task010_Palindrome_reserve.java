package Task;

public class Task010_Palindrome_reserve {
    public static void main(String[] args) {
        String name = "Naman";

        for(int i = name.length()-1; i >=0; i--){
            System.out.println(name.charAt(i));
        }
    }
}
