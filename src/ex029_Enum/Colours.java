package ex029_Enum;

  public enum Colours {
   RED("#FF000"),
   GREEN("#61FF33"),
   BLUE("#3377FF"),
   YELLOW("#4477FF");

  private String hexCode;
   Colors(String hexCode){
    this.hexCode = hexCode;

}
String getHexCode(){
    return this.hexCode;
}




}
