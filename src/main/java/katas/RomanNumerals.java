package katas;


import java.util.LinkedList;
import java.util.ListIterator;

public class RomanNumerals {

    private static LinkedList<Mapping> mappings;
    static {
        mappings = new LinkedList<Mapping>();
        mappings.add(new Mapping(10, "X"));
        mappings.add(new Mapping(9, "IX"));
        mappings.add(new Mapping(5, "V"));
        mappings.add(new Mapping(4, "IV"));
        mappings.add(new Mapping(1, "I"));
    }

    public String get(int num) {
        String numerals = "";
        ListIterator<Mapping> iterator = mappings.listIterator();

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
