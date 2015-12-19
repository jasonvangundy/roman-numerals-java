package katas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsToArabicTest {

    private RomanNumerals romanNumerals;

    @Before
    public void setUp() throws Exception {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void testTranslatesSingleI() throws Exception {
        assertEquals(1, romanNumerals.romanNumeralToArabic("I"));
    }

    @Test
    public void testTranslatesMultipleIs() throws Exception {
        assertEquals(3, romanNumerals.romanNumeralToArabic("III"));
    }

    @Test
    public void testTranslatesV() throws Exception {
        assertEquals(5, romanNumerals.romanNumeralToArabic("V"));
    }

    @Test
    public void testTranslatesVAndICombination() throws Exception {
        assertEquals(8, romanNumerals.romanNumeralToArabic("VIII"));
    }

    @Test
    public void testTranslatesIV() throws Exception {
        assertEquals(4, romanNumerals.romanNumeralToArabic("IV"));
    }

    @Test
    public void testTranslatesX() throws Exception {
        assertEquals(10, romanNumerals.romanNumeralToArabic("X"));
    }

    @Test
    public void testTranslatesIX() throws Exception {
        assertEquals(9, romanNumerals.romanNumeralToArabic("IX"));
    }

    @Test
    public void testTranslatesL() throws Exception {
        assertEquals(52, romanNumerals.romanNumeralToArabic("LII"));
    }

    @Test
    public void testTranslatesXL() throws Exception {
        assertEquals(42, romanNumerals.romanNumeralToArabic("XLII"));
    }

    @Test
    public void testTranslatesC() throws Exception {
        assertEquals(102, romanNumerals.romanNumeralToArabic("CII"));
    }

    @Test
    public void testTranslatesXC() throws Exception {
        assertEquals(92, romanNumerals.romanNumeralToArabic("XCII"));
    }

    @Test
    public void testTranslatesD() throws Exception {
        assertEquals(502, romanNumerals.romanNumeralToArabic("DII"));
    }

    @Test
    public void testTranslatesCD() throws Exception {
        assertEquals(402, romanNumerals.romanNumeralToArabic("CDII"));
    }

    @Test
    public void testTranslatesM() throws Exception {
        assertEquals(1002, romanNumerals.romanNumeralToArabic("MII"));
    }

    @Test
    public void testTranslatesCM() throws Exception {
        assertEquals(902, romanNumerals.romanNumeralToArabic("CMII"));
    }

    @Test
    public void testAdditionalKataProvidedTestCases() throws Exception {
        assertEquals(1066, romanNumerals.romanNumeralToArabic("MLXVI"));
        assertEquals(1989, romanNumerals.romanNumeralToArabic("MCMLXXXIX"));
    }
}
