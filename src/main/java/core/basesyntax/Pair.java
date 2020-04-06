package core.basesyntax;

import java.util.Objects;

class Pair<T, S> {
    private T type1;
    private S type2;

    private Pair(T type1, S type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    public T getFirst() {
        return type1;
    }

    public S getSecond() {
        return type2;
    }

    public static <T, S> Pair<T, S> of(T type1, S type2) {
        return new Pair<>(type1, type2);
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
        return Objects.equals(type1, pair.type1)
                && Objects.equals(type2, pair.type2);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result *= 31 + (type1 == null ? 0 : type1.hashCode());
        result *= 31 + (type2 == null ? 0 : type2.hashCode());
        return result;
    }
}
