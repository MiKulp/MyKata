package exercises.ExcersisesWithTDD.SevenKyu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumMultipleTest {
    MaximumMultiple multiple;


    @DisplayName("positive test")
    @Test
    void maxMultiple() {
        assertThat(MaximumMultiple.maxMultiple(10, 50)).isEqualTo(50);
        assertThat(MaximumMultiple.maxMultiple(37, 200)).isEqualTo(185);
        assertThat(MaximumMultiple.maxMultiple(7, 100)).isEqualTo(98);
        assertThat(MaximumMultiple.maxMultiple(7, 17)).isEqualTo(14);

    }


}