package rps.player;

import rps.winningCondition.WinningCondition;

public interface Player {
    void addRoundPoint();

    WinningCondition getWinningCondition();

}
