package core.basesyntax;

import java.util.Objects;

class Pair<T, N> {
    private T first;
    private N second;

    private Pair(T first, N second) {
        this.first = first;
        this.second = second;
    }

    public static <T, N> Pair<T, N> of(T first, N second) {
        return new Pair<>(first, second);
    }


    public T getFirst() {
        return first;
    }

    public N getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

}
