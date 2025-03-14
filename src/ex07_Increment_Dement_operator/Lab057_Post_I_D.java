package ex07_Increment_Dement_operator;

public class Lab057_Post_I_D {
    public static void main(String[] args) {
        int a = 10;
        System.out.println( ++a);
        System.out.println(a);

        //POST increment = print first and then increase
        int a_post = 10;
        System.out.println(a_post++);  // 10 , a =11
        System.out.println(a_post);

    }
}
