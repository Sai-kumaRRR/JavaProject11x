package ex021_Polymorphism;

public class Lab178_Method_Overriding {

    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();


          firefox f1     = new firefox();
        f1.openBrowser();

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();

        // Dynamic Dispatch
        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();

        CommonToAll c3 = new firefox();
        c3.openBrowser();

        // firefox ff = new chromeTC(); not relation.

    }

}
class CommonToAll{

    void openBrowser(){
        System.out.println("open the IE Browser!");

    }

}
class ChromeTC extends CommonToAll{
    @Override
    void openBrowser() {
        System.out.println("chrome will open now!");

    }
}
class firefox extends CommonToAll{
    void openBrowser(){
        System.out.println("Firefox will start!");
    }
}





