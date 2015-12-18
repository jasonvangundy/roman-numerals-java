package katas;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RomanNumerals {

    private static List<Mapping> mappings;
    static {
        mappings = new ArrayList<Mapping>();
        mappings.add(new Mapping(10, "X"));
        mappings.add(new Mapping(9, "IX"));
        mappings.add(new Mapping(5, "V"));
        mappings.add(new Mapping(4, "IV"));
        mappings.add(new Mapping(1, "I"));
    }

    public String get(int num) {
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
}
