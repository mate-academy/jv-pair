package core.basesyntax;

class Pair<F, S> {
    F firstPair;
    S secondPair;

    private Pair(F firstPair, S secondPair) {
        this.firstPair = firstPair;
        this.secondPair = secondPair;
    }

    public F getFirst() {
        return firstPair;
    }

    public S getSecond() {
        return secondPair;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pair<F, S> pair = (Pair) obj;

        return (firstPair == pair.firstPair || firstPair != null && firstPair
                .equals(pair.firstPair))
                && (secondPair == pair.secondPair || secondPair != null && secondPair
                .equals(pair.secondPair));
    }

    @Override
    public int hashCode() {
        int result = 17;

        if (firstPair != null) {
            result = 31 * result + firstPair.hashCode();
        }

        if (secondPair != null) {
            result = 31 * result + secondPair.hashCode();
        }

        return result;
    }

    static <F, S> Pair of(F f, S s) {
        return new Pair(f, s);
    }
}
