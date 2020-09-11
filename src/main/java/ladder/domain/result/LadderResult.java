package ladder.domain.result;

import java.util.Objects;

public class LadderResult {
    private final String playerName;
    private final String rewardPrize;

    private LadderResult(String playerName, String rewardPrize) {
        this.playerName = playerName;
        this.rewardPrize = rewardPrize;
    }

    public static LadderResult of(String playerName, String rewardPrize) {
        return new LadderResult(playerName, rewardPrize);
    }

    public String getRewardPrize() {
        return rewardPrize;
    }

    public boolean isEqualsName(String name) {
        return playerName.equals(name);
    }

    @Override
    public String toString() {
        return playerName + " : " + rewardPrize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LadderResult that = (LadderResult) o;
        return Objects.equals(playerName, that.playerName) &&
                Objects.equals(rewardPrize, that.rewardPrize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, rewardPrize);
    }
}