package ex015_Arrays;

public class Lab141_Arrays_min02 {
    public static void main(String[] args) {
        // min
        int min_output = give_me_min(array);
        System.out.println(min_output);


    }


    private static int give_me_min(int[] array) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                min = array[i];


            }

        }

        return min;


    }

}
