package core.basesyntax;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pair<T, K> pair = (Pair<T, K>) o;

        if (!Objects.equals(first, pair.first)) {
            return false;
        }
        return Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }

    public static <T, K> Pair of(T first, K second) {
        return new Pair(first, second);
    }
}
