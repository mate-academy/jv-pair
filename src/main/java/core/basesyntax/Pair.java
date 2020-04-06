package core.basesyntax;

import java.util.Objects;

class Pair<F, S> {
    private F firstValue;
    private S secondValue;

    private Pair(F firstValue, S secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <F, S> Pair of(F first, S second) {
        return new Pair<>(first, second);
    }

    public F getFirst() {
        return firstValue;
    }

    public S getSecond() {
        return secondValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Pair other = (Pair) obj;
        if ( (firstValue != null
                && !firstValue.equals(other.firstValue))
                || (other.firstValue != null
                && !other.firstValue.equals(firstValue)) ) {
            return false;
        }
        if ( (secondValue != null
                && !secondValue.equals(other.secondValue))
                || (other.secondValue != null
                && !other.secondValue.equals(secondValue)) ) {
            return false;
        }
        return true;
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
}
