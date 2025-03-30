package Task;

public class Task011_maximum_element_array {
    public static void main(String[] args) {

    }

    static int give_me_max(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;

    }


}