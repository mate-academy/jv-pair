package core.basesyntax;

class Pair<F, S> {

    private final F first;
    private final S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public int hashCode() {
        int hashcode = 7;
        hashcode = 11 * hashcode + (first == null ? 0 : first.hashCode());
        hashcode = 13 * hashcode + (second == null ? 0 : second.hashCode());
        return hashcode;
    }

    @Override
    public boolean equals(Object pair) {
        if (pair == null) {
            return false;
        }
        if (this == pair) {
            return true;
        }
        if (!(pair.getClass().equals(Pair.class))) {
            return false;
        }
        Pair<F, S> comparedPair = (Pair<F, S>) pair;
        return ((first == comparedPair.first
                || (first != null && first.equals(comparedPair.first)))
                && (second == comparedPair.second
                || (second != null && second.equals(comparedPair.second))));
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
