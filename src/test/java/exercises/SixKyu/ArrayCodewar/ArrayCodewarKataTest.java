package exercises.SixKyu.ArrayCodewar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCodewarKataTest {

    ArrayCodewarKata kata;

    @BeforeEach
    void setUp() {
        kata = new ArrayCodewarKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    @DisplayName("long array")
    void codewarResult() {
        int[] codewarrior = {2,1,3,1,1,3,3,2,3,1,1,1,3,1,3,1,3,3,1,2,3,3,1,3};
        int[] opponent =    {4,4,1,4,3,1,4,4,3,2,1,2,1,3,3,1,4,4,3,2,3,2,4,1};
        assertEquals("Stalemate", kata.codewarResult(codewarrior, opponent));
    }

    @Test
    @DisplayName("the same array")
    void codewarResultSd() {
        int[] codewarrior = {1, 1, 1, 1};
        int[] opponent = {1, 1, 1, 1};
        assertEquals("Stalemate", kata.codewarResult(codewarrior, opponent));
    }
}