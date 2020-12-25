package exercises.SevenKyu.OverTheRoadKata;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverRoadKataTest {

    OverRoadKata kata;

    @BeforeEach
    void setUp() {
        kata = new OverRoadKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    void overTheRoad() {
        assertEquals(6, kata.overTheRoad(1, 3));
        assertEquals(4, kata.overTheRoad(3, 3));
        assertEquals(5, kata.overTheRoad(2, 3));
        assertEquals(8, kata.overTheRoad(3, 5));
        assertEquals(16, kata.overTheRoad(7, 11));
    }
}