package Task;

public class Task002_calculator {
    public static void main(String[] args) {
        int grade = 90;
        String result = (grade >= 90 && grade <= 100) ?"A":
        (grade >= 80 && grade <= 89) ? "B":
                (grade >= 70 && grade <= 79) ? "C":
                        (grade >= 60 && grade <= 69) ? "D": "F";
        System.out.println("your Grade is :" + result);

    }
}
