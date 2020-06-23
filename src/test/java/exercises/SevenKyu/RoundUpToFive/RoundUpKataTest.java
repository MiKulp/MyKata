package exercises.SevenKyu.RoundUpToFive;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RoundUpKataTest {

    RoundUpKata roundUpKata;
    @BeforeEach
    void setUp() {
        roundUpKata = new RoundUpKata();
    }

    @AfterEach
    void tearDown() {
        roundUpKata = null;
    }

    @Test
    @DisplayName("typicall examples")
    void roundToNext5() {
        Assertions.assertEquals(5, roundUpKata.roundToNext5(2));
        Assertions.assertEquals(10, roundUpKata.roundToNext5(9));
        Assertions.assertEquals(150, roundUpKata.roundToNext5(146));
        Assertions.assertEquals(15, roundUpKata.roundToNext5(11));
    }

    @Test
    @DisplayName("less than zero examples")
    void roundToNext5Sd() {
        Assertions.assertEquals(0, roundUpKata.roundToNext5(-2));
        Assertions.assertEquals(-5, roundUpKata.roundToNext5(-5));
//        Assertions.assertEquals(-15, roundUpKata.roundToNext5(-16));
    }

    @Test
    @DisplayName("when number can be divide by 5")
    void roundToNext5Thr() {
        Assertions.assertEquals(0, roundUpKata.roundToNext5(0));
        Assertions.assertEquals(-5, roundUpKata.roundToNext5(-5));
    }
}