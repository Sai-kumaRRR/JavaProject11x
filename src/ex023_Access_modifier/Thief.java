 package ex023_Access_modifier;

public class Thief {
    public static void main(String[] args) {
        Cop theif = new Cop(100);
       theif.canIShoot();
        System.out.println(theif.gun);
    }
}
