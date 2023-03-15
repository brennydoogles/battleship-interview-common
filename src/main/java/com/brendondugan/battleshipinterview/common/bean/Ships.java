package com.brendondugan.battleshipinterview.common.bean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ships {
    public static final Ship CARRIER = new Ship("Carrier", 5);
    public static  final Ship BATTLESHIP = new Ship("Battleship", 4);
    public static  final Ship CRUISER = new Ship("Cruiser", 3);
    public static  final Ship SUBMARINE = new Ship("Submarine", 3);
    public static  final Ship DESTROYER = new Ship("Destroyer", 2);

    private static final Set<Ship> ships = Set.of(CARRIER, BATTLESHIP, CRUISER, SUBMARINE, DESTROYER);
    public static Set<Ship> getShips(){
        return ships;
    }
}
