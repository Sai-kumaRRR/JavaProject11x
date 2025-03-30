package ex014_Strings;

   public class Lab131_StringBuilder03
   {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");  // Appends text
        sb.reverse();
        System.out.println(sb);

    }


}