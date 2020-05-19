package exercises.ExcersisesWithTDD.SevenKyu.MaximumTripetSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class MaximumTDDkataTest {

    @Test
    void maxTriSum() {
       assertThat(MaximumTDDkata.maxTriSum(new int[] {2,9,13,10,5,2,9,5})).isEqualTo(32);
       assertThat(MaximumTDDkata.maxTriSum(new int[] {2,1,8,0,6,4,8,6,2,4})).isEqualTo(18);
       assertThat(MaximumTDDkata.maxTriSum(new int[] {-14,-12,-7,-42,-809,-14,-12})).isEqualTo(-33);
       assertThat(MaximumTDDkata.maxTriSum(new int[] {-7,12,-7,29,-5,0,-7,0,0,29})).isEqualTo(41);
    }
}