package core.basesyntax;

import java.util.Objects;

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

    public static <T, S> Pair of(T firstElem, S secondElem) {
        return new Pair<>(firstElem, secondElem);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T, S> pair = (Pair<T, S>) o;
        return Objects.equals(first, pair.first)
              && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return 31 * (first == null ? 11 : 13 * first.hashCode()
                 + (second == null ? 13 : 17 * second.hashCode()));
    }
}
