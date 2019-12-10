package core.basesyntax;

import java.util.Objects;

class Pair<T, V> {
    private T firstElement;
    private V secondElement;

    private Pair(T i, V s) {
        this.firstElement = i;
        this.secondElement = s;
    }

    public T getFirst() {
        return firstElement;
    }

    public V getSecond() {
        return secondElement;
    }

    public static <T, V> Pair of(T firstElement, V secondElement) {
        return new Pair<>(firstElement, secondElement);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(firstElement, pair.firstElement)
                && Objects.equals(secondElement, pair.secondElement);
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(firstElement, secondElement);
    }
}
