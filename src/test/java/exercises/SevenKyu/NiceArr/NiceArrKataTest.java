package exercises.SevenKyu.NiceArr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NiceArrKataTest {

    @Test
    public void sampleTest() {
//        assertEquals(NiceArrKata.isNice(new Integer[]{1,2,3,4,5}), true);
//        assertEquals(NiceArrKata.isNice(new Integer[]{5,4,3,2,1}), true);
//        assertEquals(NiceArrKata.isNice(new Integer[]{0,-1,-2,-3,-4}), true);
        assertEquals(NiceArrKata.isNice(new Integer[]{2,2,3,3,3}), false);
//        assertEquals(NiceArrKata.isNice(new Integer[]{1,3,5,2}), false);
//        assertEquals(NiceArrKata.isNice(new Integer[]{10,10,2,2,3}), false);
//        assertEquals(NiceArrKata.isNice(new Integer[]{}), false);
//        assertEquals(NiceArrKata.isNice(new Integer[]{1}), false);
//        assertEquals(NiceArrKata.isNice(new Integer[]{0,-1,0}), false);
    }
}