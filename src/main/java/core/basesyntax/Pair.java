package core.basesyntax;

import java.util.Objects;

class Pair<T, K> {
    private T firstElement;
    private K secondElement;

    private Pair(T first, K second) {
        this.firstElement = first;
        this.secondElement = second;
    }

    public T getFirst() {
        return firstElement;
    }

    public K getSecond() {
        return secondElement;
    }

    public static <T, K> Pair of(T first, K second) {
        return new Pair(first, second);
    }

    @Override
    public boolean equals(Object pair) {
        if (this == pair) {
            return true;
        }
        if (pair == null || getClass() != pair.getClass()) {
            return false;
        }
        Pair<T, K> castPair = (Pair<T, K>) pair;
        return Objects.equals(firstElement, castPair.firstElement)
                && Objects.equals(secondElement, castPair.secondElement);
    }

    @Override
    public int hashCode() {
        return (31 * firstElement.hashCode()) + (31 * secondElement.hashCode());
    }

}

