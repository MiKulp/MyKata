package exercises.SevenKyu.NumbersOrder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderKataTest {


    @Test
    public void arrayOf2Integers() {
        assertTrue(OrderKata.isAscOrder(new int[] {1, 2}));
        assertFalse(OrderKata.isAscOrder(new int[] {2, 1}));
    }

    @Test
    public void arrayOf3Integers() {
        assertTrue(OrderKata.isAscOrder(new int[] {1, 2, 3}));
        assertFalse(OrderKata.isAscOrder(new int[] {1, 3, 2}));
        assertTrue(OrderKata.isAscOrder(new int[] {1, 4, 13, 97, 508, 1047, 20058}));
        assertFalse(OrderKata.isAscOrder(new int[] {56, 98, 123, 67, 742, 1024, 32, 90969}));
    }

    @Test
    public void moreAdvancedCases() {
        assertTrue(OrderKata.isAscOrder(new int[] {1, 4, 13, 97, 508, 1047, 20058}));
        assertFalse(OrderKata.isAscOrder(new int[] {56, 98, 123, 67, 742, 1024, 32, 90969}));
    }

}