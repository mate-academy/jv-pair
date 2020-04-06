package core.basesyntax;

import java.util.*;

class Pair<T, S> {
    private T firstObject;
    private S secondObject;

    private Pair(T firstObject, S secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public T getFirst() {
        return firstObject;
    }

    public S getSecond() {
        return secondObject;
    }

    static <T, S>Pair of(T firstObject, S secondObject) {
        return new Pair(firstObject, secondObject);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(firstObject, pair.firstObject) &&
                Objects.equals(secondObject, pair.secondObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstObject, secondObject);
    }
}
