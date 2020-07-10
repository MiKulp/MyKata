package exercises.SixKyu.DataReverse;

import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DataReverseKataTest {

    @Test
    public void Test1() {
        int[] data1 = {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0};
        int[] data2 = {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        assertArrayEquals(data2, DataReverseKata.DataReverse(data1));
    }

    @Test
    public void Test2() {
        int[] data1 = { 0, 0, 1, 1,
                        0, 1, 1, 0,
                        0, 0, 1, 0,
                        1, 0, 0, 1};

        int[] data2 = {0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        assertArrayEquals(data2, DataReverseKata.DataReverse(data1));

    }
}