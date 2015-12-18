package katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void testReturnsSingleIForOne() throws Exception {
        assertEquals("I", new RomanNumerals().get(1));
    }

    @Test
    public void testReturnsIsForMultiples() throws Exception {
        assertEquals("III", new RomanNumerals().get(3));
    }

    @Test
    public void testReturnsVForFive() throws Exception {
        assertEquals("V", new RomanNumerals().get(5));
    }

    @Test
    public void testReturnsVAndIsForEight() throws Exception {
        assertEquals("VIII", new RomanNumerals().get(8));
    }

    @Test
    public void testRepresentsFourWithIV() throws Exception {
        assertEquals("IV", new RomanNumerals().get(4));
    }

    @Test
    public void testReturnsXForTen() throws Exception {
        assertEquals("X", new RomanNumerals().get(10));
    }

    @Test
    public void testRepresentsNineWithIX() throws Exception {
        assertEquals("IX", new RomanNumerals().get(9));
    }

    @Test
    public void testRepresents14WithXIV() throws Exception {
        assertEquals("XIV", new RomanNumerals().get(14));
    }

    @Test
    public void testCanHandleMoreXVICombinations() throws Exception {
        assertEquals("XXXIX", new RomanNumerals().get(39));
        assertEquals("XXXVIII", new RomanNumerals().get(38));
    }

    @Test
    public void testTranslates50Something() throws Exception {
        assertEquals("LXV", new RomanNumerals().get(65));
    }

    @Test
    public void testTranslates100Something() throws Exception {
        assertEquals("CXXX", new RomanNumerals().get(130));
    }

    @Test
    public void testTenIsSubtractedFrom100For90Something() throws Exception {
        assertEquals("XCV", new RomanNumerals().get(95));
    }

    @Test
    public void testTranslates500Something() throws Exception {
        assertEquals("DCCXXXII", new RomanNumerals().get(732));
    }
}
