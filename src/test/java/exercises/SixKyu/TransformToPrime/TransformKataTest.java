package exercises.SixKyu.TransformToPrime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformKataTest {

    @Test
    public void checkSmallArraySize() {
        assertEquals(1, TransformKata.minimumNumber(new int[]{3, 1, 2}));
        assertEquals(0, TransformKata.minimumNumber(new int[]{5, 2}));
        assertEquals(0, TransformKata.minimumNumber(new int[]{1, 1, 1}));
    }

    @Test
    public void checkLargerArraySize() {
        assertEquals(5, TransformKata.minimumNumber(new int[]{2, 12, 8, 4, 6}));
        assertEquals(2, TransformKata.minimumNumber(new int[]{50, 39, 49, 6, 17, 28}));
    }
}