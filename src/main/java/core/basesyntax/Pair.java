package core.basesyntax;

class Pair<T, K> {
    T first;
    K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public static <T, K> Pair<T, K> of(K first, T second) {
        return new Pair(first, second);
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
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
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return first == pair.first && second == pair.second;
    }

    @Override
    public int hashCode() {
        return first.hashCode() ^ second.hashCode() * 31;
    }
}
