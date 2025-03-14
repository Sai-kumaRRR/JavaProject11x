package ex05_Interview;

public class Lab050_Interview_question {
    public static void main(String[] args) {

        //nested ternary
        //result = condition1 ? expression2 ? expression2 : express

        int number = 25;
        String result = (number >10) ? (number >20 ? "n>20" : "n<20") : "b";
        System.out.println(result);
    }
}
