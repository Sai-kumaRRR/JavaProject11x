package ex028_Static;

public class Lab196_Real {
    public static void main(String[] args) {


     ATB.doAssignment();
      ATB.joinZoomForClass();

       ATB.sai = new ATB();
       sai.seName(":sai");
        sai.setPone("987654321");

        ATB lucky = new ATB();
 lucky.setName("lucky");
 lucky.setPhone("987654321");



    }

}
class ATB{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    static {
        System.out.println("load the class?, i will execute");


    }
    {
        System.out.println("IIB - this is called when object is created");
        // what is the purpose?
        // here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation

    }
    private String name; // non static
    private String phone;
    static String courseName = "ATB11x";
    static String mentorName = "SAI";

    static void doAssignment() {
        // System.out.println(phone); static method can't access the non static
        System.out.println("Do Assignment");

    }
    static void joinZoomForClass() {
        System.out.println("class joined!!!");
    }
    void howTheyAssignment(){
        System.out.println("it is different");



    }



}