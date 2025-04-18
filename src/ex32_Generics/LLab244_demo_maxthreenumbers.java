package ex32_Generics;

public class LLab244_demo_maxthreenumbers {
    public static void main(String[] args) {


        // 34 , 58 , 86
        // 4.4 , 6.8 , 7.6
        // a , b , c

        //  int maxPut = maximumNumberOf(34 , 58 , 86);
        //int maxPut2 = maximumNumberOf(4.4 ,6.8 , 7.6);
        // System.out.println(maxPut);


    }

    public static int maxiumNumberOf(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;


    }
    public static String maxiumNumberOf(String x , String y , String z) {
        String max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far

        }
        if (z. compareTo(max) > 0) {
            max = z; // z is the largest now


        }
        return max; // returns the largest object
    }


}