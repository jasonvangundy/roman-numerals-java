package katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsToArabicTest {

    @Test
    public void testTranslatesSingleI() throws Exception {
        assertEquals(1, new RomanNumerals().romanNumeralToArabic("I"));
    }

    @Test
    public void testTranslatesMultipleIs() throws Exception {
        assertEquals(3, new RomanNumerals().romanNumeralToArabic("III"));
    }

    @Test
    public void testTranslatesV() throws Exception {
        assertEquals(5, new RomanNumerals().romanNumeralToArabic("V"));
    }

    @Test
    public void testTranslatesVAndICombination() throws Exception {
        assertEquals(8, new RomanNumerals().romanNumeralToArabic("VIII"));
    }
}
