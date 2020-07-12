package exercises.SevenKyu.SpecialNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialNumberKataTest {

    @Test
    public void Check_Single_Digit_Number()
    {
        assertEquals("Special!!", SpecialNumberKata.specialNumber(2));
        assertEquals("Special!!", SpecialNumberKata.specialNumber(3));
        assertEquals("NOT!!", SpecialNumberKata.specialNumber(9));
        assertEquals("NOT!!", SpecialNumberKata.specialNumber(7));
    }
    @Test
    public void Two_Digit_Number()
    {
        assertEquals("Special!!", SpecialNumberKata.specialNumber(23));
        assertEquals("NOT!!", SpecialNumberKata.specialNumber(79));
        assertEquals("Special!!", SpecialNumberKata.specialNumber(32));
        assertEquals("NOT!!", SpecialNumberKata.specialNumber(39));
        assertEquals("Special!!", SpecialNumberKata.specialNumber(55));

    }
    @Test
    public void Larger_Sepcial_Number()
    {
        assertEquals("Special!!", SpecialNumberKata.specialNumber(513));
        assertEquals("NOT!!", SpecialNumberKata.specialNumber(709));
        assertEquals("NOT!!", SpecialNumberKata.specialNumber(538));
        assertEquals("NOT!!", SpecialNumberKata.specialNumber(5920));

    }
    @Test
    public void Mega_Sepcial_Number()
    {
        assertEquals("Special!!", SpecialNumberKata.specialNumber(53532));
        assertEquals("NOT!!", SpecialNumberKata.specialNumber(970569));
        assertEquals("Special!!", SpecialNumberKata.specialNumber(11350224));

    }
}