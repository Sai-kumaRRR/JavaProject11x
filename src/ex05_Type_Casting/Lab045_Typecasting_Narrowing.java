package ex05_Type_Casting;

public class Lab045_Typecasting_Narrowing {
    public static void main(String[] args) {
         int val = 300;
         //byte b val; // invalid - narrowing - implicit casting is not allowed.
        byte b2 = (byte)val;  // valid - narrowing -  explicit casting - allowed

        //data loss.
        System.out.println(b2);
    }
}
