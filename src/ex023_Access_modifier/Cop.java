package ex023_Access_modifier;

public class Cop {
    public int gun;
    String iCard;

    //Param Con
      public Cop(int bullet){
        this.gun = bullet;

    }
    // method / Behav
    protected void canIShoot(){
        System.out.println("yes can shoot!");
    }
}
