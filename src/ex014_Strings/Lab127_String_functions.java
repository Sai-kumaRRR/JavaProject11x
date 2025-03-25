package ex014_Strings;

public class Lab127_String_functions {
    public static void main(String[] args) {
        String name = "SAI";
        System.out.println(name.length());
        System.out.println(name.charAt(3));

          //  System.out.println(name.charAt(10)); // StringIndexOutboundsException.


        // concat

        System.out.println(name.concat("kumar"));

        // contains
        System.out.println(name.contains("om"));

        // equals
        System.out.println(name.equals("abhi"));

        //equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("abhi"));

        //length()
        System.out.println(name.length());

        //replace( , )
        System.out.println(name.replace('n', 'N'));


        // split()
        String name4  ="alamurisai@123.com";

        StringBuilder stringBuilder = new StringBuilder("abhi");
        System.out.println(stringBuilder);


        StringBuilder sb = new StringBuilder("Hii");
        System.out.println(sb.toString());


        // substring(, )
        System.out.println(name.substring(1 , 3));

        //toLowerCase()
        System.out.println("ABHI".toLowerCase());

        // to UpperCase()
        System.out.println("abhi".toUpperCase());

        // startsWith()
        System.out.println(name.startsWith("s"));


        }
}
