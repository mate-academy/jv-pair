package core.basesyntax;

import java.util.Objects;

class Pair<firstVar,secondVar> {
    private firstVar firstValue;
    private secondVar secondValue;

    private Pair(firstVar firstValue, secondVar secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <firstVar, secondVar> Pair<firstVar, secondVar> of(firstVar first, secondVar second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(firstValue, pair.firstValue) &&
                Objects.equals(secondValue, pair.secondValue);
    }

    @Override
    public int hashCode() {
        int result = 1;
        if (firstValue != null) result = 31 * result + firstValue.hashCode();
        if (secondValue != null) result = 31 * result + secondValue.hashCode();
        return result;
    }

    public firstVar getFirst() {
        return firstValue;
    }

    public secondVar getSecond() {
        return secondValue;
    }
}
