package exercises.EightKyu.Welcome;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeKataTest {

    WelcomeKata welcome;

    @BeforeEach
    void setUp() {
        welcome = new WelcomeKata();
    }

    @AfterEach
    void tearDown() {
        welcome = null;
    }

    @Test
    void greet() {
        assertEquals("Welkom", welcome.greet("dutch"));
        assertEquals("Welcome", welcome.greet("english"));
        assertEquals("Welcome", welcome.greet("elseLanguage"));
    }
}