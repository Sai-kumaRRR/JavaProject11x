package ex10_For_Loop;

public class Lab099_for_loop_continue_even_number {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) { // 0 to 50 , 51 times
            if (i % 2 == 0) {
                System.out.println("even -> " + i);
                continue;
            }
        }
        System.out.println("odd " +i);
    }

}