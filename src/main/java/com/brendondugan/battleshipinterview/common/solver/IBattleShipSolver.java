package com.brendondugan.battleshipinterview.common.solver;

import com.brendondugan.battleshipinterview.common.bean.Coordinate;
import com.brendondugan.battleshipinterview.common.bean.FireResult;
import com.brendondugan.battleshipinterview.common.bean.GameState;

public interface IBattleShipSolver {
    /**
     * This method provides the opportunity to initialize any values in your solver that you might need, and will be
     * executed once before the first turn
     */
    void init();

    /**
     * This method provides an opportunity to see the current state of the game before selecting the next target
     * @param gameState Holds the current state of the game
     */
    void preFire(GameState gameState);

    /**
     * This method allows you to execute any logic you would like to select the next target
     * @return The coordinates of the next target
     */
    Coordinate aim();

    /**
     * This method provides the results of your last shot
     * @param fireResult The result of the last shot. You can check to see if it was a hit and whether or not a ship was sunk
     */
    void postFire(FireResult fireResult);
}
