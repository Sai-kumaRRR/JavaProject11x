package ex014_Strings;

public class Lab132_String_builder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append("programming");
        System.out.println(sb);
        sb.delete(5,16); // delete the substring
        System.out.println(sb);
        sb.replace(0 , 4 , "C++");
        System.out.println(sb);

    }
}
