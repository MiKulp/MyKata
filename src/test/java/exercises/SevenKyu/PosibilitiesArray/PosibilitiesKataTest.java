package exercises.SevenKyu.PosibilitiesArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosibilitiesKataTest {

    @Test
    void isAllPossibilities() {
        assertTrue(PosibilitiesKata.isAllPossibilities(new int[]{0, 1, 2, 3}));
        assertFalse(PosibilitiesKata.isAllPossibilities(new int[]{1, 2, 3, 4}));
        assertFalse(PosibilitiesKata.isAllPossibilities(new int[]{6, 0, 4}));
    }
}