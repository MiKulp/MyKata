package exercises.SixKyu.WhichAreInKata;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhichKataTest {

    WhichKata kata;

    @BeforeEach
    void setUp() {
        kata = new WhichKata();

    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    void inArray() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, kata.inArray(a, b));

    }
}