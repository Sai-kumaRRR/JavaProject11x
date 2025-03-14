package Task;

public class Lab003_mathmatics {
    public static void main(String[] args) {
        //calculate with the below given values

        int x = 10, y=10, z =10;
        x = (int) Math.pow(10,2);
        y = (int) Math.pow(10,2);
        z = Math.abs(z);

        float result = (float) Math.cbrt(x+y-z);
        System.out.println("result of  is : " + result);
    }
}
