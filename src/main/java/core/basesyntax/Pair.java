package core.basesyntax;

class Pair<I,S> {
    private I first;
    private S second;

    private Pair(I first, S second) {
        this.first = first;
        this.second = second;
    }

    public I getFirst() {
        return first;
    }

    public S getSecond() {
        return second;

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object pair) {
        if (pair == this) {
            return true;
        }
        if (pair == null) {
            return false;
        }
        if (pair.getClass().equals(Pair.class)) {
            Pair pair1 = (Pair) pair;
            return (first == pair1.first || first != null && first.equals(pair1.first))
                    && (second == pair1.second || second != null && second.equals(pair1.second));
        }
        return false;
    }

    public static <I, S> Pair<I, S> of(I first, S second) {
        return new Pair<>(first,second);
    }
}
