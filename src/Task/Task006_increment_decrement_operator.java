package Task;

public class Task006_increment_decrement_operator {
    public static void main(String[] args) {
       int a = 10;
        System.out.println(++a + a++ + a++);

        //  line no 6. 10 / NA
        // ++a - value of a -> 11
        //  11 - (a++)  after addition value of -> 12
        // 11 + 11 + (a++) 12 after again addition value include of -> 13


        // 11 + 11 + 12 -> 34

        System.out.println(a);

        // value of -> 13
        // output -> 34  and 13
    }
}
