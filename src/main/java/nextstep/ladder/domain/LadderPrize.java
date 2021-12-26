package nextstep.ladder.domain;

import java.util.Objects;

import nextstep.ladder.engine.Prize;

public class LadderPrize implements Prize {
    private final String result;

    private LadderPrize(final String result) {
        this.result = result;
    }

    public static LadderPrize of(final String result) {
        if (result == null || result.trim().isEmpty()) {
            throw new IllegalArgumentException("invalid result: cannot be null or empty");
        }
        return new LadderPrize(result.trim());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LadderPrize other = (LadderPrize) o;
        return Objects.equals(result, other.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        return result;
    }
}