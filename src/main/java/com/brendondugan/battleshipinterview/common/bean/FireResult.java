package com.brendondugan.battleshipinterview.common.bean;

import lombok.Data;

@Data
public class FireResult {
    private final Coordinate coordinate;
    private final boolean hit;
    private final boolean sunk;
    private final Ship sunkShip;

    public FireResult(Coordinate coordinate, boolean hit, Ship sunkShip) {
        this.coordinate = coordinate;
        this.hit = hit;
        this.sunk = true;
        this.sunkShip = sunkShip;
    }

    public FireResult(Coordinate coordinate, boolean hit) {
        this.coordinate = coordinate;
        this.hit = hit;
        this.sunk = false;
        this.sunkShip = null;
    }
}
