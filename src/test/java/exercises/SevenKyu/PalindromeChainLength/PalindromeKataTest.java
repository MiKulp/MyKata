package exercises.SevenKyu.PalindromeChainLength;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeKataTest {

    PalindromeKata kata;

    @BeforeEach
    void setUp() {
        kata = new PalindromeKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    void nonPalindrome() {
        assertEquals(1, kata.palindromeChainLength(10));
        assertEquals(1, kata.palindromeChainLength(134));
        assertEquals(4, kata.palindromeChainLength(87));
        assertEquals(7, kata.palindromeChainLength(2897));
        assertEquals(24, kata.palindromeChainLength(89));
    }

    @Test
    public void testPalindromePositive() {
        assertEquals(0, kata.palindromeChainLength(1));
        assertEquals(0, kata.palindromeChainLength(88));
        assertEquals(0, kata.palindromeChainLength(393));
    }
}