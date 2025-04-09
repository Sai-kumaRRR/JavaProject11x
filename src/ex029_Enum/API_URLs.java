package ex029_Enum;

public enum API_URLs {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    API_URLs(String url){
        this.url = url;

    }
    String getUrl(){
        return this.url;

    }
}
