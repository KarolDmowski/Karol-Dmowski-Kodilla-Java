package rps.winningCondition;

public class Paper implements WinningCondition {
    private final String name = "Paper";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean beatsPlayer(WinningCondition winningCondition) {
        if (winningCondition.getName() != "Rock") {
            return false;
        }
        return true;
    }
}
