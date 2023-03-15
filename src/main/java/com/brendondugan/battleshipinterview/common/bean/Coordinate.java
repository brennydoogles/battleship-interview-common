package com.brendondugan.battleshipinterview.common.bean;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Coordinate {
    private final int column;
    private final int row;
    private static final String columns = "ABCDEFGHIJ";
    public static Coordinate fromString(String coordinate) throws IllegalArgumentException {
        if (coordinate.length() < 2 || coordinate.length() > 3 || !coordinate.matches("[A-J](\\d|10)$")) {
            throw new IllegalArgumentException("The coordinate you have passed in is out of bounds.");
        }
        int row = Integer.parseInt(coordinate.substring(1));
        int column = columns.indexOf(coordinate.charAt(0)) + 1;
        return new Coordinate(column, row);
    }
    @Override
    public String toString() {
        return String.format("%c%d", columns.charAt(column - 1), row);
    }
}
