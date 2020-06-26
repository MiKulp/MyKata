package exercises.FiveKyu.ClockwiseSpiral;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralKataTest {

    SpiralKata kata;

    @BeforeEach
    void setUp() {
        kata = new SpiralKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    void createSpiralSimplyTest() {

        int[][] expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};

        Assert.assertArrayEquals(expected, kata.createSpiral(3));
    }
}