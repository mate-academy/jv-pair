package core.basesyntax;


class Pair<T, V> {
    private T first;
    private V second;

    public static <T, V> Pair of(T t, V v) {
        return new Pair(t, v);
    }

    public Pair(T t, V v) {
        this.first = t;
        this.second = v;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
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
        Pair<T, V> pair = (Pair) o;
        return pair.getFirst().equals(this.first)
                && pair.getSecond().equals(this.second);
    }

    @Override
    public int hashCode() {
        return 31 * first.hashCode() + second.hashCode();
    }
}
