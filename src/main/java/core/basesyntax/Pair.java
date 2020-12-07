package core.basesyntax;

class Pair<T, S> {
    private T first;
    private S second;

    private Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static <T, S> Pair<T, S> of(T first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object pair1) {
        if (pair1 == this) {
            return true;
        }
        if (pair1 == null) {
            return false;
        }
        if (pair1.getClass().equals(Pair.class)) {
            Pair<T, S> pair = (Pair<T, S>) pair1;
            return (first == null && pair.first == null
                   || first != null && first.equals(pair.getFirst()))
                   && (second == null && pair.second == null
                   || second != null && second.equals(pair.getSecond()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (getFirst() == null ? 0 : first.hashCode());
        result = 31 * result + (getSecond() == null ? 0 : second.hashCode());
        return result;
    }
}
