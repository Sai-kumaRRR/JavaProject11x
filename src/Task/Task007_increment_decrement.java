package Task;

public class Task007_increment_decrement {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a +a++ +a--);

        //line 5. a value of = 20
        // line 6. --a value of = 19
        // line 7 . 19 +19( a++ )  value of = 20
        // line 8. 19 + 19 + 20   : system will print value of  -> 58


        System.out.println(a);

        // line no.8 value of a = 19

    }
}
