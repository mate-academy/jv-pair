package core.basesyntax;

import java.util.Objects;

class Pair<T, N> {
    private T firstType;
    private N secondType;

    public Pair(T firstType, N secondType) {
        this.firstType = firstType;
        this.secondType = secondType;
    }

    public static <T, N> Pair of(T first, N second) {
        return new Pair(first, second);
    }

    public T getFirst() {
        return firstType;
    }

    public N getSecond() {
        return secondType;
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
        return Objects.equals(firstType, pair.firstType)
                && Objects.equals(secondType, pair.secondType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstType, secondType);
    }
}