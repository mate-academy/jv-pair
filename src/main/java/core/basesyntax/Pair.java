package core.basesyntax;

class Pair<F, S> {
    private F firstValue;
    private S secondValue;

    private Pair(F firstValue, S secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public F getFirst() {
        return firstValue;
    }

    public S getSecond() {
        return secondValue;
    }

    public static <F, S> Pair of(F first, S second) {
        return new Pair<F, S>(first, second);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = getFirst().equals(null) ? result : 31 * getFirst().hashCode();
        result = getSecond().equals(null) ? result : 31 * getSecond().hashCode();

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass().equals(o)) {
            return false;
        }

        Pair<F,S> pair = (Pair) o;

        return (getFirst() == pair.getFirst() || getFirst() != null
                && getFirst().equals(pair.getFirst()))
                && (getSecond() == pair.getSecond() || getSecond() != null
                && getSecond().equals(pair.getSecond()));
    }
}

