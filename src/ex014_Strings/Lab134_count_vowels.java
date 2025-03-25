package ex014_Strings;

public class Lab134_count_vowels {
    public static void main(String[] args) {
        String input = "java program to count vowels and consonants";
        int vowels =0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch =='a' || ch == 'e' || ch =='i' || ch == 'o'  || ch == 'u') {
                vowels++;

            } else{
                consonants++;
            }
            System.out.println("number of vowels : " + vowels);
            System.out.println("number of consonants:" + consonants);
        }


    }

}
