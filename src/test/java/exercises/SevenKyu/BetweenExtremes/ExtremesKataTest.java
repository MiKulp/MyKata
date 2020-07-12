package exercises.SevenKyu.BetweenExtremes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtremesKataTest {

    @Test
    public void fixedTest() {
        assertEquals(42, ExtremesKata.betweenExtremes(new int[]{21, 34, 54, 43, 26, 12}));
        assertEquals(99, ExtremesKata.betweenExtremes(new int[]{-1, -41, -77, -100}));
    }
}