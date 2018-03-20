package rps.player;

import rps.winningCondition.WinningCondition;

public class Human implements Player {
    private String name = "Player";
    private int humanPoints;
    private WinningCondition winningCondition;
    private boolean roundWon = false;

    public void setWinningCondition(WinningCondition winningCondition) {
        this.winningCondition = winningCondition;
    }
;
    public void setRoundWon(NPC npc) {
        this.roundWon = this.winningCondition.beatsPlayer(npc.getWinningCondition());
    }

    @Override
    public void addRoundPoint() {
        if (roundWon == true){
            humanPoints++;
            roundWon = false;
        }
        winningCondition = null;
    }

    public int getHumanPoints() {
        return humanPoints;
    }

    @Override
    public WinningCondition getWinningCondition() {
        return this.winningCondition;
    }
}
