package exercises.SixKyu.Encrypt;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptKataTest {
    private EncryptKata encryptKata;

    @BeforeEach
    void setUp() {
        encryptKata = new EncryptKata();
    }

    @AfterEach
    void tearDown() {
        encryptKata = null;
    }

    @DisplayName("Strings with less than 3 letters")
    @Test
    void encryptFirst() {
    assertEquals("105n",encryptKata.encryptThis("in"));
    assertEquals("97n",encryptKata.encryptThis("an"));
    }

    @DisplayName("Strings with exactly 3 letters")
    @Test
    void encryptSecond() {
        assertEquals("111dl",encryptKata.encryptThis("old"));
        assertEquals("111ka",encryptKata.encryptThis("oak"));
    }

    @DisplayName("Strings with more than 3 letters")
    @Test
    void encryptThird() {
        assertEquals("115eokp",encryptKata.encryptThis("spoke"));
        assertEquals("104dare",encryptKata.encryptThis("heard"));
    }

    @DisplayName("Random sentences")
    @Test
    void encryptFourth() {
        assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka",encryptKata.encryptThis("A wise old owl lived in an oak"));
        assertEquals("",encryptKata.encryptThis(""));
    }
}