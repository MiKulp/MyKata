package exercises.SevenKyu.ResponsibleDrinking;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResponsibleDrinkingKataTest {

    ResponsibleDrinkingKata kata;

    @BeforeEach
    void setUp() {
        kata = new ResponsibleDrinkingKata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    void hydrateTestFt() {
        Assert.assertEquals ("1 glass of water", kata.hydrate("1 glass of wine"));
        Assert.assertEquals ("10 glasses of water", kata.hydrate( "1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"));

    }
}