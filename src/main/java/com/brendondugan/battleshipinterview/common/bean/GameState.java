package com.brendondugan.battleshipinterview.common.bean;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class GameState {
    private final int turnNumber;
    private final int hitsScored;
    private final int hitsTaken;
    private final int shipsRemaining;
    private final int enemyShipsRemaining;
}
