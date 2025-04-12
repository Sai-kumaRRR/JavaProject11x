package ex32_Generics;

public class Lab222_generics_fix {
    public static void main(String[] args) {
        temp_sum(3,4);
        temp_sum(3.34,5.86);
        temp_sum("SAI","kumar");

    }
    static<G> G temp_sum(G a , G b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
