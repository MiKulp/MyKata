package exercises.SevenKyu.SortedArr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedKataTest {

    @Test
    public void test1() {
        int[] array = new int[] {1, 2};
        assertEquals("yes, ascending", SortedKata.isSortedAndHow(array));
    }

    @Test
    public void test2() {
        int[] array = new int[] {15, 7, 3, -8};
        assertEquals("yes, descending", SortedKata.isSortedAndHow(array));
    }

    @Test
    public void test3() {
        int[] array = new int[] {4, 2, 30};
        assertEquals("no", SortedKata.isSortedAndHow(array));
    }
}