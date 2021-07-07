package core.basesyntax;

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
        Pair<F, S> other = (Pair) obj;
        return (firstValue == other.firstValue) || (firstValue != null
                && firstValue. equals(other.firstValue))
                && (secondValue == other.secondValue) || (secondValue != null
                && secondValue. equals(other.secondValue));
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
