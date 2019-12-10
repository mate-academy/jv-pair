package core.basesyntax;

class Pair<T, K> {

    T first;
    K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    public static <T, K> Pair of(T first, K second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Pair pair = (Pair) object;
        return this.first.equals(pair.first) && this.second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        return 31 * (this.first.hashCode() ^ this.second.hashCode());
    }
}
