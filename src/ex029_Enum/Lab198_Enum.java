package ex029_Enum;

public class Lab198_Enum {
    public static void main(String[] args) {
        System.out.println(Day.Friday);
        System.out.println(PROJECT_URLs.katalon);

        //  A a = newA();
     //   System.out.println(a.days[4]);


    }
}
// class A{
// String[] days = {"mon","tue","wed","thr","fri","sat","sun"}
//}
 enum Day{
    sunday,monday,tuesday,wednesday,thrusday,friday,satrday,sunday
}
enum PROJECT_URLs{
    google,restassured,katalon,vwo

        }