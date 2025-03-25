package ex014_Strings;

public class Lab128_StringBuilder_VB_Buffer {
    public static void main(String[] args) {

        // string -90%
        String s0 = "sai";
        String s1 = new String( "sai");


        StringBuffer  stringBuffer = new StringBuffer("sai");
        StringBuilder stringBuilder = new StringBuilder("sai");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);


    }
}
