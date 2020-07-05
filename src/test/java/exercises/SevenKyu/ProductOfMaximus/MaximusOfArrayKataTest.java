package exercises.SevenKyu.ProductOfMaximus;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MaximusOfArrayKataTest {

    @DisplayName("Maximum product")
    @Test
    void maxProductFirst() {
        Assertions.assertEquals(20, MaximusOfArrayKata.maxProduct(new int[]{4,3,5}, 2));
        Assertions.assertEquals(720, MaximusOfArrayKata.maxProduct(new int[]{10,8,7,9}, 3));
        Assertions.assertEquals(288, MaximusOfArrayKata.maxProduct(new int[]{8,6,4,6}, 3));
    }

    @DisplayName("Check large vector size")
    @Test
    void maxProductSecond () {
        Assert.assertEquals(9600, MaximusOfArrayKata.maxProduct(new int[]{10,2,3,8,1,10,4}, 5));
        Assert.assertEquals(247895375, MaximusOfArrayKata.maxProduct(new int[]{13,12,-27,-302,25,37,133,155,-14}, 5));
    }

    @DisplayName("Negative values")
    @Test
    void maxProductThird () {
        Assert.assertEquals(4, MaximusOfArrayKata.maxProduct(new int[]{-4,-27,-15,-6,-1}, 2));
        Assert.assertEquals(136, MaximusOfArrayKata.maxProduct(new int[]{-17,-8,-102,-309}, 2));
    }

    @DisplayName("Mixture values")
    @Test
    void maxProductFourth () {
        Assertions.assertEquals(-30, MaximusOfArrayKata.maxProduct(new int[]{10,3,-27,-1}, 3));
        Assertions.assertEquals(-253344, MaximusOfArrayKata.maxProduct(new int[]{14,29,-28,39,-16,-48}, 4));
    }
}