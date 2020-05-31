package exercises.SixKyu.FoldAnArray;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FoldArrayKataTest {

    @DisplayName("only one step even")
    @Test
    public void foldArrayOneStepEven() {
        int[] input = new int[]{-9, 9, -8, 8, 66, 23};
        int[] expected = new int[]{14, 75, 0};

        assertEquals(Arrays.toString(expected), Arrays.toString(FoldArrayKata.foldArray(input, 1)));


    }

    @DisplayName("only one step odd")
    @Test
    public void foldArrayOneStepOdd() {

        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{6, 6, 3};

        assertEquals(Arrays.toString(expected), Arrays.toString(FoldArrayKata.foldArray(input, 1)));
    }

    @DisplayName("tests with odd list of numbers")
    @Test
    public void foldArrayOdd() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{6, 6, 3};

        assertEquals(Arrays.toString(expected), Arrays.toString(FoldArrayKata.foldArray(input, 1)));

        expected = new int[]{9, 6};
        assertEquals(Arrays.toString(expected), Arrays.toString(FoldArrayKata.foldArray(input, 2)));

        expected = new int[]{15};
        assertEquals(Arrays.toString(expected), Arrays.toString(FoldArrayKata.foldArray(input, 3)));
    }

    @DisplayName("tests with even list of numbers")
    @Test
    public void foldArrayEven() {
        int[] input = new int[]{-9, 9, -8, 8, 66, 23};
        int[] expected = new int[]{14, 75, 0};

        assertEquals(Arrays.toString(expected), Arrays.toString(FoldArrayKata.foldArray(input, 1)));
    }
}