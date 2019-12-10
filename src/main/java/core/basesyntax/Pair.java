package core.basesyntax;

import java.util.Objects;

class Pair<T, K> {
    private T first;
    private K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public K getSecond() {
        return second;
    }

    public void setSecond(K second) {
        this.second = second;
    }

    public static <T, K> Pair of(T first, K second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        if (compare == null || getClass() != compare.getClass()) {
            return false;
        }
        Pair pair = (Pair) compare;
        return first.equals(((Pair) compare).first)
                && second.equals(((Pair) compare).second);
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hashCode(first) + 31 * Objects.hashCode(second);
    }
}
