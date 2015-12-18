package katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void testReturnsSingleIForOne() throws Exception {
        assertEquals("I", new RomanNumerals().get(1));
    }
}
