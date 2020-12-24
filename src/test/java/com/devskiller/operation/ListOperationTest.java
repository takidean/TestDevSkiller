package com.devskiller.operation;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class ListOperationTest {

    @Test
    public void shouldReturnZeroIfStringsWithNoIntegers() {
        // given
        ListOperation listOperation = new ListOperation();
        List<String> stringsWithoutIntegers = asList(
                "Mama always said life was like a box of chocolates.",
                "You never know what you're gonna get.");

        // when
        int actualSum = listOperation.sumInts(stringsWithoutIntegers);

        // then
        assertEquals("actual sum should be 0 for non-integer list of strings", 0, actualSum);
    }

    @Test
    public void shouldReturnSumIfStringsWithIntegers() {
        // given
        ListOperation listOperation = new ListOperation();
        List<String> stringsWithIntegers = asList(
                "3 were given to the Elves, immortal, wisest and fairest of all beings.",
                "7, to the Dwarf lords, great miners and craftsmen of the mountain halls.",
                "And 9, 9 rings were gifted to the race of Men, who above all else, desire power.");

        // when
        int actualSum = listOperation.sumInts(stringsWithIntegers);

        // then
        assertEquals("actual and expected sum not equal to 28", 28, actualSum);
    }

    @Test
    public void shouldReturnZeroIfNullPassed() {
        // given
        ListOperation listOperation = new ListOperation();

        // when
        int actualSum = listOperation.sumInts(null);

        // then
        assertEquals("actual sum should be 0 for null", 0, actualSum);
    }

}
