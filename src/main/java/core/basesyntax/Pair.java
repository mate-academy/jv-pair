package core.basesyntax;

import java.util.Objects;

class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    private Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

   public static <T1, T2> Pair of(T1 first, T2 second) {
        return new Pair<>(t1, t2);
    }

    T1 getFirst() {
        return this.first;
    }

    T2 getSecond() {
        return this.second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T1, T2> pair = (Pair) o;
        return Objects.equals(first, pair.first)
                && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
