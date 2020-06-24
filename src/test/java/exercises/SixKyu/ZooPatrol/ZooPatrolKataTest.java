package exercises.SixKyu.ZooPatrol;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooPatrolKataTest {

    ZooPatrolKata zoo;

    @BeforeEach
    void setUp() {
        zoo = new ZooPatrolKata();
    }

    @AfterEach
    void tearDown() {
        zoo = null;
    }

    @Test
    void findMissingNumber() {
        assertEquals(2, zoo.findMissingNumber(new int[] {1, 3}));
        assertEquals(1, zoo.findMissingNumber(new int[] {2, 3, 4}));
        assertEquals(12, zoo.findMissingNumber(new int[] {13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8}));
    }
}