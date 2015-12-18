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
}
