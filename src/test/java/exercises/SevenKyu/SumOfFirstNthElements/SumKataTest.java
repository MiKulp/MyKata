package exercises.SevenKyu.SumOfFirstNthElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumKataTest {

    @Test
    void seriesSum() {
        assertEquals("1.77", SumKata.seriesSum(9));
        assertEquals("1.94", SumKata.seriesSum(15));
    }
}