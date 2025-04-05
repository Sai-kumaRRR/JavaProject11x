package ex023_Access_modifier;

public class Lab181_Access_modifier_01 {

}
class Father{
    private int gold = 10;
    protected int bhk3 = 10;
    int car = 1;

}
class Sn extends Father{

    void getGold(){
        // system.out.println(gold);
        System.out.println(bhk3);

    }
}
