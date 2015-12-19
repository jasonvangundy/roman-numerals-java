package katas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArabicToRomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @Before
    public void setUp() throws Exception {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void testReturnsSingleIForOne() throws Exception {
        assertEquals("I", romanNumerals.arabicToRomanNumeral(1));
    }

    @Test
    public void testReturnsIsForMultiples() throws Exception {
        assertEquals("III", romanNumerals.arabicToRomanNumeral(3));
    }

    @Test
    public void testReturnsVForFive() throws Exception {
        assertEquals("V", romanNumerals.arabicToRomanNumeral(5));
    }

    @Test
    public void testReturnsVAndIsForEight() throws Exception {
        assertEquals("VIII", romanNumerals.arabicToRomanNumeral(8));
    }

    @Test
    public void testRepresentsFourWithIV() throws Exception {
        assertEquals("IV", romanNumerals.arabicToRomanNumeral(4));
    }

    @Test
    public void testReturnsXForTen() throws Exception {
        assertEquals("X", romanNumerals.arabicToRomanNumeral(10));
    }

    @Test
    public void testRepresentsNineWithIX() throws Exception {
        assertEquals("IX", romanNumerals.arabicToRomanNumeral(9));
    }

    @Test
    public void testRepresents14WithXIV() throws Exception {
        assertEquals("XIV", romanNumerals.arabicToRomanNumeral(14));
    }

    @Test
    public void testCanHandleMoreXVICombinations() throws Exception {
        assertEquals("XXXIX", romanNumerals.arabicToRomanNumeral(39));
        assertEquals("XXXVIII", romanNumerals.arabicToRomanNumeral(38));
    }

    @Test
    public void testTranslates50Something() throws Exception {
        assertEquals("LXV", romanNumerals.arabicToRomanNumeral(65));
    }

    @Test
    public void testTranslates40Something() throws Exception {
        assertEquals(42, new RomanNumerals().romanNumeralToArabic("XLII"));
    }

    @Test
    public void testTranslates100Something() throws Exception {
        assertEquals("CXXX", romanNumerals.arabicToRomanNumeral(130));
    }

    @Test
    public void testTenIsSubtractedFrom100For90Something() throws Exception {
        assertEquals("XCV", romanNumerals.arabicToRomanNumeral(95));
    }

    @Test
    public void testTranslates500Something() throws Exception {
        assertEquals("DCCXXXII", romanNumerals.arabicToRomanNumeral(732));
    }

    @Test
    public void testTranslates1000Something() throws Exception {
        assertEquals("MCCVI", romanNumerals.arabicToRomanNumeral(1206));
    }

    @Test
    public void testTenIsSubtractedFrom1000For900Something() throws Exception {
        assertEquals("CMXII", romanNumerals.arabicToRomanNumeral(912));
    }

    @Test
    public void testAdditionalKataProvidedTestCases() throws Exception {
        assertEquals("MLXVI", romanNumerals.arabicToRomanNumeral(1066));
        assertEquals("MCMLXXXIX", romanNumerals.arabicToRomanNumeral(1989));
    }
}
