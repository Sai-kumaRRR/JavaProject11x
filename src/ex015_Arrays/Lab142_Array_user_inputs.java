package ex015_Arrays;

public class Lab142_Array_user_inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array(int) only");
        int size = sc.nextInt();

        // int[] numbers_marks = new int[size];
        // float [] numbers_marks = new float[size];


        String[] numbers_marks = new String[size];


        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println("enter this numbers");
            //   numbers_marks[i] = sc.nextfloat();
            numbers_marks[i] = sc.next();
        }
        System.out.println("-----");

        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println(numbers_marks[i]);

        }
        sc.close();


    }


}




