package exercises.SevenKyu.Calculator;

import org.junit.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorKataTest {

    CalculatorKata kata;

    @BeforeEach
    void setUp() {
        kata = new CalculatorKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @DisplayName("simply test")
    @Test
    void calculateFirstTest() {
        Double actual = kata.calculate(3.2, "+", 8);

        Assert.assertEquals((Double) 11.2, actual);
        Assertions.assertEquals( -4.8, kata.calculate(3.2, "-", 8));
    }

    @DisplayName("null expected")
    @Test
    void calculateSecondTest() {
        Assertions.assertEquals( null, kata.calculate(3.2, "_", 8));
    }
}