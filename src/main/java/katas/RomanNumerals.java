package katas;


import java.util.LinkedList;
import java.util.ListIterator;

public class RomanNumerals {

    public static final int MAX_ALLOWED_NUMERAL_REPETITION = 3;
    private static LinkedList<Mapping> mappings;
    static {
        mappings = new LinkedList<Mapping>();
        mappings.add(new Mapping(10, "X"));
        mappings.add(new Mapping(5, "V"));
        mappings.add(new Mapping(1, "I"));
    }

    public String get(int num) {
        String numerals = "";
        ListIterator<Mapping> iterator = mappings.listIterator();

        while (iterator.hasNext()) {
            Mapping mapping = iterator.next();
            int numberOfNumerals = num / mapping.getNum();
            if (numberOfNumerals > MAX_ALLOWED_NUMERAL_REPETITION) {
                numerals += mapping.getNumeral();
                iterator.previous();
                numerals += iterator.previous().getNumeral();
                num -= numberOfNumerals;
                numberOfNumerals = 0;
            }

            for (int i = 0; i < numberOfNumerals; i++) {
                numerals += mapping.getNumeral();
                num -= mapping.getNum();
            }
        }
        return numerals;
    }
}
