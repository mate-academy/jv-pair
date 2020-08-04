package core.basesyntax;

class Pair<I, S> {
    private I first;
    private S second;

    private Pair(I first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <I, S> Pair<I, S> of(I n, S s) {
        return new Pair<I, S>(n, s);
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
        int result = 17;
        result = 31 * result + (first != null ? first.hashCode() : 0);
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !obj.getClass().equals(Pair.class)) {
            return false;
        }

        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return first == null ? first == pair.first
                : first.equals(pair.first)
                && (second == null || pair.second == null) ? second == pair.second
                : second.equals(pair.second);
    }
}
