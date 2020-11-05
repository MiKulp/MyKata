package exercises.SixKyu.DashatizeIt;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DashatizeKataTest {

    DashatizeKata kata;

    @BeforeEach
    void setUp() {
        kata = new DashatizeKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    void testBasic() {
        assertEquals("2-7-4", kata.dashatize(274));
        assertEquals("5-3-1-1", kata.dashatize(5311));
        assertEquals("86-3-20", kata.dashatize(86320));
        assertEquals("9-7-4-3-02", kata.dashatize(974302));
    }

    @Test
    public void testWeird() {
        assertEquals("0", kata.dashatize(0));
        assertEquals("1", kata.dashatize(-1));
        assertEquals("28-3-6-9", kata.dashatize(-28369));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("2-1-4-7-48-3-64-7", kata.dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", kata.dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", kata.dashatize(-1111111111));
    }
}