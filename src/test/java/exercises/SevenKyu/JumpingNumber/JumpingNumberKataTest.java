package exercises.SevenKyu.JumpingNumber;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpingNumberKataTest {

    JumpingNumberKata jumpingNumberKata;

    @BeforeEach
    void setUp() {
        jumpingNumberKata = new JumpingNumberKata();
    }

    @AfterEach
    void tearDown() {
        jumpingNumberKata = null;
    }

    @Test
    void jumpingNumber() {
        String s = "Jumping!!";
        String n = "Not!!";

        assertEquals(s, jumpingNumberKata.jumpingNumber(9));
        assertEquals(s, jumpingNumberKata.jumpingNumber(34));
        assertEquals(s, jumpingNumberKata.jumpingNumber(456789));
        assertEquals(s, jumpingNumberKata.jumpingNumber(2));
        assertEquals(s, jumpingNumberKata.jumpingNumber(98765));
        assertEquals(n, jumpingNumberKata.jumpingNumber(13));
    }
}