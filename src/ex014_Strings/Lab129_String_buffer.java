package ex014_Strings;

public class Lab129_String_buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("sai");
        StringBuffer .append(Boolean.parseBoolean(String.valueOf(Boolean.parseBoolean(String.valueOf(false)))));
        {
            System.out.println(stringBuffer);
            System.out.println(stringBuffer.reverse());


            String s1 = "Hello";
            String s2 = "World!";
            String s3 = s1 + s2; // create a new string "Hello World !
            System.out.println(s3); // output : hello world !
            System.out.println(s1);
        }
    }

}