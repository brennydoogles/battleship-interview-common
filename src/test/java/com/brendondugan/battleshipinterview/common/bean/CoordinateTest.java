package com.brendondugan.battleshipinterview.common.bean;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {
    @ParameterizedTest
    @ValueSource(strings = {"AA10", "A", "A11", "K1", "K11"})
    void testThatBadValuesResultInException(String input) {
        assertThrows(IllegalArgumentException.class, () -> {
            Coordinate.fromString(input);
        });
    }

    @Test
    public void fromStringWithSingleDigitRowNumber() {
        Coordinate coordinate = Coordinate.fromString("A4");
        assertEquals(1, coordinate.getColumn(), "The column should be 1");
        assertEquals(4, coordinate.getRow(), "The row should be 4");
    }

    @Test
    public void fromStringWithDoubleDigitRowNumber() {
        Coordinate coordinate = Coordinate.fromString("D10");
        assertEquals(4, coordinate.getColumn(), "The column should be 4");
        assertEquals(10, coordinate.getRow(), "The row should be 10");
    }
}