package exercises.SevenKyu.RemoweDuplicateWords;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class RemoveWordsTest {

    RemoveWords removeWords;

    @BeforeEach
    void setUp() {
        removeWords = new RemoveWords();
    }

    @AfterEach
    void tearDown() {
        removeWords = null;
    }

    @DisplayName("test with cat")
    @Test
    void removeDuplicateWordsCat() {
        assertThat(RemoveWords.removeDuplicateWords("my cat is my cat fat")).isEqualTo("my cat is fat");
    }

    @DisplayName("test with null")
    @Test
    void removeDuplicateWordsNull() {
        assertThat(RemoveWords.removeDuplicateWords(null)).isEqualTo("");
    }

    @DisplayName("test with empty String")
    @Test
    void removeDuplicateWordsEmptyString() {
        assertThat(RemoveWords.removeDuplicateWords("")).isEqualTo("");
    }

}