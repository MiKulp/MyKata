package exercises.SevenKyu.OddOrEven;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddKataTest {

    @Test
    @DisplayName("expected result = odd")
    void oddOrEvenResultOdd() {
        assertEquals("odd", EvenOrOddKata.oddOrEven(new int[]{2, 5, 34, 6}));
    }

    @Test
    @DisplayName("expected result = even")
    void oddOrEvenResultEven() {
        assertEquals("even", EvenOrOddKata.oddOrEven(new int[]{5, 10, 25, 2}));
    }

    @Test
    @DisplayName("empty list, expected result = even")
    void oddOrEvenOddResult() {
        assertEquals("even", EvenOrOddKata.oddOrEven(new int[]{}));
    }
}