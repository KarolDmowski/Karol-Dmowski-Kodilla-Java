package rps.winningCondition;

public class Scissors implements WinningCondition {
    private final String name = "Scissors";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean beatsPlayer(WinningCondition winningCondition) {
        if (winningCondition.getName() != "Paper") {
            return false;
        }
        return true;
    }
}
