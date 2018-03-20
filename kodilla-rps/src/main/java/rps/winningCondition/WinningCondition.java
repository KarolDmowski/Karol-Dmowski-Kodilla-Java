package rps.winningCondition;

public interface WinningCondition {
    boolean beatsPlayer(WinningCondition winningCondition);

    String getName();
}
