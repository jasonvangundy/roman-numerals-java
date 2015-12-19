package katas;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RomanNumerals {

    private static List<Mapping> mappings;
    static {
        mappings = new ArrayList<Mapping>();
        mappings.add(new Mapping(1000, "M"));
        mappings.add(new Mapping(900, "CM"));
        mappings.add(new Mapping(500, "D"));
        mappings.add(new Mapping(100, "C"));
        mappings.add(new Mapping(90, "XC"));
        mappings.add(new Mapping(50, "L"));
        mappings.add(new Mapping(10, "X"));
        mappings.add(new Mapping(9, "IX"));
        mappings.add(new Mapping(5, "V"));
        mappings.add(new Mapping(4, "IV"));
        mappings.add(new Mapping(1, "I"));
    }

    public String arabicToRomanNumeral(int num) {
        String numerals = "";
        Iterator<Mapping> iterator = mappings.iterator();

        while (iterator.hasNext() && num > 0) {
            Mapping mapping = iterator.next();
            int numberOfNumerals = num / mapping.getNum();
            for (int i = 0; i < numberOfNumerals; i++) {
                numerals += mapping.getNumeral();
                num -= mapping.getNum();
            }
        }
        return numerals;
    }

    public int romanNumeralToArabic(String romanNumeral) {
        return 1;
    }
}
