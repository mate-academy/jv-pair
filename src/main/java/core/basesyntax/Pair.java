package core.basesyntax;

import java.util.Objects;

class Pair<F, S> {
    private F firstIncome;
    private S secondIncome;

    private Pair(F firstValue, S secondValue) {
        this.firstIncome = firstValue;
        this.secondIncome = secondValue;
    }

    public F getFirst() {
        return firstIncome;
    }

    public S getSecond() {
        return secondIncome;
    }

    public static <F, S> Pair of(F f, S s) {
        return new Pair(f, s);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Pair pair = (Pair) object;
        return Objects.equals(firstIncome, pair.firstIncome)
                && Objects.equals(secondIncome, pair.secondIncome);
    }

    @Override
    public int hashCode() {
        int result = 7;
        if (firstIncome != null) {
            result = 17 * result + firstIncome.hashCode();
        }
        if (secondIncome != null) {
            result = 17 * result + secondIncome.hashCode();
        }
        return result;
    }
}
