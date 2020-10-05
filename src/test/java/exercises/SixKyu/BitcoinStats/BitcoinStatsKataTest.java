package exercises.SixKyu.BitcoinStats;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitcoinStatsKataTest {

    BitcoinStatsKata kata;

    @BeforeEach
    void setUp() {
        kata = new BitcoinStatsKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    void getMinAvgMaxTest() {
        int discard = 2;
        double[][] data = {{800,1200,2100,4100,1300,700}, {1000,1500,4500,5000,5800,2000,1500}};
        double[][] expect = {{2100,3100,4100}, {4500,5100,5800}, {2100,4300,5800}};
        double[][] actual = kata.getMinAvgMax(discard , data);
        assertArrayEquals(expect, actual);
    }
}