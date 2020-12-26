package exercises.SevenKyu.TheSpeedLetters;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedLettersKataTest {

    SpeedLettersKata kata;

    @BeforeEach
    void setUp() {
        kata = new SpeedLettersKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    void speedify() {

       assertEquals("A                         Z",  kata.speedify("AZ"));

    }

    @Test
    void speedify1() {

        assertEquals("A  C  E",  kata.speedify("ACE"));

    }

    @Test
    void speedify2() {

        assertEquals("A B C",  kata.speedify("ABC"));

    }

    @Test
    void speedify3() {

        assertEquals("     E H    DLL   OLO   R  W",  kata.speedify("HELLOWORLD"));

    }

    @Test
    void speedify4() {

        assertEquals("A B C",  kata.speedify("ABC"));

    }


}