package rps;

import rps.player.Human;
import rps.player.NPC;
import rps.winningCondition.Rock;

public class Game {
    private int pointsToWin = 10;

    public void gameWinCheck(Human human, NPC npc){
        if(human.getHumanPoints() == pointsToWin){
            System.out.println("Human WON");
            //END GAME
        } else if (npc.getNpcPoints() == pointsToWin){
            System.out.println("NPC WON");
            //END GAME
        }
    }

    public void theGAME(){
        Human human = new Human();
        NPC npc = new NPC();

        while(npc.getNpcPoints() < pointsToWin && human.getHumanPoints() < pointsToWin) {
            human.setWinningCondition(new Rock());
            npc.setWinningCondition();

            human.getWinningCondition().beatsPlayer(npc.getWinningCondition());
            npc.getWinningCondition().beatsPlayer(human.getWinningCondition());

            System.out.println("rock vs " + npc.getWinningCondition().getName());
            human.setRoundWon(npc);
            npc.setRoundWon(human);

            human.addRoundPoint();
            npc.addRoundPoint();
        }
        System.out.println("Human points: " + human.getHumanPoints() + "; NPC points: " + npc.getNpcPoints());
    }
}
