package ex30_Wrapper_class;

public class Lab203_Wrapper_coversation_02 {

    public static void main(String[] args) {
         String num = "10";
         int aaa = 10;

         // String -> Wrapper -> parseX(),    Integer.perseInt(num); double.parse
        Integer a = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);

        // String to primitive
        int aa = Integer.parseInt(num);

        // String to wrapper

        // wrapper to string (toString method)
        System.out.println(a.toString());

        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());




    }
}
