package core.basesyntax;

class Pair<T, S> {
    private T first;
    private S second;

    private Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <T, S> Pair of(T first, S second) {
        return new Pair<T, S>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pair<T, S> pair = (Pair) o;

        return (pair.getFirst() == this.first
                || (pair.getFirst() != null && pair.getFirst().equals(this.first)))
                && (pair.getSecond() == this.second
                || (pair.getSecond() != null && pair.getSecond().equals(this.second)));
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
