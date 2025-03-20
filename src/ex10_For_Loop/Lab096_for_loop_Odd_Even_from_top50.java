package ex10_For_Loop;

public class Lab096_for_loop_Odd_Even_from_top50 {
    public static void main(String[] args) {
        //to find the even numbers from 1 to 50
        // even -> i%2 ==0
        for (int i = 0; i<= 50; i++){
            if (i % 2 ==0) {
                System.out.println("Even -> " + i);
            }else{
                System.out.println("odd-> " + i);
            }
        }
    }
}
