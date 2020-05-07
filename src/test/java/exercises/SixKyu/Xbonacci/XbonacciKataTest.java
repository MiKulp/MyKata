package exercises.SixKyu.Xbonacci;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XbonacciKataTest {
    private XbonacciKata xbonacciKata;

    @Before
    public void setUp () throws Exception {
        xbonacciKata = new XbonacciKata();
    }

    @After
    public void tearDown () throws Exception {
        xbonacciKata = null;
    }

    @Test
    void basicTests() {
        assertArrayEquals(new double []{0,1,1,2,3,5,8,13,21,34}, xbonacciKata.xbonacci(new double []{0,1},10));
        assertArrayEquals(new double []{1,1,2,3,5,8,13,21,34,55}, xbonacciKata.xbonacci(new double []{1,1},10));
        assertArrayEquals(new double []{0,0,0,0,1,1,2,4,8,16}, xbonacciKata.xbonacci(new double []{0,0,0,0,1},10));
        assertArrayEquals(new double []{1,0,0,0,0,0,1,2,3,6}, xbonacciKata.xbonacci(new double []{1,0,0,0,0,0,1},10));
    }

    private void assertArraysEquals (double[] expecteds, double[] actuals) {
        for (int i = 0 ; i < actuals.length ; i++) {
            assertEquals(expecteds[i], actuals[i], 1e-10);
        }
    }
}