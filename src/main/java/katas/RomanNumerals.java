package katas;


public class RomanNumerals {
    public String get(int num) {
        String numerals = "";

        if (num / 5 >= 1) {
            numerals += "V";
            num -= 5;
        }

        for (int i=0; i < num; i++) {
            numerals += "I";
        }
        return numerals;
    }
}
