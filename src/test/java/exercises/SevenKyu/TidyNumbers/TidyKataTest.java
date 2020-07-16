package exercises.SevenKyu.TidyNumbers;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TidyKataTest {


    @Test
    public void Check_Larger_Values() {
        Assertions.assertFalse(TidyKata.tidyNumber(1024));
        Assertions.assertFalse(TidyKata.tidyNumber(12576));
        Assertions.assertTrue(TidyKata.tidyNumber(13579));
        Assertions.assertTrue(TidyKata.tidyNumber(2335));

    }
}