package rps.player;

import rps.winningCondition.Paper;
import rps.winningCondition.Rock;
import rps.winningCondition.Scissors;
import rps.winningCondition.WinningCondition;

public class NPC implements Player {
    private String name = "NPC";
    private int npcPoints;
    private WinningCondition winningCondition;
    private boolean roundWon = false;

    public void setWinningCondition() {
        int val = (int)(Math.random()*3+1);
        if(val == 1){
            winningCondition = new Rock();
        } else if (val == 2) {
           winningCondition = new Paper();
        } else {
            winningCondition = new Scissors();
        }
    }

    public void setRoundWon(Human human) {
        roundWon = this.winningCondition.beatsPlayer(human.getWinningCondition());
    }

    @Override
    public void addRoundPoint() {
        if (roundWon == true){
            npcPoints++;
            roundWon = false;
        }
        winningCondition = null;
    }

    public int getNpcPoints() {
        return npcPoints;
    }

    @Override
    public WinningCondition getWinningCondition() {
        return this.winningCondition;
    }
}
