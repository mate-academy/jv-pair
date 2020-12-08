package core.basesyntax;

class Pair<I, S> {
    private I first;
    private S second;

    private Pair(I first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <I, S> Pair of(I first, S second) {
        return new Pair(first, second);
    }

    public I getFirst() {
        return first;
    }

    public void setFirst(I first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public int hashCode() {
        int result = 23;
        result = 71 * result + (first == null ? 0 : first.hashCode());
        result = 71 * result + (second == null ? 0 : second.hashCode());
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
        if (!pair.getClass().equals(Pair.class)) {
            return false;
        }
        Pair castedPair = (Pair) pair;
        return (first == castedPair.first
                || (first != null && first.equals(castedPair.first)))
                && (second == castedPair.second
                || (second != null && second.equals(castedPair.second)));
    }
}
