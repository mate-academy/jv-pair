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

    static <F,S> Pair of(F first, S second) {
        return new Pair(first,second);
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
        if (!(o instanceof Pair)) {
            return false;
        }

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (firstValue != null ? !firstValue.equals(pair.firstValue)
                : pair.firstValue != null) {
            return false;
        }
        return secondValue != null ? secondValue.equals(pair.secondValue)
                : pair.secondValue == null;
    }
}

