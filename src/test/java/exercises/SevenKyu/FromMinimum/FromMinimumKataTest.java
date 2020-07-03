package exercises.SevenKyu.FromMinimum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FromMinimumKataTest {

    @Test
    void minValueTest() {
        assertEquals(13, FromMinimumKata.minValue(new int[] {1,3,1}));
        assertEquals(457, FromMinimumKata.minValue(new int[] {4, 7, 5, 7}));
        assertEquals(148, FromMinimumKata.minValue(new int[] {4, 8, 1, 4}));
        assertEquals(579, FromMinimumKata.minValue(new int[] {5, 7, 9, 5, 7}));
        assertEquals(678, FromMinimumKata.minValue(new int[] {6, 7, 8, 7, 6, 6}));
    }
}