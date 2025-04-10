package ex30_Wrapper_class;

public class Lab204_Wrapper_04 {
    public static void main(String[] args) {


    Mobile iphone = new Mobile(1, "iphone 16", 120000.00);
    Mobile samsung = new Mobile(2, "ultra", 135000.00);

    iphone.setPrice(200000.89);
    iphone.display();
    samsung.display();

        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirplaneMode();
}

}
class Mobile extends OldPhone{
    private Integer phone;
    private String name;
    private Double price;
    static String mobile_carrier = " airtel";


    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {

        this.price = price;
    }

    static void switchOnAirplaneMode() {
        System.out.println("Common Airplane mode");

    }
    void priceCharge(Integer price){
        System.out.println("change price in integer");

    }
    void priceChange(Double price){
        System.out.println("charge price in decimal");
    }
    @Override
    void calling(){
        System.out.println("dial pad touch now!!!");
    }
    class OldPhone{

        void calling(){
            System.out.println("dial pad");

        }
}


    Mobile(){
        System.out.println("DC");


    }
    void display(){
        System.out.println(this.name+this.phone+this.price);

    }
}
class OldPhone implements SIMCard{
    void calling(){
        System.out.println("dial pad");

    }

    @Override
    public void enterCard() {
        System.out.println("Card entered");
    }
}
interface SIMCard{
    void enterCard();
}