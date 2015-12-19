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

    @Test
    public void testTranslatesIV() throws Exception {
        assertEquals(4, new RomanNumerals().romanNumeralToArabic("IV"));
    }

    @Test
    public void testTranslatesX() throws Exception {
        assertEquals(10, new RomanNumerals().romanNumeralToArabic("X"));
    }

    @Test
    public void testTranslatesIX() throws Exception {
        assertEquals(9, new RomanNumerals().romanNumeralToArabic("IX"));
    }

    @Test
    public void testTranslatesL() throws Exception {
        assertEquals(52, new RomanNumerals().romanNumeralToArabic("LII"));
    }

    @Test
    public void testTranslatesXL() throws Exception {
        assertEquals(42, new RomanNumerals().romanNumeralToArabic("XLII"));
    }

    @Test
    public void testTranslatesC() throws Exception {
        assertEquals(102, new RomanNumerals().romanNumeralToArabic("CII"));
    }

    @Test
    public void testTranslatesXC() throws Exception {
        assertEquals(92, new RomanNumerals().romanNumeralToArabic("XCII"));
    }

    @Test
    public void testTranslatesD() throws Exception {
        assertEquals(502, new RomanNumerals().romanNumeralToArabic("DII"));
    }

    @Test
    public void testTranslatesCD() throws Exception {
        assertEquals(402, new RomanNumerals().romanNumeralToArabic("CDII"));
    }

    @Test
    public void testTranslatesM() throws Exception {
        assertEquals(1002, new RomanNumerals().romanNumeralToArabic("MII"));
    }

    @Test
    public void testTranslatesCM() throws Exception {
        assertEquals(902, new RomanNumerals().romanNumeralToArabic("CMII"));
    }
}
