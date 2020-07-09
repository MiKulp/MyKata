package exercises.SevenKyu.LostNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LostNumberKataTest {

    @Test
    void findDeletedNumber() {
        assertEquals(2, LostNumberKata.findDeletedNumber(new int[]{1,2,3,4,5}, new int[]{3,4,1,5}));
        assertEquals(5, LostNumberKata.findDeletedNumber(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{1,9,7,4,6,2,3,8}));
        assertEquals(0, LostNumberKata.findDeletedNumber(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{5,7,6,9,4,8,1,2,3}));
    }
}