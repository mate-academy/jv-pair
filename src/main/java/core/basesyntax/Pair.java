package core.basesyntax;

import java.util.Objects;

class Pair<T, F> {
    private T first;
    private F second;

    private Pair(T first, F second) {
        this.first = first;
        this.second = second;

    }

    public T getFirst() {
        return first;
    }

    public F getSecond() {
        return second;
    }

    public static Pair of(Object o1, Object o2) {
        return new Pair(o1, o2);
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null || getClass() != ob.getClass()) {
            return false;
        }
        Pair<T, F> pair = (Pair<T, F>) ob;
        return Objects.equals(first, pair.first)
                && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + (first != null ? first.hashCode() : 0);
        result = 31 * result + (second != null ? first.hashCode() : 0);

        return result;
    }
}


