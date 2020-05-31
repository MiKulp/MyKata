package exercises.SevenKyu.ATM;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class ATMkataTest {

    @DisplayName("positive test")
    @Test
    public void testATMexpectedTrue() {
        assertEquals(4, new ATMkata().solve(770));
        assertEquals(2, new ATMkata().solve(550));
        assertEquals(1, new ATMkata().solve(10));
        assertEquals(2, new ATMkata().solve(1000));
    }

    @DisplayName("negative test")
    @Test
    public void testATMexpectedFalse() {
        assertEquals(-1, new ATMkata().solve(125));
        assertEquals(-1, new ATMkata().solve(238));
    }


}