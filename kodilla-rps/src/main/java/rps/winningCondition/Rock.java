package rps.winningCondition;

public class Rock implements WinningCondition{
    private final String name = "Rock";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean beatsPlayer(WinningCondition winningCondition) {
        if (winningCondition.getName() != "Scissors") {
            return false;
        }
        return true;
    }
}
