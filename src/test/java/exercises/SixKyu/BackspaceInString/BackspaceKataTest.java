package exercises.SixKyu.BackspaceInString;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceKataTest {

    BackspaceKata kata;

    @BeforeEach
    void setUp() {
        kata = new BackspaceKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    @DisplayName("typical test")
    void cleanString() {
        Assertions.assertEquals("ac", kata.cleanString("abc#d##c"));
        Assertions.assertEquals("", kata.cleanString("abc##d######"));
    }

    @Test
    @DisplayName("only Backspace")
    void cleanStringSd () {
        Assertions.assertEquals("", kata.cleanString("######"));
    }
}