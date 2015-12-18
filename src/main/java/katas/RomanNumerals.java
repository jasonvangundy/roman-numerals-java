package katas;


public class RomanNumerals {
    public String get(int num) {
        String numerals = "";
        for(int i=0; i < num; i++) {
            numerals += "I";
        }
        return numerals;
    }
}
