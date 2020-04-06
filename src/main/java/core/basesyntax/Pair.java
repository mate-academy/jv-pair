package core.basesyntax;

import java.util.Objects;

class Pair<F, S> {
    private F firstValue;
    private S secondValue;

    private Pair(F firstValue, S secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(firstValue, pair.firstValue)
                && Objects.equals(secondValue, pair.secondValue);
    }

    @Override
    public int hashCode() {
        int result = 1;
        if (firstValue != null) {
            result = 31 * result + firstValue.hashCode();
        }
        if (secondValue != null) {
            result = 31 * result + secondValue.hashCode();
        }
        return result;
    }

    public F getFirst() {
        return firstValue;
    }

    public S getSecond() {
        return secondValue;
    }
}
