package exercises.SixKyu.LongestSubstring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringKataTest {

    SubstringKata kata;

    @BeforeEach
    void setUp() {
        kata = new SubstringKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    void longestAlpabeticalSubstring() {
        assertEquals("as",kata.longestAlpabeticalSubstring("asd"));
        assertEquals("ab", kata.longestAlpabeticalSubstring("nab"));
        assertEquals("abcde", kata.longestAlpabeticalSubstring("abcdeapbcdef"));
        assertEquals("aaaabbbbctt", kata.longestAlpabeticalSubstring("asdfaaaabbbbcttavvfffffdf"));
        assertEquals("fgikl", kata.longestAlpabeticalSubstring("asdfbyfgiklag"));
    }
}