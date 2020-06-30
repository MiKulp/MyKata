package exercises.SevenKyu.IndexedCapitalization;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizationKataTest {

    CapitalizationKata kata;

    @BeforeEach
    void setUp() {
        kata = new CapitalizationKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    void capitalizeTest() {
        assertEquals("aBCdeF",kata.capitalize("abcdef", new int[]{1,2,5}));
        assertEquals("aBCdeF", kata.capitalize("abcdef", new int[]{1,2,5,100}));
        assertEquals("cOdEwArs", kata.capitalize("codewars", new int[]{1,3,5,50}));
        assertEquals("abRacaDabRA", kata.capitalize("abracadabra", new int[]{2,6,9,10}));
        assertEquals("codewArriors", kata.capitalize("codewarriors", new int[]{5}));

    }
}