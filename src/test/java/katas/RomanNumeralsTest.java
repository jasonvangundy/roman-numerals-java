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
}
