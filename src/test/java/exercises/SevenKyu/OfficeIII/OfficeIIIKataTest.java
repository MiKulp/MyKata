package exercises.SevenKyu.OfficeIII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeIIIKataTest {

    @Test
    void broken() {
        assertEquals("0", OfficeIIIKata.broken("1"));
        assertEquals("01111111010010000001100110111", OfficeIIIKata.broken("10000000101101111110011001000"));
        assertEquals("011101", OfficeIIIKata.broken("100010"));
    }
}