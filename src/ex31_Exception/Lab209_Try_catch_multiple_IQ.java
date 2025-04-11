package ex31_Exception;

public class Lab209_Try_catch_multiple_IQ {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a = 10 / 0;

        }catch (Exception e){
            System.out.println("ARE YOU FOOL !!!");

        }
        // not possible as big exception is used before
        //catch (arithmetic Exception e){
        // system.out.println("are you fool ")
        // }
        System.out.println("2");
    }

}
