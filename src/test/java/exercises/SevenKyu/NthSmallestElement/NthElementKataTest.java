package exercises.SevenKyu.NthSmallestElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthElementKataTest {

    @Test
    void nthSmallest() {
        assertEquals(2, NthElementKata.nthSmallest(new int[]{3, 1, 2}, 2));
    }

    @Test
    void nthSmallestSd() {
        assertEquals(-1, NthElementKata.nthSmallest(new int[]{-5, -1, -6, -18}, 4));
    }

    @Test
    void nthSmallestTh() {
        assertEquals(2, NthElementKata.nthSmallest(new int[]{2, 169, 13, -5, 0, -1}, 4));
    }
}