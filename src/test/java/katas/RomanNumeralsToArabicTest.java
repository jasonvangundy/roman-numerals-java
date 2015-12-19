package katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsToArabicTest {

    @Test
    public void testTranslatesSingleI() throws Exception {
        assertEquals(1, new RomanNumerals().romanNumeralToArabic("I"));
    }
}
