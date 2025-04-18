package ex32_Generics;

public class Lab245_demo2 {
    public static <Dt extends Comparable<DATATYPE>, DATATYPE, CUSTOMDATATYPE> CUSTOMDATATYPECLASS maximum(DATATYPE a, CUSTOMDATATYPECLASS b, DATATYPE C) {
        CUSTOMDATATYPE max = a;
        if (0 < b.compareTo(max)) {
            max=b;


            if (c.compareTo(max) > 0) {
                max = c;
            }
            return max;
        }
        public static void main[] args) {
            System.out.println(maximum(34, 58, 76));
            System.out.println(maximum(4.4, 5.8, 7.6));
            System.out.println(maximum(a, b, c));
        }
    }
}    