package ex015_Arrays;

import java.util.Arrays;

public class Lab145_interview_2nd_Array {
    public static void main(String[] args) {
        // find second largest number in array

        int[ ]numbers = { 12, 34 , 10 , 1 , 100 , 3 , 4 , 32 };
        // 100 , 34

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
        System.out.println(numbers[numbers.length-3]);

    }
}
